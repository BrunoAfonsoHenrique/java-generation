package ExerciciosPoo;

public class Aviao {
	
	private String modeloAviao;
	private float pesoAviao;
	private String corAviao;
	private String anoConstrucao;
	private String localidadeAviao;
	
	
	public Aviao(String modeloAviao, float pesoAviao,String corAviao,String anoConstrucao,String localidadeAviao)
	{
		this.modeloAviao = modeloAviao;
		this.pesoAviao = pesoAviao;
		this.corAviao = corAviao;
		this.anoConstrucao = anoConstrucao;
		this.localidadeAviao = localidadeAviao;
	}
	
	public void escreva()
	{
		System.out.println("<<< Dados do avi?o >>>\n");
		System.out.println("Modelo: "+modeloAviao+"\nPeso: "+pesoAviao+"\nCor: "+corAviao+"\nAno de constru??o: "+ anoConstrucao);
		System.out.println("Localidade: "+localidadeAviao);
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public float getPesoAviao() {
		return pesoAviao;
	}

	public void setPesoAviao(float pesoAviao) {
		this.pesoAviao = pesoAviao;
	}

	public String getCorAviao() {
		return corAviao;
	}

	public void setCorAviao(String corAviao) {
		this.corAviao = corAviao;
	}

	public String getAnoConstrucao() {
		return anoConstrucao;
	}

	public void setAnoConstrucao(String anoConstrucao) {
		this.anoConstrucao = anoConstrucao;
	}

	public String getLocalidadeAviao() {
		return localidadeAviao;
	}

	public void setLocalidadeAviao(String localidadeAviao) {
		this.localidadeAviao = localidadeAviao;
	}			
}