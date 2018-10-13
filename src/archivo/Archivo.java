package archivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Brandon Vargas
 */
public class Archivo {

    public static void main(String[] args) throws IOException {

        /* String[] n={"Sape"};
        
        for(String s:n) {
            if(s.equals("Sape")) {
                System.out.println("Lo vi");
            }else {
                System.out.println("Verga");
            }
            
        }
        
        
        System.out.println("Sape");*/
        File file = new File("src/Nuevo/Sape.txt");
        FileWriter wfile = new FileWriter(file);
        BufferedWriter buffer = new BufferedWriter(wfile);

        buffer.write("La palabra de dios");
        buffer.close();

    }

}
