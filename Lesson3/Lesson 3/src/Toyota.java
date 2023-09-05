public class Toyota extends Car implements iPetrolCar{

    public Toyota(String model, String colour, String bodyStyle, String fuelType, String transmission,
            int wheelNumber, double engineVolume) {
        super("Toyota", model, colour, bodyStyle, fuelType, transmission, wheelNumber, engineVolume);

        self.bringsGoods = true;
    }

    public void areLightsOn(boolean is_light) {
        is_light = true;
    }
    // @Override
    // public boolean sweepStreet(boolean sweepStreet = true) {
    //     return super.sweepStreet(sweepStreet);
    // }

    @Override
    public void refuelWithPetrol() {

    }
}
