//Se importa implementación de List, ArrayList, Collections y Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persona {
    private String nombre;
    private String apellido;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

// Main class
public class ListarPersonasGarcia {
    public static void main(String[] args) {
        // Creación de la lista de personas
        List<Persona> personas = new ArrayList<>();

        // Creación de 5 objetos Persona con nombres y apellidos aleatorios
        personas.add(new Persona("Juan", "González"));
        personas.add(new Persona("María", "Pérez"));
        personas.add(new Persona("Carlos", "Gómez"));
        personas.add(new Persona("Laura", "Hernández"));
        personas.add(new Persona("Pedro", "López"));

        // Se ordena la lista por nombre
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Se ordena la lista por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Se ordena la lista inversamente por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }
    }
}
