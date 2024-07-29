public class TernaryOpt {

    public static void main(String[] args) {
        
        int n1=10, n2=5, max;

        System.out.println("n1 is: " +n1);
        System.out.println("n2 is: " +n2);

        max = (n1>n2)? (n1+n2): (n1-n2);
        
        System.out.println("Result:" +max);
    
    }
}
