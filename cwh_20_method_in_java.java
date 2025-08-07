public class cwh_20_method_in_java {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        System.out.println(c);
        //method invocation using object creation
        //cwh_20_method obj = new cwh_20_methods();
        //c=obj.logic(a,b);
    }
    
}
