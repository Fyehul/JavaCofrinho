package cofrinhoJava;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
		
	}
	//Classe filha Real com o super da classe Moeda e um override para identificar o nome com o get.
	@Override
	public  String getNome() {
		return "Real";
	}
	
}

