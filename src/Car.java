public class Car extends SpareParts {
    public Car (String modelName) {
        super(modelName, 4);
    }

    @Override
    public void classInterface() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}

