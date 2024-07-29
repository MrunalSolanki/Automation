public class ucaselcaseprint {

    public static void main(String[] args) {
        
        String s1 = " Hi I am Mrunal";
        String Upper = "";
        String lower = "";
        int UC = 0;
        int LC = 0;

        for(int i=1; i<s1.length(); i++){

            char ch = s1.charAt(i);

            if(ch>=65 && ch<=90){
            
                Upper = Upper+ch;
                UC++;
            }
            else{
                lower = lower+ch;
                LC++;
            }
        }
        System.out.println("upper case :" +Upper);
        System.out.println("Uppercase count is : " +UC);
        System.out.println("lower case : " +lower);
        System.out.println("Lowercase Count is : " +LC);
        System.out.println("UpperCase convert : " +s1.toUpperCase());
        System.out.println("Total count is : " +s1.length());
        System.out.println("Repeat String : " +s1.repeat(2));
    }
}
