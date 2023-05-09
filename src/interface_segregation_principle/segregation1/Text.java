package interface_segregation_principle.segregation1;

public class Text {
    public static void main(String[] args) {
        A a = new A();
        a.a1(new B());
    }
}

interface InterfaceSegregationPrinciple {

    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements InterfaceSegregationPrinciple {

    @Override
    public void operation1() {
        System.out.println("B实现接口1方法");

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

class D implements InterfaceSegregationPrinciple {

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    @Override
    public void operation3() {

    }

    @Override
    public void operation4() {

    }

    @Override
    public void operation5() {

    }
}

class A {//A类通过方法（参数定义接口对象）依赖接口依赖B，但只用到1，2，3方法

    public void a1(InterfaceSegregationPrinciple i) {
        i.operation1();
    }

    public void a2(InterfaceSegregationPrinciple i) {
        i.operation2();
    }

    public void a3(InterfaceSegregationPrinciple i) {
        i.operation3();
    }
}

class C {//C类通过方法依赖接口依赖D，但只用到1，4，5方法

    public void c1(InterfaceSegregationPrinciple i) {
        i.operation1();
    }

    public void c4(InterfaceSegregationPrinciple i) {
        i.operation4();
    }

    public void c5(InterfaceSegregationPrinciple i) {
        i.operation5();
    }
}