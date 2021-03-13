import java.util.Scanner;

public class MasukanGajipokok {
	
	static String golongan;
	static int gaji, tunjangan, total;
	private static Scanner sc;
	 
	 public static void run() {
	  
	  sc = new Scanner(System.in);
	  System.out.print("Masukkan Gaji Pokok    : ");
	  gaji = sc.nextInt();
	  System.out.print("Masukkan Golongan (1-3): ");
	  golongan = sc.next();
	  
	  
	  
	  if (golongan.equalsIgnoreCase("1")) {
	   tunjangan = gaji * 5/100;
	   total = gaji + tunjangan;
	   output();
	  } else if (golongan.equalsIgnoreCase("2")) {
	   tunjangan = gaji * 10/100;
	   total = gaji + tunjangan;
	   output();
	  } else if (golongan.equalsIgnoreCase("3")) {
	   tunjangan = gaji * 15/100;
	   total = gaji + tunjangan;
	   output();
	  } else if (golongan.equalsIgnoreCase("3")) {
		   tunjangan = gaji * 15/100;
		   total = gaji + tunjangan;
		   output();
	   
	  } else {
	   System.out.println("Inputan Salah!");
	  }
	  
	 }
	 
	 public static void output() {
	  System.out.println();
	  System.out.println("Informasi Gaji Pegawai");
	  System.out.println("======================");
	  System.out.println("Gaji Pokok  : " + gaji); System.out.println("Golongan    : " + golongan);
	  System.out.println("Tunjangan   : " + tunjangan); System.out.println("Gaji Total  : " + total);
	  System.out.println("======================");
	 }

	 public static void main(String[] args) {
	 run();
	 }

}
