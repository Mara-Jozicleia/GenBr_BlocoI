package Heran�a;

public class Pregui�a extends Animal {
		private String sexo;
		private  String cor;
		private  String porte;

			
		public Pregui�a(String nome, String sexo, String cor, String porte, int idade) {
			super(nome, idade);
			this.sexo = sexo;
			this.cor = cor;
			this.porte = porte;
			
		}


		public String getSexo() {
			return sexo;
		}


		public void setSexo(String sexo) {
			this.sexo = sexo;
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
				
				System.out.println("\nNome da Pregui�a : "+getNome()+" \nSexo: "+getSexo()+ "\nA cor dela: "+getCor() + "\nIdade: " +getIdade()+ " anos");
			}
			
		public void dormir () {
			System.out.println("\nEla Est� Dormindo");
		}
	}
	



