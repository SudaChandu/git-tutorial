import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dog extends  Animal{
    public Dog(String name) {
        this.name =name;
//        super(name);
    }

    public Dog() {
        System.out.println("in dog default cons");

    }
    private void test() {
        System.out.println("im from chld()");
    }

    public static void main(String[] args) throws IOException {

        System.out.println("HI from main");
        HashMap<List<Integer>,Integer> m = new HashMap<>();
        m.put(Arrays.asList(1,2,3,4),1);
        m.put(Arrays.asList(1,6,7,8,0),1);
        int []a = new int[5];
        var s = "Sre";
        Dog d = new Dog();
        d.test();

        List<Integer> c_l= Arrays.asList(1,6,7,8);

        for (List<Integer> res : m.keySet()){
            if (res.equals(c_l) && m.containsKey(c_l)){
                m.put(c_l,m.get(c_l)+1);
            }
            else {
                m.put(res,1);
            }
        }

        System.out.println(m);

    }


    public static void m2 () throws IOException{

    }

    public static void m1() throws IOException{
        m2();

    }
}
