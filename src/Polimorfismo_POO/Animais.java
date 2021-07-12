package Polimorfismo;

public abstract class Animais {

	private String tipo;
	
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade(int idadeAnimal);
	abstract public void Som(String somAnimal);
	
	public Animais(String tipo)
	{
		this.tipo= tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	
	
}
