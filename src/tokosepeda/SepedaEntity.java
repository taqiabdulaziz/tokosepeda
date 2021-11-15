/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepeda;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author taqi
 */
public class SepedaEntity {
    private String sepedaId;
    private String ukuran;
    private String nama;
    private int stok;
    private int hargaSatuan;

    public SepedaEntity(String ukuran, String nama, int stok) {
        this.ukuran = ukuran;
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = Helper.generateHargaSatuanByUkuran(ukuran);
        this.sepedaId = Helper.generateSepedaIdByUkuran(ukuran);
    }
    
    public SepedaEntity(ResultSet rs) throws SQLException {
        this.ukuran = rs.getString("ukuran");
        this.nama = rs.getString("nama");
        this.stok = rs.getInt("stok");
        this.hargaSatuan = rs.getInt("harga_satuan");
        this.sepedaId = rs.getString("sepeda_id");
    }

    public String getSepedaId() {
        return sepedaId;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getNama() {
        return nama;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getStok() {
        return stok;
    }
}
