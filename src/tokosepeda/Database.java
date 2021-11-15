/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepeda;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taqi
 */
public class Database {
    Connection con;
    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jfs", "jfs_user", "p@ssw0rd123");
            this.initialSetup();
            System.out.println("Koneksi berhasil");
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan initial setup");
        } catch (Exception e) {
            System.out.println("Internal server Error");
        }
    }
    
    void initialSetup() throws SQLException {        
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(Constants.DROP_TABLE_SEPEDA);
            stmt.executeUpdate(Constants.CREATE_TABLE_SEPEDA_STMT);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }
    
    void create(SepedaEntity sepeda) {
        try {
            PreparedStatement p = con.prepareStatement(Constants.INSERT_TO_SEPEDA_TABLE_PREPARED_STMT);
            p.setString(1, sepeda.getSepedaId());
            p.setString(2, sepeda.getUkuran());
            p.setString(3, sepeda.getNama());
            p.setInt(4, sepeda.getHargaSatuan());
            p.setInt(5, sepeda.getStok());
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    ArrayList<SepedaEntity> getAllSepeda() throws SQLException, NoDataException {
        ArrayList<SepedaEntity> sepedaEntities = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Constants.SELECT_SEPEDA_ORDER_BY_NAMA_ASC_STMT);

            if (rs.isBeforeFirst() == false) throw new NoDataException();
            
            while(rs.next()) sepedaEntities.add(new SepedaEntity(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch(NoDataException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }

        return sepedaEntities;
    }
    
    ArrayList<SepedaEntity> findSepedaById(String id) throws Exception {
        ArrayList<SepedaEntity> sepedaEntities = new ArrayList<>();
        Statement stmt = con.createStatement();
        PreparedStatement p = con.prepareStatement(Constants.SELECT_SEPEDA_BY_ID_LIMIT_1_PREPARED_STMT);
        p.setString(1, id);
        ResultSet rs = p.executeQuery();
        if (rs.isBeforeFirst() == false) throw new SepedaNotExistsException();
        while(rs.next()) sepedaEntities.add(new SepedaEntity(rs));
        
        return sepedaEntities;
    }
    
    SepedaEntity sellSepedaById(String id) throws SepedaNotExistsException, NoDataException, SepedaNotFoundOrStockEmpty, SQLException, Exception {
        try {
            System.out.println(id);
            ArrayList<SepedaEntity> sepedaEntities = findSepedaById(id);
            if (sepedaEntities.isEmpty()) throw new SepedaNotExistsException();

            Statement stmt = con.createStatement();
            PreparedStatement p = con.prepareStatement(Constants.DECREMENT_STOK_SEPEDA_BY_ONE_PREPARED_STMT);
            p.setString(1, id);
            int rowsAffected = p.executeUpdate();
            if (rowsAffected == 0) throw new SepedaNotFoundOrStockEmpty();
            
            return sepedaEntities.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SepedaNotExistsException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }
}

class NoDataException extends Exception {};

class SepedaNotExistsException extends Exception {};

class SepedaNotFoundOrStockEmpty extends Exception {};