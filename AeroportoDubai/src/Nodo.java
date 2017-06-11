public class Nodo {
	private int id;
	private int passageiros;
	private double combustivel;
	private double consumo;
	
	private Nodo prox;
	
	public Nodo(int id, int passageiros, double combustivel, double consumo) {
		super();
		this.prox = null;
		this.id = id;
		this.passageiros = passageiros;
		this.combustivel = combustivel;
		this.consumo = consumo;
		this.prox = prox;
	}

	public Nodo getProx() {
		return this.prox;
	}
	public void setProx(Nodo prox) {
		this.prox = prox;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setCosumo(double consumo) {
		this.consumo = consumo;
	}
	
	public String toString(){
		return "Id: "+id+", Passageiros: "+passageiros+", Combustivel: "+combustivel+" litros, Consumo: "+consumo+" km/litros, Autonomia: "+autonomia()+" km";
	}
	
	public double autonomia(){
		return combustivel*consumo;
	}
	
}