import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Persona pl = new Persona("Martin", "Rosero", 20);
        Trabajador t1 = new Trabajador("Kevin", "Moreno", 21, 600);
        Trabajador t2 = new Trabajador("Erick", "Palomo", 21, 500);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(pl);
        personas.add(t1);
        personas.add(t2);

        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).mostrarInformacion();

        }
    }
}
