public class Main {
    public static void main(String[] args){
        
        Funcionarios.Funcionario f = new Funcionarios.Funcionario("Marcos", 3000);
        Funcionarios.Gerente g = new Funcionarios.Gerente("Ana", 8000, 2000);
        Funcionarios.Estagiario e = new Funcionarios.Estagiario("Lucas", 1500, 25);

        System.out.println("Funcionário");
        f.exibirInfo();

        System.out.println("\nGerente");
        g.exibirInfo();

        System.out.println("\nEstagiário");
        e.exibirInfo();
    }
}