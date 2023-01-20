import java.util.*;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem =0;
        int num1 =0;

        while(num>0){
            rem = num %10;
            num1 = num1*10 +rem;
            num =num/10;

        }
        System.out.println(num1);
        }
    }
    

    // 1) write a program and check the palindrome number and armstrong number?
    // 2) write a program and rotate the number?
    //    input :- 123456 k=2
    //     output :- 561234
    // 3) Write a program and find the sum,max,min of an array?
    // 4) write a program and reverse the array?
    // 5) Write a program and find the missing number in array the number start from 0 to n?
    //   input 0,1,3
    //   output 2
    // 6) write a program and rotate the array?
    //    https://leetcode.com/problems/rotate-array/
    