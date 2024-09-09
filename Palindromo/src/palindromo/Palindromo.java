package palindromo;

public class Palindromo {
	
	public static boolean testePalindromo(String palavra) {
		Pilha pilha = new Pilha();
		
		for(int i =0; i<palavra.length(); i++) {
			pilha.inserirPalavra(palavra.charAt(i));
		}
		
		String palavraInversa = " ";
		while(!pilha.verificar()) {
			palavraInversa += pilha.palavraInversa();
		}
		
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}
		
		return false;
	}
	
	public void verificar(String palavra) { 
		System.out.println (palavra + " é um palíndromo? " + testePalindromo(palavra)); 
	}
}
