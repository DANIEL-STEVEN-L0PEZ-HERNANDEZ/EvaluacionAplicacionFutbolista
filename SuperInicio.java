public abstract class SuperInicio {

     /*Examine las tres clases presentadas en la imagen y extraiga los elementos
comunes que se pueden declarar en una superclase. Después, desarrolle la
estructura de clases implementando los pilares: Abstracción, Polimorfismo,
Encapsulamiento y Herencia de la Programación Orientada a Objetos en el
lenguaje Java. */

    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public SuperInicio() {
    }

    public SuperInicio(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void concentrarse();

    public abstract void viajar();
}