public abstract class Masajista extends SuperInicio{

    private String titulacion;
    private int aniosExperiencia;

    // Constructor vacío
    public Masajista() {
        super();
    }
    // Constructor con parámetros
    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getters y Setters para los atributos específicos
    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Métodos abstractos que deben ser implementados por las subclases
    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " " + getApellido() + " se está concentrando.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + getNombre() + " " + getApellido() + " está viajando con el equipo.");
    }

    // Métodos específicos de la clase Masajista
    public void darMasaje() {
        System.out.println("El masajista " + getNombre() + " " + getApellido() + " está dando un masaje.");
    }
}