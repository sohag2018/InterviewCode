package justForPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteReadDataInTextFile {

	public static void main(String[] args) throws IOException {
		//we will use two clasess: 1.FileWriter 2. BufferedWriter
		
		FileWriter fw=new FileWriter("C:\\Users\\nafas\\Desktop\\EclipseFileWriter\\Test1.txt");//we have specify in which location we will create the file & name.txt
        BufferedWriter bw=new BufferedWriter(fw); //pass the newly created file
        //still file is empy and not created yet-lets put some content in the file by using 
        
        bw.write("Sohag this is your last chance");
        bw.newLine();
        bw.write("So dont be lazy");
        //lets execute now
        System.out.println("Writing Finish-check your file"); 
        bw.close();
        //Read from the file by using FileReader and bufferedReader
        FileReader fr= new FileReader("C:\\Users\\nafas\\Desktop\\EclipseFileWriter\\Test1.txt");
//        BufferedReader br=new BufferedReader(fr);
//        String str;
//        while((str=br.readLine())!=null) {
//        	System.out.println(str);
//        }
//        br.close();
//        
        //we can read by using Scanner Class
        Scanner sc=new Scanner(fr);
//        while(sc.hasNextLine()) {
//        	System.out.println(sc.nextLine());
//        }
        // we can also try reg expression
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
        sc.close();
	}

}
