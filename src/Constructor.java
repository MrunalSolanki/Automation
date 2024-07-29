public class Constructor {
    int x;
    public Constructor(){
        x = 6;
    }

    public static void main(String[] args) 
    {
        Constructor Con = new Constructor();
        System.out.println(Con.x);
    }

}
