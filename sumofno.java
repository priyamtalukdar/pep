import java.util.*;
public class sumofno{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum =0;
        int pro =1;
    int rem =0;
    while(num>0){
      rem = num%10;
      num = num/10;
      sum = sum+rem;
      pro = rem*pro;
    }
    System.out.println(sum);
    System.out.println(pro);
    }
}