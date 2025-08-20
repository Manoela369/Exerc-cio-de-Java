import java.util.Scanner
public class SistemaBancario{
public static void main (String [] args){
  int escolha = 0;
  System.out.println("""
  Operações
  (1)Consultar Saldo
  (2)Realizar depósito
  (3)Realizar saque 
  (4)Sair
  """);
  System.out.println("Qual sua opção?");
  Scanner opcao = new Scanner(System.in);
  escolha = opcao.nextInt();
}
}