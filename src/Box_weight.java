import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box_weight extends Box {
    int wt;

    public Box_weight() {
//        super.l=1;
//        super.h=1;
//        super.w=1;
        this.wt = 1;
    }

    public Box_weight(int a, int b, int c, int d) {
        super(a, b, c);
//        this.wt=d;
    }


    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5};
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.valueOf(arr[i]);
        }
        var arrLst = new ArrayList<Integer>();
        String[] cou = {"sds", "dcsd", "asc"};
        List<String> intLis = Arrays.asList(cou);

        {
            System.out.println("S");
        }

        int i = 128534;
        boolean b = true;
        String s = "1235";
        String a1 = "";
        int n = Integer.parseInt(s);
        while (i > 0) {
            int d = i % 10;
            a1 = a1 + d;
            if (d == 0) {
                b = false;
                System.out.println("Duck nubner");
                break;
            }
            i = i / 10;
        }
        System.out.println(a1);
        if (b) {
            System.out.println("not a duck");
        }


        System.out.println(intLis);
        arrLst.add(1);
        arrLst.add(4);
        arrLst.add(3);
        arrLst.add(2);
        arrLst.add(5);
        for (Integer a : arrLst) {
            System.out.println(a);

        }
        System.out.println(arrLst);
        System.out.println(check(arrLst));
        System.out.println(arrLst);
        Object c1 = "Cha";
        Object c2 = "ndu";

        List<Object> ch_l = List.of(c1, c2);
//        addch(arrLst);
        addch(new ArrayList<Number>());
        ch(arrLst);
        che(arrLst);
//        ch(new ArrayList<Integer>());


        List<Constants> l = Arrays.asList(Constants.EXECUTING, Constants.PAUSED, Constants.PAUSING);


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    int t = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = t;
//                }
//            }

//        System.out.println(Arrays.toString(arr));
////        Box_weight b=new Box_weight();
//        b.fun();
//        Box_weight o=new Box_weight();
//        System.out.println(o.wt);
//        Box o2=new Box_weight(1,2,3,4);
//        System.out.println(o2.l);
//        Box_weight o3=new Box(1,2,3);
//        System.out.println(o2.l);

//
//        public void fun () {
//            System.out.println("Hello");
//        }

        Test1 obj1 = new Test1();
        Test2 obj2 = new Test2();
        Test3 obj3 = new Test3();


    }

    int r = 0;

    //        try {
//            r = obj1.display();
//        } catch (RuntimeException e) {
//            System.out.println("first catch was executed");
//            System.out.println(e.getMessage());
//
//        }
//        int b = 88;
//        System.out.println(r);
    public static int check(final List<Integer> t) {
        t.remove(3);
        System.out.println(t);
        return t.size();

    }


    public static void addch(List<? super Integer> list) {
//        for (int i = 0; i < 3; i++) {
//            list.add(i);
//        }
        for (Object a : list){
            System.out.println(a);
        }
            System.out.println(list);
    }

    public static <T> void ch(List<T> list){
        for (Object o:list){
//            String s=(String) o;
            System.out.println(o);
        }
    }
    public static void che(List<?> list){
        for (Object o:list){
//            String s=(String) o;
            System.out.println(o);
        }
    }


}


