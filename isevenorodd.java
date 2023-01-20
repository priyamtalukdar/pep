import java.util.*;
public class isevenorodd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num == 0){
        System.out.println("invalid");
    }
    if(num % 2 == 0){
     System.out.println("no is even");
    }else{
        System.out.println("no is odd");
    }
  }  
}
