import java.util.Scanner;

public class ProgramKeluaraan {

	static int p;
	static int l;
	static int luas;
	static Scanner scan;
	
	public static void run()
	{
		scan = new Scanner (System.in);
		System.out.println("Masukan panjang dan lebar:");
		p = scan.nextInt();
		l = scan.nextInt();
		luas = p *l;
		System.out.printf("p: %d, L: %d	\n", p, l);
		System.out.printf("luas persegi  panjang: %d \n", luas);
	}
	public static void main(String[] args) {
	run();
	}
}
