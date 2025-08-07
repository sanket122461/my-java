@FunctionalInterface
interface DemoAno{
    void meth1();
    // class HarryFunc implements DemoAno{
    //     @Override
    //     public void meth1(){
    //         System.out.println("this is method1");
    //     }
    // }
    //void meth2();
}

// class AnonyDemo implements DemoAno{
//     public void display(){
//         System.out.println("hello");
//     }
//     @Override
//     public void meth1(){
//         System.out.println("i am meth1");

//     }
//     @Override
//     public void meth2(){
        
//     }
// }
public class cwh_8_lambda {
    
    public static void main(String[] args) {
        // AnonyDemo obj =new AnonyDemo();
        // obj.meth1();//
        // DemoAno obj =new DemoAno() {//annooymnous class
        //     @Override
        //     public void meth1(){
        //         System.out.println("i am meth 1");

        //     }
        //     @Override
        //     public void  meth2(){
        //         System.out.println("i am meth2");

        //     }
        // };
        // obj.meth1();
        //lambda expression
        // DemoAno obj = new HarryFunc();
        // obj.meth1();
        DemoAno obj = ()->{
            System.out.println("i am method1 from this LAMBDAi");
        };

        obj.meth1();
    }
    
}
