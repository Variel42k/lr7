package lr7;

public class Subclass1 extends Example3 {
    public char character;

    public Subclass1(int number, char character) {
        super(number);
        this.character = character;
    }

    public void setNumberAndCharacter(int number, char character) {
        super.setNumber(number);
        this.character = character;
    }

    public String toString() {
        return "Subclass1: number=" + number + ", character=" + character;
    }
}
