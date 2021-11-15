/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepeda;

/**
 *
 * @author taqi
 */
public class Constants {
    static final String DROP_TABLE_SEPEDA = "DROP TABLE IF EXISTS sepeda";
    static final String CREATE_TABLE_SEPEDA_STMT = "CREATE TABLE IF NOT EXISTS sepeda( sepeda_id varchar(255) not null, ukuran varchar(10) not null, nama varchar(255) not null, harga_satuan int not null, stok int not null, primary key (sepeda_id) );";
    static final String CREATE_TABLE_PENJUALAN_STMT = "CREATE TABLE IF NOT EXISTS penjualan( id int not null auto_increment, sepedaId varchar(255) not null );";
    static final String INSERT_TO_SEPEDA_TABLE_PREPARED_STMT = "INSERT INTO sepeda(sepeda_id, ukuran, nama, harga_satuan, stok) VALUES (?,?,?,?,?);";
    static final String SELECT_SEPEDA_ORDER_BY_NAMA_ASC_STMT = "SELECT * FROM sepeda ORDER BY nama ASC;";
    static final String SELECT_SEPEDA_BY_ID_LIMIT_1_PREPARED_STMT = "SELECT * FROM sepeda WHERE sepeda_id = ? LIMIT 1";
    static final String DECREMENT_STOK_SEPEDA_BY_ONE_PREPARED_STMT = "UPDATE sepeda SET stok = stok - 1 WHERE sepeda_id = ? and stok > 0";
}
