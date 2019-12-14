package program;

public class TestClass {

    private int a = 1;

    private TestClass(int a) {
        this.a = a;
    }

    public TestClass() {
    }

    private void testMethod() {
        System.out.println("test method" + a);
    }
}
