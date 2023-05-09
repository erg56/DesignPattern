package single_responsibility_principle;

public class SingleResponsibilityPrinciple3 {
    public static void main(String[] args) {

    }
}

//在方法上遵守单一职责
class Vehicle {
    public void RoadVehicle(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }


    public void waterVehicle(String vehicle) {
        System.out.println(vehicle + "在水面上运行");

    }

    public void airVehicle(String vehicle) {
        System.out.println(vehicle + "在天空上运行");
    }
}



