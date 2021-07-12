package Heran�a;

public class Cavalo extends Animal{

	private String ra�a;
	private  String cor;
	private  String porte;

		
	public Cavalo(String nome, String ra�a, String cor, String porte, int idade) {
		super(nome, idade);
		this.ra�a = ra�a;
		this.cor = cor;
		this.porte = porte;
		
	}


	public String getRa�a() {
		return ra�a;
	}


	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}
	public void imprimirInfo() {
			
			System.out.println("\nNome do Cavalo : "+getNome()+ "\nRa�a: "+getRa�a()+ "\nA cor dele: "+getCor() + "\nPorte: "+ getPorte()+ "\nIdade: " +getIdade()+" anos" );
		}
		
	public void correr () {
		System.out.println("\nEle adora Correr");
	}
}
