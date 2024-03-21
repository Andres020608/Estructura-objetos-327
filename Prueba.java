public class Prueba {
    public static void main(String[] args) {
        Persona datoPersona1 = new Persona("Juan", "Perez", 123456, 1940);
        System.out.println("Datos Persona 1");
        datoPersona1.imprimir();
        Persona datoPersona2 = new Persona("Maria", "Lopez", 654321, 1950);
        System.out.println("Datos Persona 2");
        datoPersona2.imprimir();
    }
}
