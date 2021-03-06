package ExerciciosPoo;

public class ProdutoEletronico {
		
	private String notebook;
	private String microondas;
	private String televisor;
	private String smartphone;
	private String tablet;
	private String videogame;
	
	
	public ProdutoEletronico(String notebook, String microondas, String televisor, String smartphone, String tablet,String videogame)
	{
		this.notebook = notebook;
		this.microondas = microondas;
		this.televisor = televisor;
		this.smartphone = smartphone;
		this.tablet = tablet;
		this.videogame = videogame;
	}
	
	public void escreva()
	{
		System.out.println("<<< Lista de produtos eletrônicos(SUPER TECNOLÓGICOS) >>>");
		System.out.println("\n1- "+notebook+"\n2- "+microondas+"\n3- "+televisor);
		System.out.println("4- "+smartphone+"\n5- "+tablet+"\n6- videogame");
	}

	public String getNotebook() {
		return notebook;
	}

	public void setNotebook(String notebook) {
		this.notebook = notebook;
	}

	public String getMicroondas() {
		return microondas;
	}

	public void setMicroondas(String microondas) {
		this.microondas = microondas;
	}

	public String getTelevisor() {
		return televisor;
	}

	public void setTelevisor(String televisor) {
		this.televisor = televisor;
	}

	public String getSmartphone() {
		return smartphone;
	}

	public void setSmartphone(String smartphone) {
		this.smartphone = smartphone;
	}

	public String getTablet() {
		return tablet;
	}

	public void setTablet(String tablet) {
		this.tablet = tablet;
	}

	public String getVideogame() {
		return videogame;
	}

	public void setVideogame(String videogame) {
		this.videogame = videogame;
	}	
	
}
