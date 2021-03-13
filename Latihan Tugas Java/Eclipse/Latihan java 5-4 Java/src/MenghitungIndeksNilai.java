import java.util.Scanner;

public class MenghitungIndeksNilai {
	static int	nilai;
	static char indeks;
	static Scanner scan;
	
	public static void run()
	{
		scan = new Scanner (System.in);
		System.out.println("Masukan nilai(120):");
		nilai =scan.nextInt();
				
		
		if (nilai> 81)
			indeks = 'A';
		else
			if(nilai >61)
					indeks ='B';
		else
			if (nilai >41)
						indeks ='C';
		else
			if (nilai >21)
						indeks ='D';
		else
			indeks ='E';
		
		System.out.printf("Nilai %d habis dibagi 2\n");
		System.out.printf("indeks: %n \n", indeks);
	}
	public static void main(String[] args) {
	run();
	}
}
