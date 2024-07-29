public class SCount {
    public static void main(String[] args)
    {  
        String s1="SoftwaRe Tester"; 
        String Ucase = "";
        String LCase = "";

        for (int i=0; i<s1.length(); i++) // interact with each charater
        {
            char ch = s1.charAt(i);  //The charAt() method returns the character at the specified index in a string
            if (ch>=65 && ch<=90) {
                Ucase = Ucase+ch;
            } 
            else 
            {
                LCase = LCase+ch;
        }
        System.out.println("SoftwaRe Tester");
        System.out.println("string length is: "+s1.length());
        System.out.println("Uppercase letters: " +Ucase);
        System.out.println("Lowercase letters: " + LCase);
    }
    }
}
