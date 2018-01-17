package conversorLatex;

public class Latex {

	public static void main (String [] args){
		
		//Variaveis
			String textoInicial;
			String textoLatex;
			
		//Entrada: Texto atual
			textoInicial = args[0];
			
			System.out.println("1)Texto Inicial: ");
			System.out.println("	"+textoInicial);
		
		//Conversão Text->Latex 
			textoInicial = textoInicial.replaceAll("á", "\\\\’a");
			textoInicial = textoInicial.replaceAll("à", "\\\\'a");
			textoInicial = textoInicial.replaceAll("ã", "\\\\~a");
			textoInicial = textoInicial.replaceAll("â", "\\\\^a");
			textoInicial = textoInicial.replaceAll("é", "\\\\'e");
			textoInicial = textoInicial.replaceAll("ê", "\\\\^e");
			textoInicial = textoInicial.replaceAll("í", "\\\\’{\\\\i}");
			textoInicial = textoInicial.replaceAll("Í", "\\\\’I");
			textoInicial = textoInicial.replaceAll("ó", "\\\\’o");
			textoInicial = textoInicial.replaceAll("õ", "\\\\~o");
			textoInicial = textoInicial.replaceAll("ô", "\\\\^o");
			textoInicial = textoInicial.replaceAll("ú", "\\\\’u");
			textoInicial = textoInicial.replaceAll("ü", "\\\\"+"\""+"u");
			textoInicial = textoInicial.replaceAll("ç", "\\\\c{c}");
			textoInicial = textoInicial.replaceAll("Ç", "\\\\c{C}");
			
			textoLatex = textoInicial;
			
		//Saida: Texto formatado para Latex
			System.out.println("2)Texto Latex: ");
			System.out.println("	"+textoLatex);
			
	}
}
