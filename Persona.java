
public class Persona {
    String nombre, apellido;
    int documentoIdentidad, anioNacimiento;
    public Persona(String nombre, String apellido, int documentoIdentidad, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.anioNacimiento = anioNacimiento;
    }
    void imprimir(){
        System.out.println("Nombre= "+nombre);
        System.out.println("Apellido = "+apellido);
        System.out.println("Documento de identidad = "+documentoIdentidad);
        System.out.println("Año de nacimiento = "+anioNacimiento);
    }



    
}