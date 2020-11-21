import Sweets.Sweet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SweetBox implements SweetBoxAction {
    private List<Sweet> sweets = new ArrayList<Sweet>();

    @Override
    public void add(Sweet... moreSweets) {
        sweets.addAll(Arrays.asList(moreSweets));
    }

    @Override
    public void delete(int index) {
        sweets.remove(index);
    }

    @Override
    public void delete() {
        sweets.remove(sweets.size() - 1);
    }

    private int getAllWeight(){
        return sweets.stream().mapToInt(Sweet::getWeight).sum();
    }

    @Override
    public void printWeight() {
        System.out.println("Общий вес подарка " + getAllWeight() + " грамм");
        System.out.println();
    }

    private int getAllPrice(){
        return sweets.stream().mapToInt(Sweet::getPrice).sum();
    }

    @Override
    public void printPrice() {
        System.out.println("Общая цена подарка " + getAllPrice() + " руб.");
        System.out.println();
    }

    @Override
    public void printAllSweets() {
        sweets.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public void optimzationWeightGift(int weight) {
        List<Sweet> sortedWeightGift = sweets.stream().
                sorted(Comparator.comparing(Sweet::getWeight)).
                        collect(Collectors.toList());
        while (sortedWeightGift.stream().mapToInt(Sweet::getWeight).sum() > weight) sortedWeightGift.remove(0 );
        sweets = sortedWeightGift;
    }

    @Override
    public void optimzationPriceGift(int weight) {
        List<Sweet> sortedPriceGift = sweets.stream().
                sorted(Comparator.comparing(Sweet::getPrice)).
                collect(Collectors.toList());
        while (sortedPriceGift.stream().mapToInt(Sweet::getWeight).sum() > weight) sortedPriceGift.remove(0 );
        sweets = sortedPriceGift;
    }
}
