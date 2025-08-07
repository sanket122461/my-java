public class cwh_19_practice_problem {
    public static void main(String[] var0) {
        // System.out.println("hellow world");
        // //practice problem 1
        // float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        // float sum=0;
        // for(float element:marks){
        //     sum=sum + element;
        // }

        // System.out.println("the value of sum is " + sum);
        System.out.println("hellow world");
        //practice problem 2
    //     float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
    //     float num = 45.7f;
    //     boolean isInArray = false;
    //     for(float element:marks)
    //     {
    //         if(num==element) {
    //             isInArray = true;
    //             break;
    //         }
       

    //     // System.out.println("the value of sum is " + sum);
        
    // }
    // if(isInArray){
    //     System.out.println("the value is present in array");
    // }
    // else{
    //     System.out.println("the value is not present in array" );
    // }

    //practice problem 5//
    int [] arr ={1,21,3,4,5,54,47};
    int l =arr.length;
    int n = Math.floorDiv(l,2);
    int temp;
    for(int i=0;i<n;i++){
        temp=arr[i];
        arr[i]=arr[l-i-1];
        arr[l-i-1]=temp;

    }
    for(int element: arr){
        System.out.print(element+ "  ");
    }
    
    
    }
}
