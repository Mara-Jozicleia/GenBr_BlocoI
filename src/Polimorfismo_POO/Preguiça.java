package Polimorfismo;

public class Preguiça extends Animais {
		
		private String sexo;
		private  String cor;
		private  String porte;
		
		public Preguiça()
		{
			super("Preguiça");
		}
		
		@Override
		
		public void Nome(String nomeAnimal)
		{
			System.out.println("\nNome da Preguiça: "+nomeAnimal);
		}
		
		@Override
		public void Idade(int idadeAnimal)
		{
			System.out.println("\nIdade: "+idadeAnimal);
		}
		
		@Override
		public void Som(String somAnimal)
		{
			System.out.println("\nSom que a Preguiça emite: "+somAnimal);
		}
		public void Sexo(String sexo) {
			System.out.println("\nSexo: "+sexo);
			
		}
		public void Cor(String cor)
		{
			System.out.println("\nCor: "+cor);
		}
		public void Porte(String porte)
		{
			System.out.println("\nPorte: "+porte);
		}
		public void subir () {
			System.out.println("\nEla adora subir em árvores");
		}

}
