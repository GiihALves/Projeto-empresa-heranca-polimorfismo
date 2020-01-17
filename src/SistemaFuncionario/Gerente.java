package SistemaFuncionario;

public class Gerente extends Funcionario {
    int numeroFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    @Override
    public double bonificacao(double salario){
        salario = salario * 0.5;
        return salario;
    }

    public void teste(String nome){
        System.out.println("Olá" + nome);
    }
    public void teste(String nome, String cpf){
        System.out.println("Olá" + nome + cpf);
    }

    }


