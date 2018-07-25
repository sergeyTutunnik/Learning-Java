public class StaticNestedExample {


    private static String staticField = "Static value from outer";
    private String privateField = "Private value from outer";

    static class StaticNested{

        int a = 0;
        static int b = 0;
        final int c = 0;
        private int d = 0;

        public void test(){
            System.out.println("=Testing Static Nested=");
            System.out.println(staticField);
            //System.out.println(privateField);  can directly access only static

            StaticNestedExample staticNestedExample = new StaticNestedExample();
            System.out.println(staticNestedExample.privateField);
        }



    }
}
