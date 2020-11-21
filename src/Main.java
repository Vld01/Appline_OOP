import Sweets.Candy;
import Sweets.Chocolate;
import Sweets.Waffle;

public class Main {
    public static void main(String[] args) {
        SweetBox sweetBoxOne = new SweetBox();

        sweetBoxOne.add(new Candy(), new Chocolate(), new Chocolate(), new Waffle(), new Candy(), new Chocolate(), new Chocolate(), new Waffle(), new Chocolate(), new Waffle());
        System.out.println("Добавили в коробку 10 сладостей: \n");

        sweetBoxOne.printWeight();
        sweetBoxOne.printPrice();
        sweetBoxOne.printAllSweets();

//      Для тестирования
/*
        sweetBoxOne.delete();
        System.out.println("Удалили последнюю сладость");
        sweetBoxOne.printAllSweets();

        sweetBoxOne.delete(3);
        System.out.println("Удалили четвертую сладость");
        sweetBoxOne.printAllSweets();

        sweetBoxOne.optimzationPriceGift(55);
        System.out.println("Оптимизировали по цене и максимально допустимому весу:");
        sweetBoxOne.printAllSweets();

        sweetBoxOne.add(new Candy(), new Chocolate(), new Waffle());
        System.out.println("Добавили в коробку 3 сладости:");
        sweetBoxOne.printAllSweets();

        System.out.println("Оптимизировали по максимально допустимому весу:");
        sweetBoxOne.optimzationWeightGift(77);
        sweetBoxOne.printAllSweets();
 */
    }
}
