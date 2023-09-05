public class Car implements iCar, iElectroCar, iFillingStation{
    protected String brand, model, colour, bodyStyle, fuelType, transmission;
    protected int wheelNumber;
    protected double engineVolume;
    private boolean lightsOn;

    public Car(String brand, String model, String colour, String bodyStyle, String fuelType, String transmission,
            int wheelNumber, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.bodyStyle = bodyStyle;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.wheelNumber = wheelNumber;
        this.engineVolume = engineVolume;
    }

    protected String movement(){
        return "";
    }

    protected String maintainance(){
        return "";
    }

    public void changeTransmission(String transmission_mode){
    
    }

    public void areLightsOn(boolean is_light){

    }

    @Override
    public boolean sweepStreet(boolean sweepStreet) {
        return false;
    }
    public void refuel(String fuelType) {
        // Реализация заправки топливом
    }

    public void wipeWindshield() {
        // Реализация протирки лобового стекла
    }

    public void wipeHeadlights() {
        // Реализация протирки фар
    }

    public void wipeMirrors() {
        // Реализация протирки зеркал
    }

    @Override
    public void electroRechargable() {

    }


}
