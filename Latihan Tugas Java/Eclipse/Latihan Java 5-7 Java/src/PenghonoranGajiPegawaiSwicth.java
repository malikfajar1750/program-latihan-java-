import java.util.Scanner;

public class PenghonoranGajiPegawaiSwicth {
	static int gajipokok;
	static int golongan;
	double tunngan;
	static Scanner	scan;
	public static void run ()
	{
		scan = new Scanner (System.in);
		System.out.print("Masukan Gaji pokok:");
		gajipokok = scan.nextInt();
		System.out.println("Masukan Golongan (1-3):");
		golongan =scan.nextInt();
		
		double tunjangan = 0;
		switch (golongan)
		{
		case 1:	tunjangan = 0.05 *	gajipokok;break;
		case 2:	tunjangan = 0.05 *	gajipokok;break;
		case 3: tunjangan = 0.05 *  gajipokok;break;
		default: System.out.println("Golongan tidak ada");
		}
		
		System.out.printf("\nlnformasi Gaji pegawai:\n");
		System.out.printf("=========================\n");
		System.out.printf("Gaji Pokok: %d \n",gajipokok);
		System.out.printf("Golongan: %d \n", golongan);
		System.out.printf("Tunjangan: %.2f \n", tunjangan);
		System.out.printf("Gaji total: %.2f \n",(gajipokok +tunjangan));
		System.out.printf("========================\n");
		}
		public static void main(String[] args) {
		run();
		}
}
