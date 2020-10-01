
/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 *
 * @author Desktop pc
 */
public class threeletterprgm{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // TODO code application logic here
        BufferedReader obj=new BufferedReader(new FileReader("file.txt"));
        String read;
        int x=1,count=0;
        String str[];
        while((read=obj.readLine())!=null)
        {
            str=read.split(" ");
            for(x=0;x<str.length;x++)
            {
                System.out.print("*"+str[x]+"\n");
                if(str[x].length()==3)
                    count++;
            }
        }
        System.out.println("Three Letter Word"+count);
        obj.close();
    }
}
