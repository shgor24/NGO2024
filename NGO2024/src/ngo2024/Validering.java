/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;

import java.time.LocalDate;

/**
 *
 * @author mikaela nilsson
 */
public class Validering {

    /**
     * En metod som kontrollerar om användarens input matchar det angivna
     * datumformatet och att bara heltal har skrivits i textfälten.
     */
    public static Boolean datumValidering(String anvInput) {
        Boolean rattFormat = false;
        //Här anges datumformatet som bör följas, alltså 4 heltal för året osv.
        String datumFormat = "\\d{4}-\\d{2}-\\d{2}";

        if (anvInput != null && anvInput.matches(datumFormat)) {
            rattFormat = true;
        } else {
            rattFormat = false;
        }

        return rattFormat;
    }

    public static Boolean manadsValidering(String anvInput) {
        Boolean rattFormat = false;

        try {
            if (anvInput != null && !anvInput.trim().isEmpty()) {
                String angivetManad = anvInput.substring(5, 7);

                //Skapar en int variabel av den hämtade månaden
                int manad = Integer.parseInt(angivetManad);

                //Kontrollerar om användaren har skrivit en giltig månad
                if (manad > 0 && manad <= 12) {
                    rattFormat = true;
                }

            }
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

        return rattFormat;
    }

    public static Boolean dagValidering(String anvInput) {
        Boolean rattFormat = false;

        try {
            if (anvInput != null && !anvInput.trim().isEmpty()) {
                String angivetDag = anvInput.substring(8);

                //Skapar en int variabel av den hämtade dagen
                int dag = Integer.parseInt(angivetDag);

                //Kontrollerar om användaren har skrivit en giltig dag
                if (dag > 0 && dag <= 31) {
                    rattFormat = true;
                }

            }

        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

        return rattFormat;
    }

    //En metod som kontrollerar om startdatumet som angivits är tidigare än slutdatumet
    public static Boolean giltigDatumSpan(String startdatum, String slutdatum) {

        Boolean giltig = false;

        if (!startdatum.trim().isEmpty() && !slutdatum.trim().isEmpty()) {
            //Skapar LocalDate variabler av de angivna datumen
            LocalDate start = LocalDate.parse(startdatum);
            LocalDate slut = LocalDate.parse(slutdatum);

            //Anropar metoden isBefore() från LocalDate, som kontrollerar om startdatum < slutdatum
            giltig = start.isBefore(slut);
        }

        return giltig;
    }

}
