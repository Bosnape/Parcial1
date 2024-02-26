public class ObjetosDePersona {
    public static void main(String[] args) {

        // Herencia: creacion de instancias a partir de la clase Persona
        Persona pedro = new Persona("Pedro", 20, 180, 1, "Estudiante");
        Persona juan = new Persona("Juan", 18, 167, 1, "Administrativo");
        Persona dora = new Persona("Dora", 25, 173, 0, "Docente");

        // Aplicacion de polimorfismo con el constructor
        Persona maria = new Persona("Maria", 17);

        // Comprobando los metodos adicionales
        System.out.println(pedro.toString() + "\n");
        pedro.presentarse();
        if (pedro.mayorDeEdad()){
            System.out.println("Pedro es mayor de edad");
        } else {
            System.out.println("Pedro es menor de edad");
        }

        // Comprobando algunos getters y setters
        System.out.println("\nNombre: " + maria.getNombre());
        System.out.println("Edad: " + maria.getEdad());
        System.out.println("Estatura: " + maria.getEstatura());

        maria.setEstatura(175);
        System.out.println("La nueva estatura de Maria es: " + maria.getEstatura());
    }
}