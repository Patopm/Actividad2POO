import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String nombre = pedirNombre();
    saludar(nombre);

    if (preguntarSiContarPares()) {
      contarPares();
    }

    sc.close();
  }

  private static String pedirNombre() {
    System.out.print("Ingresa tu nombre: ");
    return sc.next();
  }

  private static void saludar(String nombre) {
    switch (nombre.toLowerCase()) {
      case "pato":
        System.out.println("Quak");
        break;
      case "":
        System.out.println("Se supone que tienes que poner un nombre .-.");
        break;
      default:
        System.out.println("Hola " + nombre);
        break;
    }
  }

  private static boolean preguntarSiContarPares() {
    System.out.println("Aprendi a contar en pares, quieres ver? (y/n)");
    char decision = sc.next().charAt(0);
    switch (decision) {
      case 'y':
        System.out.println("Vaa, preparate");
        return true;
      case 'n':
        System.out.println("Ash, que aburrido, ya vete mejor");
        return false;
      default:
        System.out.println("Si estas poniendo atención? Ya mejor alejate de mi vista");
        return false;
    }
  }

  private static void contarPares() {
    List<Integer> pares = new ArrayList<>();
    for (int i = 2; i <= 100; i += 2) {
      pares.add(i);
    }
    pares.forEach(System.out::println);
    System.out.println("Listoo, gracias por tu interes, ahora bye");
  }
}
