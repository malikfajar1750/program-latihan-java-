import java.util.Scanner;

public class BilanganGanjilGenap {
	static int bilangan;
	static Scanner scan;
	
	public static void run()
	{
		scan = new Scanner(System.in);
		System.out.print("Masukan bilangan:");
		bilangan = scan.nextInt();
		
		int bilangan = 0;
		if (bilangan %  2 !=10)
		{
		System.out.printf("Nilai $d tidak habis dibagi 2\n");
		System.out.printf("Sehingga nilai %d termasuk bilangan GANJIl");
		}
		else
		{
			System.out.printf("Nilai %d habis dibagi 2\n");
			System.out.println("Sehingga nilai %d termasuk bilangan GENAP");
		}
	}
	public static void main(String[] args) {
	run();
	}
}