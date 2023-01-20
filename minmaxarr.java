public class minmaxarr {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,20};
        int temp =0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]> temp){
                temp = arr1[i];
            }else{
                temp = temp;
            }
        }
        System.out.println(temp);

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] < temp){
                temp = arr1[i];
            }else{
                temp = temp;
            }
        }
        System.out.println(temp);
    }
    
      
}
