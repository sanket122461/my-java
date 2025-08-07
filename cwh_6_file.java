import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class cwh_6_file {
    public static void main(String[] args) {
        //code to create a new file
        File myFile = new File( "cwh111file.txt");
        try{
            myFile.createNewFile();
        }catch (IOException e){
            System.out.println("unable to create this file");
            e.printStackTrace();
        }
         try{
          FileWriter fileWriter =new FileWriter("cwh111file.txt");
          fileWriter.write("this is our first file this java course\n now ok bye");
          fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        //reading a file
        File myFile1 =new File("cwh111fil.txt");
        try {
            Scanner sc =new Scanner(myFile);
            // Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line =sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        File myFile2=new File("cwh111file.txt");
        if(myFile2.delete()){
            System.out.println("i have deletd:" + myFile2.getName());
        }
        else{
            System.out.println("some problem occured while deleting the file");
        }
        
    }
    
}
