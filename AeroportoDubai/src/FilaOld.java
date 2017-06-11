
public class FilaOld {
	Nodo cabeca, cauda;
	int tamanho;
	public FilaOld() {
		this.cabeca = null;
		this.cauda   = null;		
		this.tamanho = 0;
	}
	public boolean estaVazia(){
		return(this.cabeca==null && this.cauda==null);
	}
	public void imprimir(){
		System.out.println("IMPRESSAO DA FILA");
        for(Nodo n = this.cabeca; n != null; n=n.getProx()){
			 System.out.println(n.toString());
    	}
	}    
	
	public void ordenar(){
		
		System.out.println("ORDENAR");
		for(Nodo n = this.cabeca; n != null; n=n.getProx()){
			
			for(Nodo n2 = this.cabeca; n2 != null; n2 = n2.getProx()){
				
				trocar(n, n2);
				
			}
			
		}
	}
	
	public void trocar(Nodo n1, Nodo n2){
		
		System.out.println(n1.getId()+" COMPARING "+n2.getId());
		
		if(n1.getPassageiros() < n2.getPassageiros()){
			
		if(this.cabeca == n1){
			System.out.println("é cabeça "+n1.getId());	
//			this.cabeca = n2;
//			
//			n1.setProx(n2.getProx());
//			n2.setProx(n1);
			
		}else if(this.cauda == n2){
			System.out.println("é cauda "+n2.getId());	
			
//			n1.setProx(null);
//			n2.setProx(n1);
//			
//			this.cauda = n1;
		}else{
			System.out.println("é normal "+n1.getId());	
			//n1.setProx(n2.getProx());
			//n2.setProx(n1);
		}
			
//			Nodo n1Before = n1;
//			Nodo n2Before = n2;
//			
//			n1.setProx(n2.getProx());
//			n2.setProx(n1);
			
//			
//			n1.setProx(n2.getProx());
//			n2.setProx(n1);
//			

//			

			
		}else{
			//System.out.println("E igual");
		}
			
		
	}
	
	public void inserir(int id, int passageiros, double combustivel, double autonomia) {
		
		Nodo novo = new Nodo(id, passageiros, combustivel, autonomia);
	    novo.setProx(null); 
	    
		if( this.estaVazia() ){
	        this.cabeca = novo; 
	    } else {
    	   this.cauda.setProx(novo);
	    }
		this.cauda = novo; 
	    this.tamanho++;
	}
	
	public Nodo remover(){
		Nodo n;
		if ( this.estaVazia() ){
			return null;
    	} else {
          n = this.cabeca;	
          this.cabeca = this.cabeca.getProx();
          this.tamanho--;
          if (this.tamanho == 0){
        	  this.cauda = null;
          }
	          return n;
    	 }
	}
}
