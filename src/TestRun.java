import java.util.*;

public class TestRun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entera num");
        Dog d =new Dog();
        int n1 =s.nextInt();
        Map<String,Integer> m=new HashMap<>();
        var set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(11);
        set.add(12);
        for (int g : set){
            System.out.println(g);
        }
        if (false) {
            try {
                int res = 10 / n1;
                System.out.println("in try blocl");
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("in finally bloc");
            }


        }
        StringBuffer str=new StringBuffer();
        while(n1>0){
            int r =n1%2;
            str.append(r);
            n1=n1/2;
        }
        System.out.println(str.reverse().toString());
        String ns =str.toString();

int[] arr = new int[9];
for (int i=0;i<ns.length();i++){
    System.out.println(ns.charAt(i));
}
        System.out.println("enter a num");
        int num=s.nextInt();
        int og=num;
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }

        System.out.println(num);
        if (og%sum==0){
            System.out.println("nivern num");
        }
        List<String> fN = new LinkedList<>();
        fN.add("Pizza");
        fN.add("Burger");
        fN.add("Salad");
        for (String st :fN){
            System.out.println(st);
        }


    }
}
