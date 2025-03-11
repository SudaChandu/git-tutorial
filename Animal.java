import java.io.IOException;
import java.util.*;

public class Animal {
    String name;

    public Animal () {
        System.out.println("from def cons ver3");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("this is from crested constr");
    }

    public String getName() {
        return name;
    }

    private void test() {
        System.out.println("i'm form parjkebt pvt metoohodss");
    }

    public void setName(String name) {
        this.name = name;
    }


    static {
        System.out.println("this is form,mstatic blockl");
    }


    public static void main(String[] args) throws IOException {
        var n = Arrays.asList(1,3,4,5,3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENteyr a string");
        String str = scanner.nextLine();
        String[] ns= str.split(" ");
        boolean b = false;
        int c=0;
        for (int i=0;i<2050;i++){
            c++;
            if (c%1000 == 0){
                System.out.println("count:"+ c);
            }
        }

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(24);
        ll.add(424);
        System.out.println(ll);
        System.out.println(ll.get(2));
        int max=0;
        for(int i=0; i< n.size();i++){
            for (int j=i+1;j<n.size();j++){
                if (n.get(i)!=n.get(j)){
                int t = Math.abs(i-j);
               max=Math.max(t,max);
                }
            }
        }

        var arr = new int[]{2,2,1,1,1,2,2};
        int n1=arr.length;
        Map<Integer,Integer> m= new HashMap<>();
        for (int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        int fq=m.get(arr[0]);
        for (int i:m.keySet()){
            fq=Math.max(m.get(i),fq);
            if(m.get(i)>arr.length/2){
                System.out.println(i);
                break;
            }
        }

//        System.out.println(fq);
        System.out.println(m);
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        int [] a = {7,1,5,4};
        int l=a[0];
        int diff =0;
        for (int i=1;i<a.length;i++){
            if (a[i]>l){
                int t =a[i]-l;
                diff=Math.max(t,diff);
            }
            l=Math.min(l,a[i]);
        }
        System.out.println(diff);



    }
    public void eat(){

    }
}
