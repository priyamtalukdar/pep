public class arrayrotate {

  static void  reverse(int n, int arr1[]){
  int start =0;
  int end = n-1;
  int temp;
  while(start<end){
     temp = arr1[start];
    arr1[start]= arr1[end];
    arr1[end] = temp;  
    start++;
    end--;
  }
  
  for(int j=0;j<n;j++){
    
   System.out.println(arr1[j]);
  }
 }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,22};
        reverse(arr.length,arr);
    }
}
