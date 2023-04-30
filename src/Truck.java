public class Truck extends SpareParts {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, 8);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void classInterface() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}

