import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una letra: ");
	    char letra = sc.next().charAt(0);

	    int codigo = letra;

	    System.out.println("Caracter: " + letra);
	    System.out.printf("Codigo Unicode: U+%04X%n", codigo);

	}

}