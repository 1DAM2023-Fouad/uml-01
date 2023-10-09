public class MemoriaRAM {
    public String memoriainterna;
    public String modelo;
    public Double precio;


    public String getNombreCompleto(){

        return memoriainterna + " " + modelo + " " + precio;
    }

    public String getMemoriaInterna(){
        return memoriainterna;
    }

    public String getModelo(){ return modelo; }

    public Double getPrecio(){
        return precio;
    }

}

