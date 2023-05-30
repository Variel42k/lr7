package lr7;

public class Subclass extends Example2 {
    private int number;

    public Subclass(int number, String text) {
        super(text);
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        super.setText(text);
    }

    public void setNumberAndText(int number, String text) {
        this.number = number;
        super.setText(text);
    }
}
