public class cwh_102_Find_min {
    public static void main(String[] args) {
        int[] arr={12,3,5,7,19};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                System.out.println("new minimum Found:" +min);

            }
        }
    }
    
}
