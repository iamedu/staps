public class Test {
    private int i = 0;

    public Test() {
        i = 0;
    }

    public static void main(String args[]) throws Exception {
        Test t = new Test();

        while(true) {
            t.test();
            Thread.sleep(1000);
        }
    }

    private void test() {
        System.out.println("Esta es la prueba " + i++);
    }



}
