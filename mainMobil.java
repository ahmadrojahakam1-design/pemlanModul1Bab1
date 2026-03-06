package pemlanModul1Bab1;

import java.util.Scanner;

public class mainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        mobil m1 = new mobil();
        
        System.out.println("\n=== Input Data Mobil 1 ===");
        System.out.print("Masukkan Manufaktur: ");
        m1.setManufaktur(input.nextLine());
        
        System.out.print("Masukkan Nomor Plat: ");
        m1.setNoPlat(input.nextLine());
        
        System.out.print("Masukkan Warna     : ");
        m1.setWarna(input.nextLine());
        
        System.out.print("Masukkan Kecepatan (km/jam): ");
        double kecepatan1 = input.nextDouble();
        m1.setKecepatan(kecepatan1);
        
        System.out.print("Masukkan Waktu Tempuh (jam): ");
        double jam1 = input.nextDouble();
  
        m1.setWaktu(jam1); 
        
        input.nextLine();
        m1.hitungJarak();
        
        System.out.println("\n--- Informasi Mobil 1 ---");
        m1.displayMessage();
        
        System.out.println("==========================");

         mobil m2 = new mobil();
        
        System.out.println("\n=== Input Data Mobil 2 ===");
        System.out.print("Masukkan Manufaktur: ");
        m2.setManufaktur(input.nextLine());
        
        System.out.print("Masukkan Nomor Plat: ");
        m2.setNoPlat(input.nextLine());
        
        System.out.print("Masukkan Warna     : ");
        m2.setWarna(input.nextLine());
        
        System.out.print("Masukkan Kecepatan (km/jam): ");
        double kecepatan2 = input.nextDouble();
        m2.setKecepatan(kecepatan2);
        
        System.out.print("Masukkan Waktu Tempuh (jam): ");
        double jam2 = input.nextDouble();
  
        m2.setWaktu(jam2); 
        
        m2.hitungJarak();
        
        System.out.println("\n--- Informasi Mobil 2 ---");
        m2.displayMessage();
        
        System.out.println("==========================");
        
        
        input.close();
    }
}