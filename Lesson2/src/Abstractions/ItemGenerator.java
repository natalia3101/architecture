package Abstractions;
// абстракция класса фабрики.

public abstract class ItemGenerator {
    // метод взаимодействия с абстрактным продуктом
    public String openReward(){
        iGameItem gameItem = createItem();
        return gameItem.open();
    }
    //  метод созддания экземпляра продукта 
    public abstract iGameItem createItem();

}
