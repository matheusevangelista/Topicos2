import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Fila {

  private ArrayList<Nodo> itens = new ArrayList<Nodo>();

  public void insere(Nodo n) {
    this.itens.add(n);
  }

  public Nodo remove() {
    return this.itens.remove(0);
  }
  
  public void ordenar(){
	  System.out.println("Ordenando...");
	  for(int i=itens.size(); i>= 1; i--){	  
		  for(int j=1; j<i; j++){
			  if(itens.get(j-1).getPassageiros() < itens.get(j).getPassageiros()){
				  Nodo aux = itens.get(j);
				  
				  itens.set(j, itens.get(j-1));
				  itens.set(j-1, aux);
			  }else if(itens.get(j-1).getPassageiros() == itens.get(j).getPassageiros()){
				  
				  if(itens.get(j-1).autonomia() > itens.get(j).autonomia()){
					  Nodo aux = itens.get(j);
					  itens.set(j, itens.get(j-1));
					  itens.set(j-1, aux);
				  }
			  }
		  }
	  }
  }
  
  public void atualizaCombustivel(double percurso){
	  
	  for(int i=0; i<itens.size(); i++){	
		  Nodo n = itens.get(i);
		  
		  double combustivelPercurso = percurso/n.getConsumo();
		  double combustivelAtual = n.getCombustivel()-combustivelPercurso;
		  
		  itens.get(i).setCombustivel(combustivelAtual);
		  if(combustivelAtual<=0)
		  {
			  System.out.println(">>>>>>>>>>>>>>O avião "+n.getId()+" CAIU");
			  itens.remove(i);
		  }
		 
	  }
  }
  
  public void imprimir(){
	  System.out.println("IMPRESSAO DA FILA");
	  for(int i=0; i<itens.size(); i++){	
		  System.out.println(itens.get(i).toString());
	  }
  }
  
  public void bubbleSort(int v[]) {
      for (int i = v.length; i >= 1; i--) {
          for (int j = 1; j < i; j++) {
              if (v[j - 1] > v[j]) {
                  int aux = v[j];
                  v[j] = v[j - 1];
                  v[j - 1] = aux;
              }
          }
      }
  }

  public boolean vazia() {
    return this.itens.size() == 0;
  }
}
