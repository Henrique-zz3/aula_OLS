package optional;

import java.util.Optional;

public class Exemplo_Optional {
	public static void main(String[] args) {

		String[] palavras = new String[10];
		
		palavras[5] = "GENERATION";
		String codigo = null;
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]); 
		
		
		
		if(checaNulo.isPresent()) {
			System.out.println("Valor dentro do Optional: " + checaNulo.get());
			
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}else {
			System.out.println("A posição do Array é nula / está vazia!");
		}

		// void => tipagem especifica de métodos
		//null => tipo de retorno
		
		System.out.println(testar(codigo));
		
		
		
	}
	public static Optional<String> testar (String texto){
		Optional<String> optionalTexto = Optional.ofNullable(texto);
		
		if(optionalTexto.isPresent()) {
			return optionalTexto;
		}else {
			return Optional.empty();
		}
		
	}
}


