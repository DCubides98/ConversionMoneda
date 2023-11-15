import java.util.Scanner;

public class ConvertidorMoneda {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITA LA CANTIDAD EN EUROS: ");

        double euros = scanner.nextDouble();

        double TasaCambio = 1.07;

        double dolares = euros * TasaCambio;

        System.out.println(euros + " euros son iguales a " + dolares + " dolares");

        scanner.close();

    }

}