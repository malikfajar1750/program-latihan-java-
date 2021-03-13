import java.util.Scanner;

public class SwicthNilai {
	static int i;
	static Scanner scan;
	
	public static  void run()
	{
		scan= new Scanner(System.in); 
		System.out.print("Nilai");
		i = scan.nextInt();
		switch(i)
		{
		case 10:System.out.println("sepuluh"); 
		case 20:System.out.println("duapuluh");
		case 30:System.out.println("Tigapuluh");
		default: System.out.println("Tidak sesuai");
		}
	}
	public static void main(String[] args) {
	run();
	}
}
