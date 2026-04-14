package ExerciciosIniciais;

class AtvFuncionarios {
    private String func;

    public AtvFuncionarios(String func) {
        this.func = func;
    }

    public void mover() {
        System.out.println(func + " está se movendo");
    }
}

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Bônus: " + bonus);
    }
}

class Estagiario extends Funcionario {
    private int horasTrabalhadas;

    public Estagiario(String nome, double salario, int horasTrabalhadas) {
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
    }
}

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("João", 2000);
        Gerente g = new Gerente("Maria", 5000, 1500);
        Estagiario e = new Estagiario("Lucas", 1200, 30);

        AtvFuncionarios atv = new AtvFuncionarios("Funcionário");

        System.out.println("=== Funcionário ===");
        f.exibirInfo();

        System.out.println("\n=== Gerente ===");
        g.exibirInfo();

        System.out.println("\n=== Estagiário ===");
        e.exibirInfo();

        System.out.println("\n=== Atividade ===");
        atv.mover();
    }
}