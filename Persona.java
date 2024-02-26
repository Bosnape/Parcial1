// Abstraccion: creacion de la clase Persona con sus propiedades y metodos
public class Persona {

    // Encapsulamiento: dentro de la clase misma, las propiedades son privadas y solo pueden ser
    // modificadas mediantes loss setters y los getters.
    private String nombre;
    private int edad;
    private int estatura;
    private int sexo; // 0: Mujer  1: Hombre  2: No se sabe
    private String rol;

    // Polimorfismo: con el mismo mensaje del constructor se lleva a cabo un proceso diferentes
    // dependiendo de los parametros que se le pasen
    public Persona(String nombre, int edad, int estatura, int sexo, String rol){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
        this.rol = rol;
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = 0;
        this.sexo = 2;
        this.rol = "Sin rol";
    }

    // Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getEstatura(){
        return this.estatura;
    }
    public int getSexo(){
        return this.sexo;
    }
    public String getRol(){
        return this.rol;
    }

    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setEstatura(int estatura){
        this.estatura = estatura;
    }
    public void setSexo(int sexo){
        this.sexo = sexo;
    }
    public void setRol(String rol){
        this.rol = rol;
    }

    // Metodos adicionales

    // Comprobar si la persona es mayor de edad
    public boolean mayorDeEdad(){
        if (this.edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    // Imprimir una presentacion simple de la persona
    public void presentarse(){
        System.out.println("Me llamo " + this.nombre + ", tengo " + this.edad + " años y soy un(a) " + this.rol.toLowerCase());
    }

    // Retornar en un texto toda la informacion de la persona
    public String toString(){
        if (this.sexo == 0){
            return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nEstatura: " + this.estatura + "\nSexo: Femenino" + "\nRol: " + this.rol;
        } else {
            return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nEstatura: " + this.estatura + "\nSexo: Masculino" + "\nRol: " + this.rol;
        }
    }
}
