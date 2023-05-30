package lr7;

public class Example4 {
    class FirstClass {
        public char symbol;
        public FirstClass(char symbol) {
            this.symbol = symbol;
        }
        public FirstClass(FirstClass firstClass) {
            this.symbol = firstClass.symbol;
        }
    }

    class SecondClass extends FirstClass {
        public String text;
        public SecondClass(char symbol, String text) {
            super(symbol);
            this.text = text;
        }
        public SecondClass(SecondClass secondClass) {
            super(secondClass);
            this.text = secondClass.text;
        }
    }

    class ThirdClass extends SecondClass {
        public int number;
        public ThirdClass(char symbol, String text, int number) {
            super(symbol, text);
            this.number = number;
        }
        public ThirdClass(ThirdClass thirdClass) {
            super(thirdClass);
            this.number = thirdClass.number;
        }
    }

}
