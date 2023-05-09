package single_responsibility_principle;

public class SingleResponsibilityPrinciple2 {
    public static void main(String[] args) {

    }
}
//在类上遵守单一职责
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水面上运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天空上运行");
    }
}
