package rezzandre.example.com.tastindo;

/**
 * Created by Sam on 10/12/2017.
 */

public class Item {
    private int img;
    private String judul;
    private String deskripsi;
    private String cara;
    private String bahan;

    public Item(int img, String judul, String deskripsi, String bahan, String cara) {
        this.img = img;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.cara = cara;
        this.bahan = bahan;
    }



    public int getImg() {
        return img;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getCara() {return cara;}

    public String getBahan() {return  bahan;}
}
