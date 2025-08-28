package paquete;

public class App {
public static void main(String[] args) {
    String identificacion = "12345";
    String nombre = "michi";
    String especie = "Gato";
    String raza = "British Shorthair";
    byte edad = 3;
    String color = "Gris";
    String peso = "4 kg";
    String enfermedades = "ninguna";

    var mascota1 = new Mascota (identificacion,nombre,especie,raza,edad,color,peso, enfermedades);
    System.out.println(mascota1);

}
    
    }

