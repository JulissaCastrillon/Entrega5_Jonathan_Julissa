import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.dividir(10, 5), "10 / 5 debe ser 2");
    }

    @Test
    public void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        }, "Debería lanzar una excepción al dividir por cero");
    }
}