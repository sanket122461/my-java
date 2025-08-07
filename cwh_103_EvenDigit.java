public class cwh_103_EvenDigit {
    public static void main(String[] args) {
        int[] arr={12,3,5,7,19,24,8};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
                System.out.println("even number found:" + arr[i]);
                System.out.println("total even numbers found so far:" + count);
            }

            if(i==arr.length-1){
                if(count==0){
                    System.out.println("no even number found in the array");
                }
                else{
                    System.out.println("total even numebr found in the array:" + count);
                }
                }
            }
        }
            }
        