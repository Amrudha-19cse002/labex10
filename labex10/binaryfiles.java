/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labex10;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Desktop pc
 */
//first program
public class binaryfiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // TODO code application logic here
        FileInputStream fio=null;
        FileOutputStream fou=null;
        fio=new FileInputStream("input.jpeg");
        fou=new FileOutputStream("output.jpeg");
        int i;
        while((i=fio.read())!=-1)
            fou.write(i);
    }
}
