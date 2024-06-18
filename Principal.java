package cofrinhoJava;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int opcao;

        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        
        // Usei o comando do-while para criar um loop de todo o sistema 
        do {
        	//Aqui o menu de op��es
        	System.out.println();
            System.out.println("--- Menu ---");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Reais");
            System.out.println("5. Sair");
            System.out.println("Escolha uma op��o: ");
            opcao = scanner.nextInt();
            
            //Um switch-case para validar as primeiras op��es
            switch (opcao) {

                case 1:
                	//Case 1 para as op��es de adicionar as moedas
                	System.out.println();
                    System.out.println("--- Adicionar Moeda ---");
                    System.out.println("1. Real");
                    System.out.println("2. Dolar");
                    System.out.println("3. Euro");
                    System.out.println("--- Selecione uma op��o! ---");
                    int moedaEscolhida = scanner.nextInt();
                    System.out.println();
                    System.out.println("--- Digite o valor:  ---");
                    double moedaValor = scanner.nextDouble();
                    //Mais um switch case para as op��es de adicionar moeda de acordo com o tipo dela
                    switch (moedaEscolhida) {
                        case 1:
                        	//Esse case 1 adiciona moedas em Real na classe Cofrinho
                            cofrinho.adicionarMoedas(new Real(moedaValor));
                            break;
                        case 2:
                        	//Esse case 2 adiciona moedas em Dolar na classe Cofrinho
                            cofrinho.adicionarMoedas(new Dolar(moedaValor));
                            break;
                        case 3:
                        	//Esse case 3 adiciona moedas em Euro na classe Cofrinho
                            cofrinho.adicionarMoedas(new Euro(moedaValor));
                            break;
                        default:
                        	System.out.println();
                            System.out.println("Op��o inv�lida...");
                            break;
                    }
                    break;

                case 2:
                	//Case 2 para as op��es de remover moedas
                	System.out.println();
                    System.out.println("--- Remover Moeda ---");
                    cofrinho.listarMoedas(); // Listar moedas antes de remover
                    System.out.println("Digite o �ndice da moeda que deseja remover:");
                    int indice = scanner.nextInt();
                    cofrinho.removerMoedas(indice);
                    break;
                case 3:
                	//case 3 para listar as moedas, puchando a fun��o na classe cofrinho
                	System.out.println();
                    System.out.println("--- Listar Moedas ---");
                    cofrinho.listarMoedas();
                    break;
                case 4:
                	// Case 4 para listar as moedas puchando a fun��o na classe Cofrinho
                	System.out.println();
                    System.out.println("--- Valor total em Reais ---");
                    double totalReais = cofrinho.valorTotalReais();
                    System.out.printf("Valor total: R$ %.2f", totalReais);
                    break;
                case 5:
                	//Case 5 para encerrar o loop
                	System.out.println();
                    System.out.println("Saindo...");
                    break;
                default:
                	//op��o defalt caso o usu�rio deigite uma op��o que n�o esteja nas op��es
                	System.out.println();
                    System.out.println("Op��o inv�lida...");
                    break;
            }
            //Um while diferente de 5, para manter o programa em execu��o
        } while (opcao != 5);
        scanner.close();
        //Um scanner close para que n�o haja vazamento de dados
    }
}


