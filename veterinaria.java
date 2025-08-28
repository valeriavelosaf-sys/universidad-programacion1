package paquete;

import java.util.ArrayList;
public class Veterinaria {
    
        private String nombre;
        private String identificacion;
        private String raza;
        private int especie;
        private String color;
        private byte edad;
        private double peso;
        private ArrayList<Mascota> listaMascota;

//constructor

    public Veterinaria(String color, byte edad, int especie, String identificacion, ArrayList<Mascota> listaMascota, String nombre, double peso, String raza) {
        this.color = color;
        this.edad = edad;
        this.especie = especie;
        this.identificacion = identificacion;
        this.listaMascota = listaMascota;
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
    }
//getters and setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getEspecie() {
        return especie;
    }

    public void setEspecie(int especie) {
        this.especie = especie;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public ArrayList<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(ArrayList<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


//CRUD

        /**
         * Este metodo permite registrar a una mascota en caso de que no exista
         * @param nuevoMascota
         * @return
         */

        public String registrarMascotas(Mascota nuevoMascota){
            String resultado = "";
            Mascota mascotaEncontrado = null;
            mascotaEncontrado = buscarMascota(nuevoMascota.getIdentificacion();

            if(mascotaEncontrado == null){
                listaMascota.add(nuevoMascota);
                resultado = "La mascota fue registrada en la  base de datos";
            }else{
                resultado = " La mascota ya esta registrada en la veterinaria";
            }
            return resultado;
        }

        public Mascota buscarMascota(String identificacion){
            Mascota resultado = null;
            for(int i = 0; i < listaMascota.size(); i++){
                Mascota mascotaAux = listaMascota.get(i);
                if(mascotaAux.getIdentificacion().equals(identificacion)){
                    resultado = mascotaAux;
                    break;
                }
            }
            return resultado;
        }
        public String eliminarMascota(String identificacion){
            Mascota mascotaEncontrado = null;
            mascotaEncontrado = buscarMascota(identificacion);
            if(mascotaEncontrado ¡=null) {
                listaMascota.remove(mascotaEncontrado);
                System.out.println("Mascota eliminada exitosamente");
                return "Mascota eliminada exitosamente";
            }else{
                return "Mascota no exite";
            }
        }


       public String actualizarMascota(String identificacion,Mascota nuevaInformacion){
        String resultado = "";
        Mascota mascotaEncontrado = null;

        mascotaEncontrado = buscarMascota(identificacion);
        if(mascotaEncontrado != null){
            mascotaEncontrado.setNombres(nuevaInformacion.getNombre());
            resultado = "La informacion de la mascota fúe actualizada correctamente";
        }else{
            resultado = "La mascota no existe";
        }

        return resultado;
    }


    public String actualizarMascota(String identificacionActual,String nuevoNombre){
        String resultado = "";
        Mascota mascotaEncontrado = null;

        mascotaEncontrado = buscarMascota(identificacionActual);
        if(mascotaEncontrado != null){
            mascotaEncontrado.setNombre(nuevoNombre);
            resultado = "La informacion de la mascota fúe actualizada correctamente";
        }else{
            resultado = "La mascota no existe";
        }

        return resultado;
    }

    public String actualizarMascota(String identificacionActual,String nuevoNombre,String nuevoEdad,String nuevoPeso){
        String resultado = "";
        Mascota mascotaEncontrado = null;

        mascotaEncontrado = buscarMascota(identificacionActual);
        if(mascotaEncontrado != null){
            mascotaEncontrado.setNombre(nuevoNombre);
            mascotaEncontrado.setEdad(nuevoEdad);
            mascotaEncontrado.setPeso(nuevoPeso);
            resultado = "La informacion de la mascota fúe actualizada correctamente";
        }else{
            resultado = "La mascota no existe";
        }

        return resultado;
    }

}

