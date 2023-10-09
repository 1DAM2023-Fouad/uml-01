public class MemoriaRAM {
    public Integer memoriainterna;
    public String modelo;
    public Double precio;


    public String getNombreCompleto(){

        return memoriainterna + " " + modelo + " " + precio;
    }

    public Integer getMemoriaInterna(){
        return memoriainterna;
    }

    public String getModelo(){ return modelo; }

    public Double getPrecio(){
        return precio;
    }

}

