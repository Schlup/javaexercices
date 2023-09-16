package AprendendoConstrutori;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Produto> Itens = new ArrayList<>();
		
		do {
			Produto Prod = new Produto();
			
			System.out.println("Informe o código: ");
			Prod.setCodigo(Integer.parseInt(ler.nextLine()));
			if(Prod.getCodigo()==0) {
				break;
			}
			
			System.out.println("Informe o código de barras: ");
			Prod.setEan(ler.nextLine());
			
			System.out.println("Informe o nome do produto: ");
			Prod.setNome(ler.nextLine());
			
			System.out.println("Informe a quantidade em estoque: ");
			Prod.setQtdeEstoque(Integer.parseInt(ler.nextLine()));
			
			System.out.println("Informe o valor do produto: ");
			Prod.setValorVenda(Double.parseDouble(ler.nextLine()));
		
			Itens.add(Prod);
		}
		while(true);
		
		for(int i=0; i<Itens.size(); i++) {
			System.out.println(Itens.get(i).toString());
		}
		
		ler.close();
	}
}
