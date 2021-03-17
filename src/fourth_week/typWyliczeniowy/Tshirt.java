package fourth_week.typWyliczeniowy;

public class Tshirt {
    public Tshirt(TshirtSize size) {
        this.size = size;
    }

    public enum TshirtSize{
        S,
        M,
        L,
        XL
    }
    private final TshirtSize size;

    public static void main(String[] args) {
        Tshirt tshirt;
    }
}
