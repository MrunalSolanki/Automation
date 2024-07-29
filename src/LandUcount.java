public class LandUcount {
    public static void main(String[] args) {
        
        String s2 = "Java Count";

        int lower = 0;
        int upper = 0;

        for(int i=0;i<s2.length();i++)
        {
            char ch = s2.charAt(i); //charAt is a string method we sue it to return character at the specified index
            if(ch>=65 && ch<=90)
            {
                upper++;
            }
            else{
                lower++;
            }
        }
        System.out.println("Lower  "+ lower);
        System.out.println("Upper  "+ upper);
    }

}
