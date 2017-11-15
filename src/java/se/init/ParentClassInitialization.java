package java.se.init;

/**
 * Класс для демонстрации инициализации с учётом иерархии.
 * Выступает в качестве родительсного класса
 */
public class ParentClassInitialization {

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


    public ParentClassInitialization() {
        getValue();
    }

    private static String getValue(int num) {
        System.out.println(num);
        return String.valueOf(num);
    }
}
