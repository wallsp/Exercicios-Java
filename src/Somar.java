public class Somar {

    static class Calculadora {

        public int somar(int a, int b) {
            return a + b;
        }

        public double somar(double a, double b) {
            return a + b;
        }

        public int somar(int a, int b, int c) {
            return a + b + c;
        }

        public int multiplicar(int a, int b) {
            return a * b;
        }

        public double multiplicar(double a, double b) {
            return a * b;
        }
    }

    public static void main(String[] args){

        Calculadora calc = new Calculadora();

        System.out.println("Soma int (2 + 3): " + calc.somar(2, 3));
        System.out.println("Soma double (2.5 + 3.7): " + calc.somar(2.5, 3.7));
        System.out.println("Soma 3 ints (1 + 2 + 3): " + calc.somar(1, 2, 3));

        System.out.println("Multiplicação int (4 * 5): " + calc.multiplicar(4, 5));
        System.out.println("Multiplicação double (2.5 * 4.0): " + calc.multiplicar(2.5, 4.0));
    }
}