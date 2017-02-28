/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author prastowo
 */
public class Soal {
    public String soal[][] = new String[1][5];
    
    public String[][] get_soal(){        
        return soal;
    }
    
    public String[][] importSoal(){
        soal[0][0] = "Hewan mamalia merupakan hewan . . .";
        soal[0][1] = "Beranak";
        soal[0][2] = "Menyusui";
        soal[0][3] = "Beranak";
        soal[0][4] = "Bertelur";
        
        return soal;
    }
}
