package SistemaFuncionario;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double bonificacao(double salario){
        salario = salario *0.1;
        return salario;
    }

}
