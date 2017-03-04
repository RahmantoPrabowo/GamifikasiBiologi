/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import jxl.read.biff.BiffException;
import model.Soal;

/**
 *
 * @author prastowo
 */
public class JawabanChecker {
    public String soal[][] = null;
    public String jawaban;
    public int soalke;
    
    public void setSoal(String[][] soal){
        this.soal = soal;
    }
    
    public void setJawaban(String jawaban){
        this.jawaban = jawaban;
    }
    
    public void setSoalke(int soalke){
        this.soalke = soalke;
    }
    
    public boolean cekJawaban(String jawab) {
        return jawab.equalsIgnoreCase(soal[soalke][1]);
    }
    
    
}
