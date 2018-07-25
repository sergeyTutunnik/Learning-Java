public class InnerClassExample {

    private String privateField = "Private value from outer"; // {0}


    public class InnerClass{

        int a = 0;
        //static int b = 0;  no static in inner
        final int c = 0;
        private int d = 0;

        private String privateField = "Private value from inner"; // {1}

        public void test(){

            String privateField = "value from local";  //{2}

            System.out.println("=Testing Inner=");
            System.out.println(privateField);
            System.out.println(this.privateField); // the value {1} is shadowed by {2}
            System.out.println(InnerClassExample.this.privateField); // the value {0} is shadowed by {1} & {2}
        }

    }


}
