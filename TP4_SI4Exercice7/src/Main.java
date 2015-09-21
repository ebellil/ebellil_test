import java.util.Scanner;

public class Main {
	
	private static Scanner clavier;

	public static void main(String[] args) {
		
		clavier = new Scanner(System.in);
		
		int a, b, c;
		
		// Début
		System.out.println("Entrez 3 valeurs :");
		a = clavier.nextInt();
		b = clavier.nextInt();
		c = clavier.nextInt();
		if (a == b && a == c){
			System.out.println("Les 3 nombres sont égaux");
		}else{
			if (a == b || a == c || b == c){
				System.out.println("Il y a 2 égalités");
			}else{
				System.out.println("Il n'y aucune égalités");
			}
		}
	}
}
		
	