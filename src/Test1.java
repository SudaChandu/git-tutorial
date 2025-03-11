
public class Test1 {
    public int display(){
        try {

            Test2 t2=new Test2();
            t2.fun();
            System.out.println("Hello");
            return 2;
        }
        catch (RuntimeException e1){
            System.out.println("in catch block of test2 :"+e1.getMessage());

        }
        int a=8248;
        System.out.println(a);
        return 3;
    }

}
