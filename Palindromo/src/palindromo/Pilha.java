package palindromo;
	
import java.util.Stack;

public class Pilha {
		
		Stack<String> pilha = new Stack<String>();
		
	    public void inserirPalavra(String palavra) {
	        
	    	pilha.push(palavra);
	    }

		
		public String palavraInversa() {
			
			return pilha.pop();
			
		}
		
		
		public boolean verificar() {
			
			return pilha.isEmpty();
		}
		
		public void mostrar() {
			
			System.out.println(pilha.toString());
			
		}

	}