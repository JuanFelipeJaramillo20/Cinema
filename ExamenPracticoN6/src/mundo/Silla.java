package mundo;

public class Silla 
{
	// CONSTANTES
	public final static int DISPONIBLE = 1;
	public final static int OCUPADA = 2;

	public final static int NORMAL = 1;
	public final static int PREFERENCIAL = 2;


	// ATRIBUTOS
	private int numero;
	private int estado;
	private int tipo;
	private double precio;

	// METODO CONSTRUCTOR
	public Silla(int pNumero, int pEstado, int pTipo, double pPrecio)
	{
		numero = pNumero;
		estado = pEstado;
		tipo = pTipo;
		precio = pPrecio;
	}

	// METODOS GET Y SET
	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}

	public int getEstado() 
	{
		return estado;
	}

	public void setEstado(int estado) 
	{
		this.estado = estado;
	}

	public int getTipo() 
	{
		return tipo;
	}

	public void setTipo(int tipo) 
	{
		this.tipo = tipo;
	}

	public double getPrecio() 
	{
		return precio;
	}

	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}

	@Override
	public String toString() 
	{
		return "Silla \nNumero = " + numero + ", \nEstado = " + 
				estado + ", \nTipo = " + tipo + ", \nPrecio = " + precio + "\n";
	}

}
