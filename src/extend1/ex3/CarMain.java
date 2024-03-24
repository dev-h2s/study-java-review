package extend1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectronicCar electronicCar = new ElectronicCar();
        electronicCar.move();
        electronicCar.charge();
        electronicCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
        hydrogenCar.move();
    }

}
