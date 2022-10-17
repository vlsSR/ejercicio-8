package paquete1;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }


    public String mostrarDatosSucursal(){
        return "Nº Sucursal: "+numeroSucursal+"\nDireccion: "+direccion+"\nCiudad: "+ciudad;
    }

    /**
     *  1 Kilo = 1 Dolar
     *  +0 if prioridad == 0 Estandar
     *  +10 if prioridad == 1 Alta
     *  +20 if prioridad == 2 Express
     * @param paquete1
     * @return
     */
    public double calcularPrecio(Paquete paquete){
        int prioridad;
        double peso;
        int extra;
        peso = paquete.getPeso();
        if(paquete.getPrioridad() == 1){
            extra = 10;
        }
        else if (paquete.getPrioridad() == 2) {
            extra = 20;
        }
        else {
            extra = 0;
        }
        return peso + extra;
    }
}
