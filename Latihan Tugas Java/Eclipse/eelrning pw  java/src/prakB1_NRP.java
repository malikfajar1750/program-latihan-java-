
import java.util.Scanner;
    
    public class prakB1_NRP {
        
        private static Object Usia = null;
		private static int usia2;

		public static void main(string[]args){
            String nama;
			String alamat;
            int gaji;
            Scanner Keyboard =new  Scanner(System.in);
            System.out.println("### pendaftaran karyawan PT.Petani Kode ###");
            System.out.print("Nama Karyawan: ");
            
            nama = Keyboard.nextLine();
            System.out.print("Alamat: ");
            alamat =Keyboard.nextLine();
            System.out.print("Usia: ");
            Usia=Keyboard.nextInt();
            System.out.print("Gaji: ");
            gaji= Keyboard.nextInt();
            
            System.out.println("");
            System.out.println("Nama Karyawan:" + nama);
            System.out.println("Alamat:" +alamat);
            System.out.println("Usia:" +Usia + "Tahun");
            System.out.println("Gaji:Rp" + gaji);
             
        }

		public static int getUsia2() {
			return usia2;
		}

		public static void setUsia2(int usia2) {
			prakB1_NRP.usia2 = usia2;
		}
    }