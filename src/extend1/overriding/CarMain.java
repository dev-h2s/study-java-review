package extend1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectronicCar electronicCar = new ElectronicCar();
        electronicCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

    }

}
