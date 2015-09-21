import java.util.Scanner;

public class Main {
	
	private static Scanner clavier;

	public static void main(String[] args) {
		
		clavier = new Scanner(System.in);
		
		int x, y, z;
		
		// Début
		System.out.println("Entrez 3 valeurs :");
		x = clavier.nextInt();
		y = clavier.nextInt();
		z = clavier.nextInt();
		if ((x < 5 || y > 2) && z > 3){
			x = 1;
			if (z - y > 0){
				z = 0;
			}
			y = y + z;
		}else{ 
				x = z;
				z = y + z;
					}
		System.out.println("x="+x+"y="+y+"z="+z);
	}
}
		
	