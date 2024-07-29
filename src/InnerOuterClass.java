 class OuterClass {
    int a = 10;

class InnerClass {
    int b = 5;
}
}
public class InnerOuterClass{
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
    //OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.b + myOuter.a);
    }
}