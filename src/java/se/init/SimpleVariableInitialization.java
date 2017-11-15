package java.se.init;

/**
 * Класс для демонстрации инициализации переменных в классе
 */
public class SimpleVariableInitialization {

    // обяъвление статической переменной
    public static String staticVariable = getValue();

    // блок статической инициализации
    static {
        getValue();
    }

    // статические блоки иниц-ся в порядке объявления
    static {
        getValue();
    }
    public static String staticVariable2 = getValue(4);

    // обяъвление НЕ статической переменной
    public String nonStaticVariable = getValue(5);


    // блок нестатической инициализации
    {
        getValue();
    }


    public SimpleVariableInitialization() {
        getValue(8);
    }

    // блок нестатической инициализации
    {
        getValue();
    }

    private static String getValue(int num) {
        System.out.println(num);
        return String.valueOf(num);
    }

    public  static void main(String... arg) {
        new SimpleVariableInitialization();
    }

}
