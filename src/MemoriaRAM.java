public class MemoriaRAM {
    public String memoriainterna;
    public String modelo;
    public Double precio;
    public Double peso;

    public String getNombreCompleto(){

        return memoriainterna + " " + modelo + " " + precio + " " + peso;
    }

    public String getMarca(){
        return memoriainterna;
    }

    public String getModelo(){ return modelo; }

    public Double getPrecio(){
        return precio;
    }
    public Double getPeso(){
        return peso;
    }

}
}
