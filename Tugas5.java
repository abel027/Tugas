/*
	program 	: tugas5.java
	pembuat		: Muhammad Abbel Prasetya
	tanggal		: 24/09/2022
	deskripsi 	: menghitung bonus akhir tahun karyawan
	
*/
import java.util.Scanner;
public class Tugas5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int masakerja,umur,gol,bonus=0;
		System.out.println("===Program Bonus Karyawan===");
		System.out.print("Masukkan Masa Kerja Anda = ");
		masakerja = in.nextInt();
		System.out.print("Umur Anda = ");
		umur = in.nextInt();
		System.out.println("=====Golongan=====");
		System.out.println("1.Staff");
		System.out.println("2.Non Staff");
		System.out.print("Silahkan Pilih Golongan Anda = ");
		gol = in.nextInt();
		if(gol==1){
			if(masakerja >=5){
				if(umur>=45){
					bonus=10000000;
				}
				else{
					bonus=7000000;
				}	
			}
			else {
				bonus=5000000;
			}
		}
		else if(gol==2){
			if(masakerja>5 && umur>45){
				bonus=6000000;
			}
			else{
				bonus=2500000;
			}
		}
		System.out.println("Golongan = "+gol);
		System.out.println("Umur Karyawan = "+umur);
		System.out.println("Masa Kerja = "+masakerja);
		System.out.println("Bonus Anda = "+bonus);
	}
}