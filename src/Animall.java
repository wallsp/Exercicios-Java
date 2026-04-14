public class Animall {

    static class Animal {
        public void fazerSom() {
            System.out.println("Som de animal genérico");
        }
    }

    static class Cachorro extends Animal {
        @Override
        public void fazerSom() {
            System.out.println("O cachorro late: Au Au!");
        }
    }

    static class Gato extends Animal {
        @Override
        public void fazerSom() {
            System.out.println("O gato mia: Miau!");
        }
    }

    static class Vaca extends Animal {
        @Override
        public void fazerSom() {
            System.out.println("A vaca muge: Muuu!");
        }
    }

    public static void main(String[] args){

        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();

        for (Animal a : animais) {
            a.fazerSom();
        }
    }
}