import java.util.Scanner; // Importa la clase Scanner 
class MainPaciente {
    public static void main (String [] args){ // Método principal de la clase
    int nss; // Declara una variable entera para el NSS
    String nombre; // Declara una variable de cadena para el nombre
    
    Scanner op = new Scanner (System.in); // Crea un objeto Scanner para leer la entrada del usuario
    Paciente cero = new Paciente (); // Crea un nuevo objeto de la clase Paciente llamado 'cero'
    
    System.out.println ("¿Cual es tu NSS?"); // Imprime un mensaje pidiendo al usuario el NSS
    nss=op.nextInt(); // Lee el NSS ingresado por el usuario
    cero.nss=nss; // Asigna el NSS ingresado al atributo 'nss' del objeto 'cero'
    
    System.out.println ("¿Cual es tu nombre completo?"); // Imprime un mensaje pidiendo al usuario su nombre completo
    nombre=op.nextLine(); // Lee el nombre completo ingresado por el usuario
    cero.nombre=nombre; // Asigna el nombre ingresado al atributo 'nombre' del objeto 'cero'
    
    cero.mostrarNss(); // Llama al método 'mostrarNss()' del objeto 'cero' para mostrar el NSS ingresado
    cero.mostrarNombre(); // Llama al método 'mostrarNombre()' del objeto 'cero' para mostrar el nombre ingresado
    }
}
