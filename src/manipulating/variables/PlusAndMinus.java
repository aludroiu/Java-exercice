package manipulating.variables;

public class PlusAndMinus {
    public static void main(String[] args) {
        int zebrasInZoo = 6;
        int giraffesInZoo = 4;
        int animalsInZoo = zebrasInZoo + giraffesInZoo;

        //System.out.println(animalsInZoo);

        int numZebrasAfterTrade = zebrasInZoo--;
        System.out.println(numZebrasAfterTrade);

    }
}
