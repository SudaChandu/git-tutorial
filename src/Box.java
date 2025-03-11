public class Box {

    int l;

    public int getL() {
        return l;
    }

    int h;
    int w;
    Box(){
//        this.l=11;
//        this.h=1;
//        this.w=1;
        System.out.println("parent constructor");
    }
    Box (int a,int b,int c){
        this.l=a;
        this.h=b;
        this.w=c;
    }
}
