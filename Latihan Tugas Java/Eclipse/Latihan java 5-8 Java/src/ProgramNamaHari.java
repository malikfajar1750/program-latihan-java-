import java.util.Scanner;

public class ProgramNamaHari {
	static int hari;
	static Scanner scan;
	public static void run ()
	{
		System.out.println("|1=senin, 2=selasa, 3=rabu,	4=kamis |");
		System.out.println("|5=jumaat,6=sabtu 7=ahad|\n");
		scan =new Scanner (System.in);
		System.out.print("hari:");
		hari =scan.nextInt();
		
		if	(hari==1)
			System.out.println("Senin");
		else if (hari ==2)
			System.out.println("Selasa");
		else if (hari ==3)
			System.out.println("Rabu");
		else if (hari ==4)
			System.out.println("Kamis");
		else if (hari ==5)
			System.out.println("jumat");
		else if (hari ==6)
			System.out.println("Sabtu");
		else
			System.out.println("Ahad");
	}
	public static void main(String[] args) {
	run();
	}

}