
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Desktop pc
 */
//first program
public class binaryfiles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,FileNotFoundException{
        // TODO code application logic here
        
        FileReader fr=null;
        FileWriter fw=null;
        fr=new FileReader("Input.jpeg");
        fw=new FileWriter("Output.jpeg");
        int j;
        while((j=fr.read())!=-1)
            fw.write(j);
    }
    
}
