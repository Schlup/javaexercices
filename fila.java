package fila;

public class FilaLista {

	private NoLista first;
	private NoLista last;
	private int counter;

	public FilaLista() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	public boolean add(Integer valor) {
		NoLista tmp = new NoLista();
		tmp.setInfo(valor);
		if (this.first == null) {
			first = tmp;
		} else {
			last.setNext(tmp);
		}
		last = tmp;
		return true;
	}

	public boolean contains(Integer valor) {
		if (this.counter == 0) {
			return false;
		}
		NoLista tmp = this.first;
		while (!valor.equals(tmp.getInfo())) {
			tmp = tmp.getNext();
			if (tmp == null) {
				break;
			}
		}
		if (tmp == null) {
			return false;
		}
		if (valor.equals(tmp.getInfo())) {
			return true;
		}
		return false;
	}
}
