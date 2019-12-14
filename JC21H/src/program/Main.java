package program;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        TestClass testClass = new TestClass();
        Class refClass = testClass.getClass();

        System.out.println("Fields:");
        Field[] fields = refClass.getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
            System.out.println(field.getInt(testClass));
            field.setInt(testClass,3);
            System.out.println(field.getInt(testClass));
        }

        System.out.println();
        System.out.println("Methods:");
        Method[] methods = refClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }
    }
}
