public class CelularTest{
	public static void main(String [] args){
		
	
		Celular myCelular1 = new Celular();
		
	
		myCelular1.setMarca("Apple");
		
		myCelular1.setModelo("MacOS");
		
		myCelular1.setNumerodecamaras(4);
		
		
		
		myCelular1.desplegarInformacion();
		
		// Otra instancia de Celular.
	
		
		Celular myCelular2 = new Celular();
		
	
		myCelular2.setMarca("Xiaomi");
		
		myCelular2.setModelo("Android");
		
		myCelular2.setNumerodecamaras(4);
		
	    myCelular2.desplegarInformacion();
		
		
		
	}
}
