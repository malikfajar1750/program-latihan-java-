import java.util.Scanner;
public class tugasSatu {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    float phi,r,L,K;
    phi= (float)3.14;
    System.out.print("Masukan panjang jari jari(cm):");r = sc.nextInt();
    L= phi*r*r;
    K= phi*r*2;
    System.out.println("Luas = "+L +" cm");
    System.out.println("Keliling = "+K +" cm");
    }
}

