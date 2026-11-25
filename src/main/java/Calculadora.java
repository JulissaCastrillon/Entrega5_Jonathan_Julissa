public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Hola estudiantes del ITM - Cambio 1");
        System.out.println("Suma (5 + 3): " + calc.sumar(5, 3));
        System.out.println("Resta (10 - 4): " + calc.restar(10, 4));
    }
}