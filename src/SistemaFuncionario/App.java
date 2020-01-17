package SistemaFuncionario;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "Bruno",
                "4435436345",
                3459.00
        );

        Gerente gerente = new Gerente(
                "Jefferson",
                "3953469568",
                2000.00,
                12);

        System.out.println(gerente.bonificacao(gerente.salario));
        System.out.println(funcionario.bonificacao(funcionario.salario));

        gerente.teste(" Jefferson");
        gerente.teste(" Gabriel ", "348583832");
    }
}
