import java.util.Scanner;

public class a {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int numero;
    boolean es_primo = true;

    System.out.print("Ingrese un número: ");
    numero = input.nextInt();

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
    input.close();
  }

}