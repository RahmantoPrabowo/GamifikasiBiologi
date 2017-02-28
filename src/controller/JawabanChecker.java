/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Soal;

/**
 *
 * @author prastowo
 */
public class JawabanChecker {
    public String soal[][] = null;
    
    Soal soal1;
    
    public JawabanChecker(){
        soal1 = new Soal();
        soal = soal1.importSoal();
    }
    
    public boolean cekJawaban(String jawab) {
        return jawab.equalsIgnoreCase(soal[0][1]);
    }
    
    
}
