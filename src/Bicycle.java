public class Bicycle extends AllCars{
    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void classInterface() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}