package lr7;

public class superClassTest {
//закрытое текстовое поле
    private String str1;
//конструктор с текстовым аргументом
    superClassTest(String strEx){
        this.str1=strEx;
    }
    superClassTest(){
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                "str 1 = " + this.getStr1();
    return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }
    public void getStr1(String str1){
        this.str1 = str1;
    }
}
