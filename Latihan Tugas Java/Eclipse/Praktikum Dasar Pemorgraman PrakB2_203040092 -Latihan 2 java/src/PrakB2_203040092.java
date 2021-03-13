import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrakB2_203040092 {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Inputkan nama:");
		String nama =br.readLine();
		System.out.println("Inputkan pelajar:");
		String pelajar =br.readLine();
		System.out.println("Nama kamu adalah " + nama);
		System.out.println("Dan Kamu Seorang Mahasiswa Informatika Unpas " + pelajar);
	}

}
