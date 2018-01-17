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
		
		//Convers�o Text->Latex 
			textoInicial = textoInicial.replaceAll("�", "\\\\�a");
			textoInicial = textoInicial.replaceAll("�", "\\\\'a");
			textoInicial = textoInicial.replaceAll("�", "\\\\~a");
			textoInicial = textoInicial.replaceAll("�", "\\\\^a");
			textoInicial = textoInicial.replaceAll("�", "\\\\'e");
			textoInicial = textoInicial.replaceAll("�", "\\\\^e");
			textoInicial = textoInicial.replaceAll("�", "\\\\�{\\\\i}");
			textoInicial = textoInicial.replaceAll("�", "\\\\�I");
			textoInicial = textoInicial.replaceAll("�", "\\\\�o");
			textoInicial = textoInicial.replaceAll("�", "\\\\~o");
			textoInicial = textoInicial.replaceAll("�", "\\\\^o");
			textoInicial = textoInicial.replaceAll("�", "\\\\�u");
			textoInicial = textoInicial.replaceAll("�", "\\\\"+"\""+"u");
			textoInicial = textoInicial.replaceAll("�", "\\\\c{c}");
			textoInicial = textoInicial.replaceAll("�", "\\\\c{C}");
			
			textoLatex = textoInicial;
			
		//Saida: Texto formatado para Latex
			System.out.println("2)Texto Latex: ");
			System.out.println("	"+textoLatex);
			
	}
}
