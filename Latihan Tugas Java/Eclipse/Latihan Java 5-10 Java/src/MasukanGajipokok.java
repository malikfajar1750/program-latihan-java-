import java.util.Scanner;

public class MasukanGajipokok {
	
	static String golongan;
	static int gaji, total;
	static double tunjangan;
	 
	 public static void run() {
	  
	  try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Masukkan Gaji Pokok    : ");
		  gaji = sc.nextInt();
		  System.out.print("Masukkan Golongan (A-D): ");
		  golongan = sc.next();
	}
	  switch(gaji){
      case 1 : 
    	  	  golongan= "A";
              gaji=2000000;
              tunjangan=250000;
              System.out.println();
        	  System.out.println("Informasi Gaji Pegawai");
        	  System.out.println("======================");
        	  System.out.println("Gaji Pokok  : " + gaji); System.out.println("Golongan    : " + golongan);
        	  System.out.println("Tunjangan   : " + tunjangan); System.out.println("Gaji Total  : " + total);
              break;
      case 2 :
    	  	  golongan= "B";
              gaji=2500000;
              tunjangan=2.5;
              System.out.println();
        	  System.out.println("Informasi Gaji Pegawai");
        	  System.out.println("======================");
        	  System.out.println("Gaji Pokok  : " + gaji); System.out.println("Golongan    : " + golongan);
        	  System.out.println("Tunjangan   : " + tunjangan); System.out.println("Gaji Total  : " + total);
              break;
      case 3 :
    	  	  golongan= "C";
              gaji=3000000;
              tunjangan=5.0;
              System.out.println();
        	  System.out.println("Informasi Gaji Pegawai");
        	  System.out.println("======================");
        	  System.out.println("Gaji Pokok  : " + gaji); System.out.println("Golongan    : " + golongan);
        	  System.out.println("Tunjangan   : " + tunjangan); System.out.println("Gaji Total  : " + total);
              break;
      case 4 :
    	  	  golongan="D";	
    	  	  gaji=4000000;
              tunjangan=7.5;
              System.out.println();
        	  System.out.println("Informasi Gaji Pegawai");
        	  System.out.println("======================");
        	  System.out.println("Gaji Pokok  : " + gaji); System.out.println("Golongan    : " + golongan);
        	  System.out.println("Tunjangan   : " + tunjangan); System.out.println("Gaji Total  : " + total);

              break;
      default :
              gaji=0;
              tunjangan=0;
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