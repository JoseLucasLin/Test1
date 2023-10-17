import java.util.Scanner;

public class JavaAleatorio{
public static void main(String[] args) {
	String out;
System.out.println("aqui va el mensaje que quiero transmitir");
Scanner input = new Scanner(System.in);
out = input.nextLine();
int numero = out.length();
System.out.println(numero);
	if (numero == 5){
		System.out.println("has ganado");
	}else {
		System.out.println("intentalo de nuevo");
		main();
	}
	}
}

