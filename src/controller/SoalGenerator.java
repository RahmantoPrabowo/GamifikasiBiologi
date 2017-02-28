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
public class SoalGenerator {
    Soal s;
    String soal[][];
    
    public SoalGenerator(){
        s = new Soal();
    }
    
    public String[][] getSoal(){
        
        soal = s.importSoal();
        
        return soal;
    }
    
    public void generateSoal(){
        
    }
}
