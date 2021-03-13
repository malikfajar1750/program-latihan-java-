    import java.util.Scanner;
    public class tugasDua{
      private static Scanner sc;

	public static void main(String[]args){
      sc = new Scanner (System.in);
        float tinggiBadan, beratBadan,BMI,cm;
        System.out.println("Masukkan Berat Badan Anda(kg):"); beratBadan = sc.nextInt();
        System.out.println("Masukkan Tinggi Badan Anda(cm):"); cm =sc.nextInt();
        tinggiBadan = cm/100;
        BMI = beratBadan/(tinggiBadan*tinggiBadan);
        System.out.println("Body Mass Index anda adalah :" +BMI);
      }
    }