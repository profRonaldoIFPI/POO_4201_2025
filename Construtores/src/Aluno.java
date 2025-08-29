public class Aluno {
    String nome;
    String matricula;
    String cpf;
    String telefone;

    //método construtor 
    public Aluno(String nome, String matricula, String cpf, String telefone){
      this.nome = nome;
      this.matricula = matricula;
      this.cpf = cpf;
      this.telefone = telefone;
    }
    //sobrecarga do método construtor
    public Aluno(String nome, String matricula, String cpf){
      this.nome = nome;
      this.matricula = matricula;
      this.cpf = cpf;
      this.telefone = null;
    }

    //outros métodos
    public void apresentar(){
        System.out.println("Oi, sou "+this.nome+".");
    }
}