package java.se.init;

/**
 *
 * Класс для демонстрации инициализации с учётом иерархии.
 * Выступает в качестве дочернего класса
 *
 */
public class ChildClassInitialization extends ParentClassInitialization {

    // обяъвление статической переменной
    public static String staticVariable = getValue();

    // блок статической инициализации
    static {
        getValue();
    }

    // обяъвление НЕ статической переменной
    public String nonStaticVariable = getValue();

    // блок нестатической инициализации
    {
        getValue();
    }


    public ChildClassInitialization() {
        getValue();
    }

    private static String getValue(int num) {
        System.out.println(num);
        return String.valueOf(num);
    }

    public  static void main(String... arg) {
        new ChildClassInitialization();
    }
}
