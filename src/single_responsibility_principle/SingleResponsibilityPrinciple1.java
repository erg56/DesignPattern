package single_responsibility_principle;

public class SingleResponsibilityPrinciple1 {
    public static void main(String[] args) {
        Vehicle1 vehicle = new Vehicle1();
        vehicle.run("车");
        vehicle.run("船");
        vehicle.run("飞机");
    }
}

/**
 * 违背单一职责
 *  对类来说的，就是一个类应该只负责一项职责。
 * 对方法来说，一个方法也只做一种事，或者一个类型的事
 */
class Vehicle1 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上跑");
    }
}