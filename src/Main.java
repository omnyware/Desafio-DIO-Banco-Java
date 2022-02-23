import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNome("Fulano de Tal da Silva");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        String opcaoUsuario = ObterOpcaoUsuario();

			while (opcaoUsuario != "5")
			{
				switch (opcaoUsuario)
				{
					case "1": //Depositar
                        System.out.println("Digite o valor do depósito:");
                        int valor1 = sc.nextInt();
                        cc.depositar(valor1);
						break;
					case "2": //Sacar
                        System.out.println("Digite o valor do saque:");
                        int valor2 = sc.nextInt();
                        cc.sacar(valor2);
						break;
					case "3": //Transferir
                        System.out.println("Digite o valor da Tranferência:");
                        int valor3 = sc.nextInt();
                        cc.transferir(valor3, poupanca);
						break;
                    case "4": //Exibrir Extrato
                        cc.imprimirExtrato();
                        poupanca.imprimirExtrato();
                        break;
                    case "5": //Sair
                        System.out.println("Obrigado por utilizar nossos serviços.");
                        System.exit(0);
					default:
                        break;
				}

				opcaoUsuario = ObterOpcaoUsuario();
			}

    }

    private static String ObterOpcaoUsuario(){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Banco DIO");
        System.out.println("Informe a opção desejada:");

        System.out.println("1- Depositar");
        System.out.println("2- Sacar");
        System.out.println("3- Transferir");
        System.out.println("4- Exibir Extrato");
        System.out.println("5- Sair");
        System.out.println();

        String opcaoUsuario = sc.nextLine();
        System.out.println();
        return opcaoUsuario;
    } 
}
