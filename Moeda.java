package cofrinhoJava;

public abstract class Moeda {
	//Classe moeda abstrata, para n�o ser utilizada pelo usu�rio, apenas para as classes filhas 
	protected double valor;

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

	public abstract String getNome();
	
}
	