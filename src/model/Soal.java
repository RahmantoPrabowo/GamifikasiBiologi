/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author prastowo
 */
public class Soal {
    public String soal[][];
    public int babke;
    
    public void set_babke(int babke){
        this.babke = babke;
    }
    
    public String[][] importSoal() throws IOException, BiffException{
        File f = new File("C:\\Users\\prastowo\\GamifikasiBiologi\\Soal.xls");
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s = wb.getSheet(babke);
        int row = s.getRows();
        int col = s.getColumns();
        
        this.soal = new String[row][col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                Cell c = s.getCell(j, i);
                this.soal[i][j] = c.getContents();
                System.out.println(this.soal[i][j]);
            }
            System.out.println("+++");
            System.out.println(i);
        }
        
        /*
        soal[0][0] = "Hewan mamalia merupakan hewan . . .";
        soal[0][1] = "Beranak";
        soal[0][2] = "Menyusui";
        soal[0][3] = "Beranak";
        soal[0][4] = "Bertelur";
        */
        
        return this.soal;
    }
}
