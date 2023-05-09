package interface_segregation_principle.segregation2;

/**
 * 各个类建立自己的专用接口，而不是建立万能接口
 * 一个类不要去依赖它不需要的接口，就是类之间的依赖应该建立在最小接口上。
 */
public class Text {
    public static void main(String[] args) {
        A a = new A();
        a.a1(new B());
        a.a4(new B());
        a.a5(new B());
    }
}


interface InterfaceSegregationPrinciple1 {
    void operation1();
}

interface InterfaceSegregationPrinciple2 {
    void operation4();

    void operation5();
}

interface InterfaceSegregationPrinciple3 {
    void operation2();

    void operation3();
}

class B implements InterfaceSegregationPrinciple1, InterfaceSegregationPrinciple3 {

    @Override
    public void operation1() {
        System.out.println(111);
    }


    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }
}

class D implements InterfaceSegregationPrinciple1, InterfaceSegregationPrinciple2 {

    @Override
    public void operation1() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

class A {//依赖B

    public void a1(InterfaceSegregationPrinciple1 i) {
        i.operation1();
    }

    public void a4(InterfaceSegregationPrinciple3 i) {
        i.operation2();
    }

    public void a5(InterfaceSegregationPrinciple3 i) {
        i.operation3();
    }
}

class C {//依赖D

    public void c1(InterfaceSegregationPrinciple1 i) {
        i.operation1();
    }

    public void c2(InterfaceSegregationPrinciple2 i) {
        i.operation4();
    }

    public void c3(InterfaceSegregationPrinciple2 i) {
        i.operation5();
    }

}