import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem=0;
        int temp=num;
        int num1=0;
        while(num !=0){
          rem =num%10;
          num1= 10*num1 +rem;
          num=num/10;
          }

      
          if(temp == num1){
            System.out.println(true);

          }else{
            System.out.println();
          }
            }
        }
    

