public class StringWordCount {

    public static void main(String[] args) {
        String count = "Hi I am Mrunal";
        String count2 = "Hi I am Solanki";

        System.out.println("String count is : " +count.length());
        System.out.println("String count is : " +count.toLowerCase());
        System.out.println("String count is : " +count.repeat(4));
        System.out.println("String count is : " +count2.replace(count2, count2));
        System.out.println("String count is : " +count.startsWith(count2)); /*if we pass count then it's 
        true and for count2 it is flase*/
        System.out.println("Compare String : " +count.equals(count2)); //return false because thay are diff.
    }
}

// you just need to provide String and then print that String with +count.length()
