/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// denna kod initierar en Java-applikation för NGO 2024, möjliggör anslutning till en MySQL-databas och öppnar inloggningsfönstret för användaren.

package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;

public class NGO2024 {
    
    private static InfDB idb;
  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
          idb = new InfDB("ngo_2024", "3306", "dbAdmin2024", "dbAdmin2024PW");
          new Inloggning(idb).setVisible(true);
     }catch (InfException ex){
      System.out.println(ex.getMessage());
     }
    }
    
    }
