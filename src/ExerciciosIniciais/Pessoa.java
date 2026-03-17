package ExerciciosIniciais;

public class Pessoa {

    private int idade;
    private String nome;
    private String cpf;
    private String etnia;
    private String nacionalidade;
    private String rg;
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}

public class Main {
    public static void main(String[] args) {

        Pessoa objPessoa = new Pessoa();

        objPessoa.setNome("Wallace");
        objPessoa.setIdade(20);
        objPessoa.setCpf("546.540.204-09"); 
        objPessoa.setEtnia("Branca"); 
        objPessoa.setNacionalidade("Brasileira");
        objPessoa.setRg("65.766.897-X");
        
        System.out.println("Usuario " + objPessoa.getNome() +
                " tem " + objPessoa.getIdade() + " anos" + "Tem CPF" + objPessoa.getCpf() 
                   + "e Possui a Etnia" + objPessoa.getEtnia()+ "Nacionalidade" + objPessoa.getNacionalidade()
                        + "Possuindo o RG"+ objPessoa.getRg()
        );
    }
}