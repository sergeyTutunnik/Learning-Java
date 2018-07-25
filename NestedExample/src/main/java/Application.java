public class Application {

    public static void main(String[] args){


        InnerClassExample innerClassExample = new InnerClassExample();
        InnerClassExample.InnerClass innerClass = innerClassExample.new InnerClass();
        innerClass.test();

        StaticNestedExample staticNestedExample = new StaticNestedExample();
        StaticNestedExample.StaticNested staticNested = new StaticNestedExample.StaticNested();
        staticNested.test();


    }
}
