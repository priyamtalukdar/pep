// only adds two same num;
public class addtwonum {
    public static void main(String[] args) {
        int num1=1234;
        int num2 =1111;
        int rem1=0;
        int rem2=0;
        int rem3=0;
        int newnum=0;
        int num =0;
        for(int i=0;i<=num1;i++){
           for(int j=0;j<=num2;j++){
            rem1= num1%10;
            rem2= num2%10;   
            num1= num1/10;
            num2= num2/10;
          
            newnum =10*newnum +(rem1+rem2);

           }  
           
        }
        System.out.println(newnum);

        for(int i=1;i<=newnum;i++){
            rem3 =newnum%10;
            newnum=newnum/10;
            num=10*num+rem3;
        }
        System.out.println(num);
    }
}
