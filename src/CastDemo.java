import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CastDemo {
    public static void main(String[] args) {

String sa ="sbur";
        System.out.println(sa.toString());
        Animal animal = new Animal("jimmy");
        Dog dog = new Dog();
        System.out.println("this is form main maethod");
//        dog.setName("sco");
////        AnimalUtility.printName(dog);
//        Animal animal = new Dog();
//        animal.setName("scobbb");
//        Dog dog1 = (Dog) animal;
//        AnimalUtility.printName(dog1);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> doub= t-> System.out.println(t*2);
        Consumer<Integer> tri= t-> System.out.println(t*3);
        Function<Integer,Integer> d= t-> t*2;
        Function<Integer,Integer> tr= t-> t*3;
        System.out.println(d.andThen(tr).apply(5));
        Check a =(c,b) -> {
            int r;
            Check f =CastDemo::funny;
            NewCheck n =CastDemo ::funn;
            n.chek(6);
            f.add(2,4);
            System.out.println("from lasm");
            return c+b;
        };
        a.add(2,3);
        String [] arr= {"HI","Hello"};
        Stream<String> streamOfWords = Arrays.stream(arr);
        List<String[]> collect = streamOfWords.map(w -> w.split("")).collect(Collectors.toList());
        System.out.println(collect.toString());
        for (String[] s :collect){
            for (String str:s){
                System.out.println(str);
            }
        }
        List<String > lst=Arrays.asList("sals","knf","sore");
        lst.stream().map(w->w.toUpperCase()).forEach(System.out::println);

//        streamOfLetters.flatMap(Arrays::stream).forEach(System.out::println);


//        Check f =CastDemo::fun;


    }
    public static int fun (int a,int b){
        System.out.println("from funb");
        return a+b;
    }

    public static int funny (int a,int b){
        System.out.println("from funbnnyyyyyy");
        return a+b;
    }

    public static int funn (int a){
        System.out.println("from funnn");
        return a;
    }





}


