package AprendendoConstrutori;

public class Produto {
	private int Codigo;
	private String Ean;
	private String Nome;
	private double ValorVenda;
	private int QtdeEstoque;
	
	public Produto() {
		
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getEan() {
		return Ean;
	}
	public void setEan(String ean) {
		Ean = ean;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getValorVenda() {
		return ValorVenda;
	}
	public void setValorVenda(double valorVenda) {
		ValorVenda = valorVenda;
	}
	public int getQtdeEstoque() {
		return QtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		QtdeEstoque = qtdeEstoque;
	}
	
	@Override
	
	public String toString() {
		return this.Codigo + " - "+this.Nome;
	}
	
}
