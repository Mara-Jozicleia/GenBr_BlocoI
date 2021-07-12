package Herança;

public class Cachorro extends Animal {
	
	private String raça;
	private  String cor;
	private  String porte;

		
	public Cachorro(String nome, String raça, String cor, String porte, int idade) {
		super(nome, idade);
		this.raça = raça;
		this.cor = cor;
		this.porte = porte;
		
	}


	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
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
			
			System.out.println("\nNome do cachorro: "+getNome()+"\nRaça: "+getRaça()+ "\nA cor dele: "+getCor()+ "\nPorte: "+ getPorte()+ "\nIdade: " +getIdade()+ " anos" );
		}
		
		public void latir () {
			System.out.println("\nEle fica latindo o dia inteiro");
		}
	}

	
	



