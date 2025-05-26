public abstract class Entrenador extends SuperInicio {
    public String idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public abstract void concentrarse();

    @Override
    public abstract void viajar();

    public void dirigirPartido() {
        System.out.println("El entrenador " + getNombre() + " " + getApellido() + " está dirigiendo un partido.");
    }
    public void dirigirEntrenamiento() {
        System.out.println("El entrenador " + getNombre() + " " + getApellido() + " está dirigiendo un entrenamiento.");
    }
}