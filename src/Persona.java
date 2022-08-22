public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarInformacion(){
        System.out.println("Persona: "+ nombre+" "+apellido+ " "+"edad: "+edad);
    }
}
