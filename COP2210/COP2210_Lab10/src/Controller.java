import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controller {
  public static void main(String[] args) {
    //Step 0
    yourInfoHeader();
//--------------------------
// Step 1
//--------------------------
    System.out.println();
    System.out.println();
    System.out.println("=========================================");
    System.out.println("Data.txt output");
    System.out.println("=========================================");
    try{
// use this if you are on a mac
      String fileLocation = "./Data/data.txt";

      BufferedReader br = new BufferedReader(new FileReader("./Data/data.txt"));
      String line;
      String strCurrentLine;
      while((strCurrentLine = br.readLine())!=null) {
        System.out.println(strCurrentLine);
      }//end while
    }catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void yourInfoHeader() {
    //
  }
}
