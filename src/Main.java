public class Main {
    public static void main(String[] args) {
        AllCars[] allCar = {
                new Bicycle("Maxit"),
                new Car("Luxus"),
                new Truck("Daf", 8)
        };
        Car audi = new Car("Audi");
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(audi);
    }
}