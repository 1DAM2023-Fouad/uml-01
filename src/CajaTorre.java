public class CajaTorre {

        public Double dimensiones;
        public String modelo;
        public Double precio;
        public Double peso;

        public String getNombreCompleto(){

            return dimensiones + " " + modelo + " " + precio + " " + peso;
        }

        public Double getDimensiones(){
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

