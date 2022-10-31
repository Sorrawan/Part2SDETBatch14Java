package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLiner");
        makeUpItem.add("lipstick");

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("shampoo");
        cosmetics.add("lotion");

        ArrayList<String> beautyProduct=new ArrayList<>();
        //"addAll" => add everything from makeUpItem to beautyProduct
        beautyProduct.addAll(makeUpItem);
        System.out.println(beautyProduct);
        beautyProduct.addAll(cosmetics);
        System.out.println(beautyProduct);
        beautyProduct.remove("lotion");    // "remove" => remove only specific item, can remove with name or index
        System.out.println(beautyProduct);   // no "lotion" will be in "beautyProduct" (ArrayList)
        beautyProduct.removeAll(cosmetics);  //
        System.out.println(beautyProduct);    // so All in "cosmetics that present inside it" will be removed.
        beautyProduct.clear();              // remove everything
        System.out.println(beautyProduct);

    }
}
