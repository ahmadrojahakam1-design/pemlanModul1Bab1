package pemlanModul1Bab1;

public class mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;
    private double jarak;

    public void setNoPlat (String s) {
        noPlat = s;
    }

    public void setWarna (String s) {
        warna = s;
    }

    public void setManufaktur (String s) {
        manufaktur = s;
    }

    public void setKecepatan (double i) {
        kecepatan = rubahKecepatan(i);
    }

     public void setWaktu (double jam) {
        waktu = rubahSekon(jam);
    }

    private double rubahSekon (double jam) {
        return jam * 3600;
    }

    private double rubahKecepatan (double kmh) {
        return kmh / 3.6;
    }

    public void hitungJarak() {
        jarak = kecepatan * waktu;
    }

    public void displayMessage () {
        double jarakKm = jarak / 1000; 

        System.out.println("Mobil anda bermerek      : " + manufaktur);
        System.out.println("Mempunyai nomor plat     : " + noPlat);
        System.out.println("Serta memiliki warna     : " + warna);
        System.out.println("Menempuh kecepatan (m/s) : " + kecepatan);
        System.out.println("Waktu yang ditempuh (s)  : " + waktu);
        System.out.println("Jarak yang ditempuh (Km) : " + jarakKm);
    }
}
