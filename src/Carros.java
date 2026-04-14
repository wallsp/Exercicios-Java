public class Carros {

    static class Transporte {
        public void mover() {
            System.out.println("O transporte esta se movendo.");
        }
    }

    static class Carro extends Transporte {
        @Override
        public void mover() {
            System.out.println("O carro esta andando pelas ruas.");
        }
    }

    static class Bicicleta extends Transporte {
        @Override
        public void mover() {
            System.out.println("A bicicleta esta pedalando pela ciclovia.");
        }
    }

    static class Aviao extends Transporte {
        @Override
        public void mover() {
            System.out.println("O aviao esta voando no ceu.");
        }
    }

    public static void main(String[] args){

        Transporte t = new Transporte();
        Carro c = new Carro();
        Bicicleta b = new Bicicleta();
        Aviao a = new Aviao();

        t.mover();
        c.mover();
        b.mover();
        a.mover();
    }
}