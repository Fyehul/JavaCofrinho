package cofrinhoJava;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}
	//Classe filha Euro com o super da classe Moeda e um override para identificar o nome com o get.
	@Override
	public String getNome() {
		return "Euro";
	}
}
