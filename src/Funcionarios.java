public class Funcionarios {

    static class Funcionario {
        private String nome;
        private double salario;

        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public void exibirInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Salario: " + salario);
        }
    }

    static class Gerente extends Funcionario {
        private double bonus;

        public Gerente(String nome, double salario, double bonus) {
            super(nome, salario);
            this.bonus = bonus;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Bonus: " + bonus);
        }
    }

    static class Estagiario extends Funcionario {
        private int horasTrabalhadas;

        public Estagiario(String nome, double salario, int horasTrabalhadas) {
            super(nome, salario);
            this.horasTrabalhadas = horasTrabalhadas;
        }

        public int getHorasTrabalhadas() {
            return horasTrabalhadas;
        }

        public void setHorasTrabalhadas(int horasTrabalhadas) {
            this.horasTrabalhadas = horasTrabalhadas;
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        }
    }

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Cleitin", 3000);
        Gerente g = new Gerente("Jubiscleudo", 8000, 2000);
        Estagiario e = new Estagiario("Pedrin444", 1500, 30);

        System.out.println("Funcionario");
        f.exibirInfo();

        System.out.println("\nGerente");
        g.exibirInfo();

        System.out.println("\nEstagiario");
        e.exibirInfo();
    }
}