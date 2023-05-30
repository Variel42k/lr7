package lr7;

public class Example5 {
    class SuperClass {
        protected String text;
        public SuperClass(String text) {
            this.text = text;
        }
        public void printClassNameAndFieldValue() {
            System.out.println(this.getClass().getSimpleName() + ": " + text);
        }
    }

    class FirstSubClass extends SuperClass {
        protected int number;
        public FirstSubClass(String text, int number) {
            super(text);
            this.number = number;
        }
        @Override
        public void printClassNameAndFieldValue() {
            System.out.println(this.getClass().getSimpleName() + ": " + text + ", " + number);
        }
    }

    class SecondSubClass extends SuperClass {
        protected char symbol;
        public SecondSubClass(String text, char symbol) {
            super(text);
            this.symbol = symbol;
        }
        @Override
        public void printClassNameAndFieldValue() {
            System.out.println(this.getClass().getSimpleName() + ": " + text + ", " + symbol);
        }
    }

    public class Main {
        public void main(String[] args) {
            SuperClass superClass1 = new FirstSubClass("text1", 1);
            SuperClass superClass2 = new SecondSubClass("text2", 'a');
            superClass1.printClassNameAndFieldValue();
            superClass2.printClassNameAndFieldValue();
            FirstSubClass firstSubClass = new FirstSubClass("text3", 3);
            firstSubClass.printClassNameAndFieldValue();
        }
    }

}
