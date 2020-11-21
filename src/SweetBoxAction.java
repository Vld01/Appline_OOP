import Sweets.Sweet;

import java.util.List;

public interface SweetBoxAction {
    void add(Sweet... sweets);
    void delete(int id);
    void delete();
    void printWeight();
    void printPrice();
    void printAllSweets();
    void optimzationWeightGift(int weight);
    void optimzationPriceGift(int weight);
}
