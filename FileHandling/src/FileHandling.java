import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
		
		
		try {
			File f=new File("MyFile.txt");
			FileWriter writer = new FileWriter("MyFile.txt");//this is for writing to a file
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("I am aslam ");
            bw.newLine();
            bw.write("I am learning java ");
            bw.close();
            BufferedWriter ap = new BufferedWriter(new FileWriter("MyFile.txt",true));//this is for appending to a file
            ap.write(" Now i am going to append ");
            ap.newLine();
            ap.write(" To continue adding adding data press enter and type ap.write('message') it will append data ");
            ap.close();
            
            BufferedReader br=new BufferedReader(new FileReader(f));
            String character;
 
            while ((character = br.readLine()) != null) {
                System.out.print(character);
            }
            br.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
