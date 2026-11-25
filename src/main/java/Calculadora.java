public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Hola estudiantes del ITM - Version Inicial en Java");
        System.out.println("Resultado suma (5 + 3): " + calc.sumar(5, 3));
    }
}