import java.util.Scanner;

public class ProgramNamaHari2 {
	static int hari;
	static Scanner scan;
	public static void run ()
	{
		System.out.println("senin-Ahad");
		scan =new Scanner (System.in);
		System.out.print("hari:");
		Scanner input;
		hari =scan.nextInt();
		switch (hari) 
		{
		case "senin":
			System.out.println("Besok hari senin Senin");
			break;
		case "selasa":
			System.out.println("Selasa");
			break;
			System.out.println("Rabu");
		case "kamis":
			System.out.println("Kamis");
			break;
		case "jumat":
			System.out.println("jumat");
			break;
		case "sabtu":
			System.out.println("Sabtu");
			break;
		case "Ahad":
			System.out.println("Ahad");
			break;
		default:
			System.out.println("Minggu depan");
		}
		
	}
