public class App {
    public static void main(String[] args)  {
        Toyota myCar = new Toyota ("Logan", "Blue", "sedan", "petrol", "manual", 4, 1.6);
        
        iFillingStation fillingStation = (iFillingStation) new Car("bmw", "X5", "white", "hatchback", "electro", "auto", 4, 2.5);

        fillingStation.refuel("gasoline");

    }
}
