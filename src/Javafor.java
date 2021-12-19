import java.util.Scanner;
public class Javafor {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int pilihan, awal, akhir;

		System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN GANJIL");
		System.out.println("-------------------------------------------------");
		System.out.print("Masukan Pilihan [BILANGAN Ganjil]: ");
		pilihan=input.nextInt();
		System.out.print("Masukan Nilai Awal : ");
		awal=input.nextInt();
		System.out.print("Masukan Nilai Akhir : ");
		akhir=input.nextInt();
		System.out.println("--------------------------- ");
			System.out.println("Deret Bilangan Ganjil");
			for(int i=awal;i<=akhir;i++){
				if (i%2!=0)
					System.out.print(i+" ");
			} 
		System.out.println("");
	}
}