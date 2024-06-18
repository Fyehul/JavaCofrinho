package cofrinhoJava;

import java.util.ArrayList;

public class Cofrinho {
    private static ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }
    //Função para adicionar moedas
    public void adicionarMoedas(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("Adicionando moeda: " + moeda.getNome() + " - Valor: " + moeda.getValor());
    }
    
  //Função para remover moedas
    public void removerMoedas(int indice) {
        if (indice >= 0 && indice < moedas.size()) {
            Moeda removerMoeda = moedas.remove(indice);
            System.out.println("Removendo moeda: " + removerMoeda.getNome() + " Valor: " + removerMoeda.getValor());
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Índice inválido! Nenhuma moeda removida.");
        }
    }
    
  //Função para listar as moedas
    public void listarMoedas() {
        System.out.println("Moedas no Cofrinho: ");
        for (int i = 0; i < moedas.size(); i++) {
            Moeda moeda = moedas.get(i);
            System.out.println(i + ": " + moeda.getNome() + " " + moeda.getValor());
        }
    }
    
  //Função para calcular o valor total das moedas
    public double valorTotalReais() {
        double total = 0;
        for (Moeda moeda : moedas) {
            if (moeda instanceof Real) {
                total += moeda.getValor();
            } else if (moeda instanceof Dolar) {
                total += moeda.getValor() * 5.02;
            } else if (moeda instanceof Euro) {
                total += moeda.getValor() * 5.42;
            }
        }
        return total;
    }
}
