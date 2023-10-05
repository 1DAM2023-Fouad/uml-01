/****
Esta clase está añadida a GIT.
 ****/

public class Precesador {
    //Estados, atributos, propiedaes
    public String marca;
    public String modelo;
    public Double precio;

    //Comportamiento o método (funciones)
    // public (+) método accesible desde cualquier clase.
    // String: tipo devuleto por el método
    public String getNombreCompleto(){
        //Concatenas cadenas con +
        // AMD 7600 32.2
        return marca + " " + modelo + " " + precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){ return modelo; }

    public Double getPrecio(){
        return precio;
    }
}
