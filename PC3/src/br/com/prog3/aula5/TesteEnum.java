package br.com.prog3.aula5;

public class TesteEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(TipoPessoa.PESSOA_FISICA.getClass());
		
		TipoPessoa tp1 = TipoPessoa.PESSOA_FISICA;
		TipoPessoa tp2 = TipoPessoa.PESSOA_JURIDICA;
//		System.out.println(tp1);
//		System.out.println(tp1.name());
//		System.out.println(tp1.toString());
//		System.out.println(EstadoCivil.CASADO.getValor());
//		System.out.println(EstadoCivil.CASADO);
		
//		System.out.println(Uf.DF);
//		System.out.println(Uf.DF.getDescricao());
		System.out.println(Imposto.calcularImposto(115000.0, Taxa.ITBI));
	}
	

}
