package mundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sala 
{
	// ATRIBUTOS
	private Silla[][] sillas;
	private Properties misPropiedades;
	


	// TODO: PUNTO 1 (valor 1.0). CREE EL METODO CONSTRUCTOR.
	// METODO CONSTRUCTOR
	public Sala()
	{
		// PARA EL METODO CONSTRUCTOR LOS PASOS SON LOS SIGUIENTES (HAY QUE SEGUIR EL MISMO ORDEN).
		// 1. INSTANCIAR EL OBJETO misPropiedades.
		// 2. HACER EL LLAMADO AL METODO QUE CARGA EL ARCHIVO DE PROPIEDADES.
		// 3. CREAR LA MATRIZ (TOMANDO LA INFORMACIÓN DE FILAS Y COLUMNAS DEL ARCHIVO DE PROPIEDADES).
		// 4. HACER EL LLAMADO AL METODO QUE LEE LA INFORMACION DEL ARCHIVO DE PROPIEDADES Y LA CARGA EN LA MATRIZ.
		misPropiedades = new Properties();
		try {
			cargarArchivoDePropiedades();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sillas = new Silla[Integer.parseInt(misPropiedades.getProperty("filas"))]
				[Integer.parseInt(misPropiedades.getProperty("columnas"))];
		cargarInformacionALaMatriz(misPropiedades);
		
	}

	// TODO: PUNTO 2 (valor 1.0) . CREE EL METODO cargarArchivoDePropiedades( )throws Exception
	// PRIMER PASO: CARGAR EL ARCHIVO DE PROPIEDADES
	private void cargarArchivoDePropiedades()throws Exception
	{	
		
		try {
			FileInputStream in = new FileInputStream(".\\data\\sillas.properties");
			misPropiedades.load(in);
			in.close();
		}
		catch(IOException e){
			throw new IOException("Error con el archivo");
		}
				
	}

	// TODO: PUNTO 3 (valor 1.0). CREE EL METODO cargarInformacionALaMatriz()
	// SEGUNDO PASO: PASAR LA INFORMACIÓN DEL ARCHIVO PROPERTIES A LA MATRIZ
	public void cargarInformacionALaMatriz(Properties prop)
	{	
		
		for(int i = 0 ; i < sillas.length ; i++) {
			for (int j = 0 ; j < sillas[0].length ; j++) {
				int numero = Integer.parseInt(prop.getProperty("silla.numero."+ i + "." + j));
				int estado = Integer.parseInt(prop.getProperty("silla.estado."+ i + "." + j));
				int tipo = Integer.parseInt(prop.getProperty("silla.tipo."+ i + "." + j));
				double precio = Double.parseDouble(prop.getProperty("silla.precio."+ i + "." + j));
				
				Silla temp = new Silla(numero, estado, tipo, precio);
				
				sillas[i][j] = temp;
			}
		}
		
	}

	// TODO: PUNTO 4 (valor 1.0). CREE EL METODO listarSillas()
	// TERCER PASO: LISTAR LOS ESTUDIANTES QUE ESTAN EN LA MATRIZ
	public void listarSillas()
	{
		int cantidadEstudiantes = 0;
		for(int i = 0 ; i < sillas.length ; i++) {
			for(int j = 0 ; j < sillas[0].length ; j++) {
				Silla temp = sillas[i][j];
				if(temp.getEstado() == 2) {
					System.out.println(sillas[i][j]);
				}
			}
		}
	}

	// TODO: PUNTO 5 (valor 1.0). CREE EL METODO listarSillasDisponibles()
	public void listarSillasDisponibles()
	{
		
		for(int i = 0 ; i < sillas.length ; i++) {
			for(int j = 0 ; j < sillas[0].length ; j++) {
				if(sillas[i][j].getEstado() == 1) {
					System.out.println(sillas[i][j]);
				}
			}
		}
		
	}


}
