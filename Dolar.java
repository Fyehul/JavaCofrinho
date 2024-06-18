package cofrinhoJava;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	}
	//Classe filha Dolar com o super da classe Moeda e um override para identificar o nome com o get.
	@Override
	public String getNome() {
		return "Dolar";
	}

}
