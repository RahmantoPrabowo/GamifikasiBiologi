/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.read.biff.BiffException;
import model.Soal;

/**
 *
 * @author prastowo
 */
public class SoalGenerator {
    Soal s;
    public int babke;
    String soal[][];
    
    public SoalGenerator(){
        s = new Soal();
    }
    
    public void setBab(int babke){
        this.babke = babke;
        s.set_babke(babke);
    }
    
    public int getBab(){
        return babke;
    }
    
    public String[][] getSoal() throws IOException, BiffException{    
        soal = s.importSoal();
            
        return soal;
    }
    
    public void generateSoal(){
        
    }
}
