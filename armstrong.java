import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
     int num1 = 0;
     int rem =0;
     int temp =num;
     while(num != 0){
      rem = num%10;
      num1 = num1 +(rem*rem*rem);
      num = num/10;

     }
    //  System.out.println(temp);
    //  System.out.println(num1);
     if(temp == num1){
      System.out.println(true);
     }else{
        System.out.println(false);
     }
    }
}
