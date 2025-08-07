public class cwh_101_linear_search {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=11;
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Elemeent Found at index:" + i);
                found =true;
                break; //Exit the loop once the elemnent is found
            }
            if(!found && i==arr.length-1){
                System.out.println("Element not Found in the array");


            }



        }
    }
    
}
