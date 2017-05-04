import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by garich01 on 4/6/2017.
 */
public class ReadTextFile {

    public  void readTextFile() throws FileNotFoundException {

        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the endpoint to hit");
        String url=reader.next();


        String classLoader = getClass().getClassLoader().getResource("file/WAFUrls.txt").getFile();
        Scanner in =new Scanner(new File(classLoader));


        while(in.hasNext()){
            String line=in.nextLine();
            String formedUrl=url+line;
            /* BaseSelenium.setupIE(formedUrl); */
            BaseSelenium.setupIE(formedUrl);

            //System.out.println(url+line);
        }

        in.close();



    }
}
