package program;

import java.io.*;
import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, IOException {

        Main main = new Main();
        MyClass myClass = new MyClass(1, "one");
        main.printToFile(myClass.getClass());

    }

    public void printToFile(Class c) throws IllegalAccessException, IOException {
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            Annotation[] annotations = f.getDeclaredAnnotations();
            for (Annotation a : annotations) {
                if (a.annotationType().equals(MyAnotation.class)) ;
                File file = new File("text.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true ));
                bufferedWriter.write(f.getType().getName() + " " + f.getName());
                bufferedWriter.newLine();
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }
    }
}

class MyClass {
    @MyAnotation
    int age;
@MyAnotation
    String name;

    public MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void method() {

    }
}

@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnotation {
    boolean check() default false;
}