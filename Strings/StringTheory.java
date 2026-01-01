public class StringTheory {
    public static void main(String[] args){

        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello"); 
        System.out.println(str1 == str2);  // True because strings are stored in string pool they are sharing the same address
        System.out.println(str3 == str4);  // False because strings are stored in heap and they have different addresses 
        
        
    System.out.println(str1.equals(str4)); // True ->  equals method it first compres the address if not same then it checks the string character by character
    }
}
