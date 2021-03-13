
public class PenentuanDiskon {
	static int itempembelian;
	static double totalpembelian;
	static double diskon;
	
	public static void run()
	{
		itempembelian = 10;
		totalpembelian = 250000;
		if (itempembelian >=10);
			diskon = 0.05 * totalpembelian;
		
		int bilangan = 0;
		if (bilangan %  2 !=10)
		{
		System.out.printf("Nilai $d tidak habis dibagi 2\n");
		System.out.printf("Sehingga nilai %d termasuk bilangan GANJIl");
		}
		else
		{
			System.out.printf("Nilai %d habis dibagi 2\n");
			System.out.println("Sehingga nilai %d termasuk bilangan GENAP");
		}
	}
	public static void main(String[] args) {
	run();
	}
}