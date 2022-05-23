package interfaz;


import mundo.Sala;

public class Main 
{
	public static void main(String[] args)
	{
		Sala objetoDeSala = new Sala();
		System.out.println("\n--- Listando todas las sillas: ---\n");
		objetoDeSala.listarSillas();
		System.out.println("\n--- Listando las sillas disponibles: ---\n");
		objetoDeSala.listarSillasDisponibles();
		
	}

}
