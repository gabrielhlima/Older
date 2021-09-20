import java.util.Scanner;

import entities.Older;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Older old1 = new Older();
		Older old2 = new Older();
	
		System.out.println("Informe o nome da primeira pessoa:");
		old1.name = sc.nextLine();
		System.out.println("Informe a idade da primeira pessoa");
		old1.age = sc.nextInt();
		sc.nextLine(); // limp o buffer do teclado
		System.out.println("Informe o nome da segunda pessoa:");
		old1.name = sc.nextLine();
		System.out.println("Informe a idade da segunda pessoa:");
		old2.age = sc.nextInt();
		
		
		System.out.println("A primeira pessoa é " + old1.name + " e tem " + old1.age + " anos");
		System.out.println("A segunda pessoa é " + old2.name + " e tem " + old2.age + " anos");
		
		
		if (old1.age > old2.age) {
			System.out.println(old1.name + " é a pessoa mais velha");
		} else {
			System.out.println(old2.name + " é a pessoa mais velha");
		}
		
		
		

		sc.close();
	}

}
