import java.util.Scanner;

//Endereço: typedef de uma estrutura heterogenea = classe de atributos (apenas).
public class Endereço {
  private String rua;
  private int numeroCasa;
  private int cep;
}


public class Cliente{
  private String cpf;
  private String nome;
  private double salario;
  //private Endereco endereco;

  // Construtor que recebe cpf e nome como parâmetros
  public Cliente(String nomeRecebido, int cpfRecebido) {
      this.cpf = cpfRecebido + "1";
      this.nome = nomeRecebido;
  }

  // Método para calcular o valor total do rendimento em um período

}


class Main {
  public static void main(String[] args) {

    Scanner scr = new Scanner(System.in);

    //passar os valores para os atributos dos obj.
    System.out.print("Digite o nome do cliente: ");
    String inputarNome = scr.nextLine();

    System.out.print("Digite o CPF do cliente: ");
    int inputarCPF = Integer.parseInt(scr.next());

    //Debug
    //System.out.println(inputarNome + "\n" + inputarCPF);

    Cliente cliente1 = new Cliente(inputarNome, inputarCPF);
    //cliente1.calcularRendimento(10);

  }
}
