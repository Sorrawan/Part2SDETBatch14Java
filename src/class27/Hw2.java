package class27;
//งง

import java.util.LinkedList;

public class Hw2 {

    /* Create a Card class that will have interest rate field and card type
       and a constructor that will initialize credit card type.
       Create 3 subclasses of the Card class.
       Create 3 objects of different card and store them into LinkedList.
       Using for loop/advanced for loop/ iterator access all methods of the class.
     */


    public static void main(String[] args) {
        LinkedList<Card> cards=new LinkedList<>();
        cards.add(new Card(10,"Credit card",2000));
        cards.add(new Card(15,"Credit card",25000));
        cards.add(new Card(20,"Credit card",100));

        for (Card card:cards
        ) {
            card.printBalance();
        }
    }
}
class Card{
    double interestRate;
    String cardType;
    double balance;

    public Card(double interestRate, String cardType, double balance) {
        this.interestRate = interestRate;
        this.cardType = cardType;
        this.balance=balance;
    }

    void printBalance() {
        System.out.println(balance);
    }
    @Override
    public String toString() {
        return "Card{" +
                "interestRate=" + interestRate +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
