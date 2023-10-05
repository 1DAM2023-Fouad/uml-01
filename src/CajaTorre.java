public class CajaTorre {

        public String dimensiones;
        public String modelo;
        public Double precio;
        public Double peso;

        public String getNombreCompleto(){

            return dimensiones + " " + modelo + " " + precio + " " + peso;
        }

        public String getMarca(){
            return dimensiones;
        }

        public String getModelo(){ return modelo; }

        public Double getPrecio(){
            return precio;
        }
        public Double getPeso(){
        return peso;
    }

}

