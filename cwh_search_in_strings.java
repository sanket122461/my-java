public class cwh_search_in_strings {
    public static void main(String[] args){
        String str="Hello,welcome to the world of java programming";
        String target="java";
        boolean found =false;
        for(int i=0;i<str.length()-target.length()+1;i++){
            if(str.substring(i,i+target.length()).equals(target)){
                System.out.println("element Found at index:" + i);
                found=true;
                break;//Exit the loop once the elemnt is found

            }
            if(!found && i==str.length()-target.length()){
                System.out.println("element not found in the string");
                break;//exit the loop if we reach the end without finding the target
            }
        }
    }
    
}
