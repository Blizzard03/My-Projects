
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariq
 */
public class Barang {

    private int Kode_Barang;
    private String Nama_Barang;
    private int Harga;
    private int Jumlah;

    public Barang() {
        this.Kode_Barang = 0;
        this.Nama_Barang = "";
        this.Harga = 0;
        this.Jumlah = 0;
    }

    public Barang(int kb, String nb, int ha, int jh) {
        this.Kode_Barang = kb;
        this.Nama_Barang = nb;
        this.Harga = ha;
        this.Jumlah = jh;
    }

    public int getKode_Barang() {
        return Kode_Barang;
    }

    public void setKode_Barang(int KB) {
        this.Kode_Barang = KB;
    }

    public String getNama_Barang() {
        return Nama_Barang;
    }

    public void setNama_Barang(String NB) {
        this.Nama_Barang = NB;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Hrg) {
        this.Harga = Hrg;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jml) {
        this.Jumlah = Jml;
    }

   /*Perbandinggan untuk di urutkan dengan Nama Barang*/
    public static Comparator<Barang> perbedaan_barang = new Comparator<Barang>() {

        @Override
	public int compare(Barang b1, Barang b2) {
	   String namabarang1 = b1.getNama_Barang().toUpperCase();
	   String namabarang2 = b2.getNama_Barang().toUpperCase();

	   //ascending order
	   return namabarang1.compareTo(namabarang2);
        }
     };
    
@Override
  public String toString(){
  return "[ kodebarang=" + Kode_Barang + ", namabarang=" + Nama_Barang + ", harga=" + Harga + ", jumlah=" + Jumlah + "]";
  }
}
    
