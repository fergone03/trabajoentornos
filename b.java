import java.util.Scanner;

public class b {

  public static void main(String[] args) {

    Scanner newbie = new Scanner(System.in);

    int numero;
    boolean es_primo = true;

    System.out.print("Ingrese un número: ");
    numero = newbie.nextInt();

    if (numero < 2) {
      System.out.println("El número debe ser mayor o igual a 2.");

    }

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        es_primo = false;
        break;
      }
    }

    if (es_primo) {
      System.out.println("El número es primo:" + numero);
    } else {
      System.out.println("El número no es primo:" + numero);
    }
    newbie.close();
  }

}