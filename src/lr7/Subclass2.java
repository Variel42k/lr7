package lr7;

public class Subclass2 extends Subclass1 {
    public String text;

    public Subclass2(int number, char character, String text) {
        super(number, character);
        this.text = text;
    }

    public void setNumberAndCharacterAndText(int number, char character, String text) {
        super.setNumberAndCharacter(number, character);
        this.text = text;
    }

    public String toString() {
        return "Subclass2: number=" + number + ", character=" + character + ", text=" + text;
    }
}
