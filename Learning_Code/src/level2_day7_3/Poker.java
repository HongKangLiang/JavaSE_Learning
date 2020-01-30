package level2_day7_3;

public class Poker {
    private int number;
    private String suit;

    public Poker() {
    }

    public Poker(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
