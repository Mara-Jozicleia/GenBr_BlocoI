package Polimorfismo;

public class Cavalo extends Animais{

		private String raça;
		private  String cor;
		private  String porte;



		public Cavalo()
		{
			super("Cavalo");
		}
		
		@Override
		
		public void Nome(String nomeAnimal)
		{
			System.out.println("\nNome do seu Cavalo: "+nomeAnimal);
		}
		
		@Override
		public void Idade(int idadeAnimal)
		{
			System.out.println("\nIdade: "+idadeAnimal);
		}
		
		@Override
		public void Som(String somAnimal)
		{
			System.out.println("\nSom que o seu Cavalo emite: "+somAnimal);
		}
		
		public void correr() {
			System.out.println("\nEle adora Correr");
		}
	


}
