public class Celular {
    private String marca; // Para Android: Samsung, Huwaei, Alcatel y para IPhone: Apple.

    private String modelo; // Android y MacOS.

    private int numerodecamaras;

    public Celular() {
        marca = null;
        modelo = null;
        numerodecamaras = 4;
    }

    public Celular(String miMarca, String miModelo, int numerodecamaras) {
        if (miMarca.equals("Samsung") || miMarca.equals("Huwaei") || miMarca.equals("Alcatel") || miMarca.equals("Apple")) {
            marca = miMarca;
        } else {
            System.out.println("Marca no registrada. Debe ser Samsung, Huwaei, Alcatel o IPhone.");
            marca = null;
        }

        if (miModelo.equals("Android") || miModelo.equals("MacOS")) {
            modelo = miModelo;
        } else {
            System.out.println("Modelo no registrado. Debe ser Android o MacOS.");
            modelo = null;
        }

        if (numerodecamaras == 4) {
            this.numerodecamaras = numerodecamaras;
        } else {
            System.out.println("Debe tener cuatro cámaras.");
            this.numerodecamaras = 4;
        }

        System.out.println("Has creado un nuevo Celular.");
    }

    public void setMarca(String parametroMarca) {
        if (parametroMarca.equals("Samsung") || parametroMarca.equals("Huwaei") || parametroMarca.equals("Alcatel") || parametroMarca.equals("Apple")) {
            marca = parametroMarca;
        } else {
            System.out.println("Marca no registrada. Debe ser Samsung, Huwaei, Alcatel o IPhone.");
            marca = null;
        }
    }

    public void setModelo(String parametroModelo) {
        if (parametroModelo.equals("Android") || parametroModelo.equals("MacOS")) {
            modelo = parametroModelo;
        } else {
            System.out.println("Modelo no registrado. Debe ser Android o MacOS.");
            modelo = null;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setNumerodecamaras(int numerodecamaras) {
        if (numerodecamaras == 4) {
            this.numerodecamaras = numerodecamaras;
        } else {
            System.out.println("Debe tener cuatro cámaras.");
        }
    }

    public void desplegarInformacion() {
        System.out.println("Marca: \t" + marca);
        System.out.println("Modelo: \t" + modelo);
        System.out.println("Numerodecamaras: " + numerodecamaras);
    }
}
