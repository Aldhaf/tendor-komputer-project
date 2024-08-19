/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package LoginRegister;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Ridho Gymnastiar Al Rasyid
 */
public interface FormatRupiah {
    NumberFormat kurensiIndonesia = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
    default String formatRp(double duit){
        return "Rp. " + kurensiIndonesia.format(duit).substring(2, kurensiIndonesia.format(duit).length() - 3);
    }
}
