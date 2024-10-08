package Lista;

public class Celula {
	public Celula proxima;
	public Celula anterior;
	public Celula valor;
	public Object elemento;
	
	public Celula(Object elemento2) {
		this.elemento = elemento2;
		this.proxima = null;
		this.anterior = null;
	}
	
	public Celula() {
		super();
	}

	public Celula(Celula proxima, Celula anterior, Object elemento) {
		super();
		this.proxima = proxima;
		this.anterior = anterior;
		this.elemento = elemento;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getValor() {
		return valor;
	}

	public void setValor(Celula valor) {
		this.valor = valor;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	@Override
	public String toString() {
		return "Celula [proxima=" + proxima + ", anterior=" + anterior + ", valor=" + valor + ", elemento=" + elemento
				+ "]";
	}
	
}
