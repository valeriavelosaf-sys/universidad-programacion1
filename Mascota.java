package paquete;

public class Mascota {

    private String identificacion;
    private String nombre;
    private String especie;
    private String raza;
    private byte edad;
    private String color;
    private double peso;
    private String[]enfermedades;
    private int cantidadenfermedades;

    public Mascota(String identificacion, String nombre,String especie,String raza,byte edad,String color,double peso){
        this.identificacion=identificacion;
        this.nombre=nombre;
        this.especie=especie;
        this.raza=raza;
        this.edad=edad;
        this.color=color;
        this.peso=peso;
        this.enfermedades=new String[5];
        this.cantidadenfermedades=0;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public byte getEdad() {
        return edad;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }


}


