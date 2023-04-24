public class Materia {
    private int id;
    private String nombre;

    // Constructor
    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        // Declarar un arreglo estático de tamaño 3
        Materia[] materias = new Materia[3];

        // Inicializar los elementos del arreglo
        materias[0] = new Materia(1, "Matemáticas");
        materias[1] = new Materia(2, "Historia");
        materias[2] = new Materia(3, "Inglés");
    }
}