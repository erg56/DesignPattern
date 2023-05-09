public class text {
    public static void main(String[] args) {
        C c=new C();
        c.c(new B());
    }
}
abstract class A{
    //独立
   abstract void cary();

}

class B extends A{
    void cary(){
        System.out.println("aa");
    }
}

class C{

    void c(A a){
        a.cary();
    }
}