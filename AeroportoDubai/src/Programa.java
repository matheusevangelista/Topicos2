
public class Programa {
	
	static Fila f = new Fila();
	
	public static final double DIAMETRO = 250;
	
	static int voltas =0;
	
	
	public static double getComprimentoVolta(){
		return 3.14*DIAMETRO;
	}
	
	public static void iniciaPousos(){
		
		while(f.vazia()==false){
			
			f.ordenar();
			Nodo aviaoPouso = f.remove();
			
			System.out.println("-------------------------------");
			System.out.println("Nº de VOLTAS: "+voltas);
			System.out.println("O avião "+aviaoPouso.getId()+ " POUSOU "+aviaoPouso.toString());
			
			System.out.println("---ATUALIZANDO AUTONOMIA---");
			atualizaCombustivel();
			
			System.out.println("");
			System.out.println("-------AVIÕES NA FILA --------");
			
			f.imprimir();
			
			voltas++;
		}
	}
	
	public static void atualizaCombustivel(){
		f.atualizaCombustivel(getComprimentoVolta());
	}
	
	public static void main (String[] args){
		
		
		Nodo av1 = new Nodo(1, 500, 1000, 2);

		f.insere(av1);
		
		Nodo av2 = new Nodo(2, 300, 800, 3);
		
		f.insere(av2);
		Nodo av3 = new Nodo(3, 1000, 2000, 4);
		
		f.insere(av3);
		
		Nodo av4 = new Nodo(4, 1000, 2000, 5);
		f.insere(av4);
		
		System.out.println("------ BEFORE INIT -------");
		f.imprimir();
		System.out.println("--------------------------");

		
		
		iniciaPousos();
		
		//n = f.remover();
		//System.out.println("Removido : " + n.getId());
		//f.imprimir();
	}
}
