import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String nombre;
    try {
      System.out.print("Ingresa tu nombre: ");
      nombre = sc.next();
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
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println("Aprendi a contar en pares, quieres ver? (y/n)");
    char decision;
    try {
      decision = (char) sc.next().charAt(0);
      switch (decision) {
        case 'y':
          System.out.println("Vaa, preparate");
          List<Integer> pares = new ArrayList<Integer>();
          for (int i = 2; i <= 100; i = i + 2) {
            pares.add(i);
          }
          for (int par : pares) {
            System.out.println(par);
          }
          System.out.println("Listoo, gracias por tu interes, ahora bye");
          break;
        case 'n':
          System.out.println("Ash, que aburrido, ya vete mejor");
          break;
        default:
          System.out.println("Si estas poniendo atención? Ya mejor alejate de mi vista");
          break;
      }
    } catch (Exception e) {
      System.out.println(e);
    }

    sc.close();
  }
}
