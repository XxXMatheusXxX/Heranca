package Atividade;


public class Main {
	public static void main(String[] args) {
	Veiculo veiculo = new Veiculo("Honda", "cg157",2006, "vermelho");
	System.out.println("Veiculo: ");
	System.out.println("Marca: " + veiculo.getMarca());
	System.out.println("Modelo: " + veiculo.getModelo());
	System.out.println("Ano: " + veiculo.getAno());
	System.out.println("Cor: " + veiculo.getCor());
	
	Moto moto = new Moto("Honda", "cg157",2006, "vermelho",250);
	System.out.println("Moto: ");
	System.out.println("Cilindrada: " + moto.getCilindrada());
	System.out.println("Marca: " + moto.getMarca());
	System.out.println("Modelo: " + moto.getModelo());
	System.out.println("Ano: " + moto.getAno());
	System.out.println("Cor: " + moto.getCor());
	
	Automovel automovel = new Automovel("Honda", "cg157",2006, "vermelho", 4, "V12");
	System.out.println("Carro: ");
	System.out.println("Nuúmero de Portas: " + automovel.getNumeroPortas());
	System.out.println("Marca: " + automovel.getMotor());
	System.out.println("Marca: " + automovel.getMarca());
	System.out.println("Modelo: " + automovel.getModelo());
	System.out.println("Ano: " + automovel.getAno());
	System.out.println("Cor: " + automovel.getCor());
	
}
}