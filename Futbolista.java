public abstract class Futbolista extends SuperInicio {

    // Atributos específicos de la clase Futbolista
    private int dorsal;
    private String demarcación;

    // Constructores vacio y con parámetros heredados de SuperInicio
    Futbolista(){
        super();
    }


    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcación) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

// Getters y Setters para los atributos específicos encapsulamiento
    public int getDorsal() {
        return dorsal;
    }


    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


    public String getDemarcación() {
        return demarcación;
    }


    public void setDemarcación(String demarcación) {
        this.demarcación = demarcación;
    }

// Métodos abstractos que deben ser implementados por las subclases
    @Override
    public abstract void concentrarse();

    @Override
    public abstract void viajar();

    // Métodos específicos de la clase Futbolista
    public void jugarPartido() {
        System.out.println("El futbolista " + getNombre() + " " + getApellido() + " está jugando un partido.");
    }
    public void entrenar() {
        System.out.println("El futbolista " + getNombre() + " " + getApellido() + " está entrenando.");
    }
    

}
