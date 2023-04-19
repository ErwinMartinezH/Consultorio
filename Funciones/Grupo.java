public class Grupo {
    private String clave;
    private Materia materia;
    private Catedratico catedratico;
    private int hora;
    private int salon;
    private Alumno[] alumnos;

    public Grupo(String clave, Materia materia, Catedratico catedratico, int hora, int salon, Alumno[] alumnos) {
        this.clave = clave;
        this.materia = materia;
        this.catedratico = catedratico;
        this.hora = hora;
        this.salon = salon;
        this.alumnos = alumnos;
    }

    public String getClave() {
        return clave;
    }

    public Materia getMateria() {
        return materia;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public int getHora() {
        return hora;
    }

    public int getSalon() {
        return salon;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }
}
