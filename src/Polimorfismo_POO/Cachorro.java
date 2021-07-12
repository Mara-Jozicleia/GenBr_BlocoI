package Polimorfismo;

public class Cachorro extends Animais {

	private String raça;
	private  String cor;
	private  String porte;



	public Cachorro()
	{
		super("Cachorro");
	}
	
	@Override
	
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome do seu cachorro: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal)
	{
		System.out.println("\nSom que o seu cachorro emite: "+somAnimal);
	}
	
	public void Raça(String raça)
	{
		System.out.println("\nRaça: "+raça);
	}
	public void Cor(String cor)
	{
		System.out.println("\nCor: "+cor);
	}
	public void Porte(String porte)
	{
		System.out.println("\nPorte: "+porte);
	}
	public void Latir () {
		System.out.println("\nEle fica latindo o dia inteiro");
	}
}
