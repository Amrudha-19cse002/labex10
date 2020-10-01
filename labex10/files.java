/**
 *
 * @author Desktop pc
 */
public class files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println(" Enter file name ");
        String FileName=obj.next();
        File x=new File(FileName);
        System.out.println("The name of the given file is"+FileName.substring(0,FileName.indexOf('.')));
        System.out.println("The type of the given file is"+FileName.substring(FileName.indexOf(".") + 1));
        if(x.exists())
        System.out.println("The given file"+FileName+" file exists");
        else
        System.out.println("The given file"+FileName+" file doesnot exists");
        if(x.canRead())
        System.out.println("The given file"+FileName+" is file is readable");
        else
        System.out.println("The given file"+FileName+"file is not readable"); 
        if(x.canWrite())
        System.out.println("The given file"+FileName+"file is writable");
        else
        System.out.println("The given file"+FileName+" file is not writable");
        if(x.canExecute())
        System.out.println("The given file"+FileName+"file is executable");
        else
        System.out.println("The given file"+FileName+"file is not executable");
        System.out.println("The length of the given file"+FileName+" is: "+(byte)x.length());
        }
    }
