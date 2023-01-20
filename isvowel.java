import java.util.*;
public class isvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char val =sc.next().charAt(0);
       if(val ==  'a' || val == 'i' ||val == 'o' ||val =='e' ||val == 'u'){
         System.out.println("vowels");}
         else{
            System.out.println("consonants");
         }
       }
    }

