/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokosepeda;

import java.util.Random;

/**
 *
 * @author taqi
 */
public class Helper {
    static int generateHargaSatuanByUkuran(String ukuran) {
        switch (ukuran) {
            case "Kecil": return 500_000;
            case "Sedang": return 900_000;
            default: return 1_500_000;
        }
    }

    static String generateSepedaIdByUkuran(String ukuran) {
        String prefix = "B";
        Random rand = new Random(); 
        int n = rand.nextInt(999);
        prefix += ukuran.charAt(0);
        String formatted = String.format("%03d", n);
        prefix += formatted;

        return prefix;
    }
}
