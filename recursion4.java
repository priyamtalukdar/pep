public class recursion4 {

    static int add(int x, int y)    
{
    if(y==0)
        return x;
    else
        return(1+add(x,y-1));
}
    public static void main(String[] args) {
        int x =10;
        int y =20;
        
        System.out.println(add(x,y));
    }
}
