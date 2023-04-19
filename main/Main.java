public class Main {
    public static void main(String[] args) {
        Especialidad
        // Crear especialidades
        Especialidad especialidad1 = new Especialidad(1, "Ingeniería de Sistemas");
        Especialidad especialidad2 = new Especialidad(2, "Ingeniería en Software");

        // Crear alumnos
        Alumno alumno1 = new Alumno(1001, "Juan Pérez");
        Alumno alumno2 = new Alumno(1002, "María García");

        // Crear catedráticos
        Catedratico catedratico1 = new Catedratico("ABC123", "Luis Ramírez");
        Catedratico catedratico2 = new Catedratico("XYZ456", "Ana Torres");

        // Crear materias
        Materia materia1 = new Materia(1, "Programación Orientada a Objetos");
        Materia materia2 = new Materia(2, "Bases de Datos");

        // Crear grupos
        Alumno[] alumnosGrupo1 = { alumno1, alumno2 };
        Grupo grupo1 = new Grupo("G1", materia1, catedratico1, 10, 101, alumnosGrupo1);
        Grupo grupo2 = new Grupo("G2", materia2, catedratico2, 11, 102, new Alumno[] { alumno1 });

        // Mostrar información de los objetos creados
        System.out.println("Especialidad 1: " + especialidad1.getNombre());
        System.out.println("Alumno 1: " + alumno1.getNombre());
        System.out.println("Catedrático 2: " + catedratico2.getNombre());
        System.out.println("Materia 1: " + materia1.getNombre());
        System.out.println("Grupo 1, Materia: " + grupo1.getMateria().getNombre() +
                ", Catedrático: " + grupo1.getCatedratico().getNombre() +
                ", Alumnos: " + grupo1.getAlumnos().length);
    }
}
