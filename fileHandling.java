package diamond;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args)
    {
        File myfile = new File("myfirstfile.txt");
        try{
            myfile.createNewFile();
            FileWriter filewrite = new FileWriter("myfirstfile.txt");
            filewrite.write("This is my 1st file made using java.\nHave a great Day.\nThank You\nBYE");
            filewrite.close();
            Scanner sc= new Scanner(myfile);
            while(sc.hasNextLine())
            {
                String s= sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println("Sorry some error occured!" + e);
            e.printStackTrace();
        }
    }    
}
