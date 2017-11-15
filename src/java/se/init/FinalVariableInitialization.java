package java.se.init;

/**
 * Класс для демонстрации инициализации констант.
 * Для ознакомления
 */
public class FinalVariableInitialization {

   // final int i0; // err константа не проинициализирована
    final int i1=1;
    final int i2;
    final int i3;

    {
        i2 = 2;
    }

    public FinalVariableInitialization() {
        i3=3;
       // i2 = 6; err нельзя переопределять константы
    }

    private void newValue() {
        // i3 = 7; err
    }
}
