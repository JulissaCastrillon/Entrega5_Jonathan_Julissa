import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.sumar(5, 3), "5 + 3 debe ser 8");
    }

        @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(5, 3), "5 * 3 debe ser 15");
    }
}