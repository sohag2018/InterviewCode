package interviewCoddigPRACTICE;

import java.io.*;

public class FileReading {

	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\nafas\\Desktop\\test.docs");
		BufferedReader br=new BufferedReader(new FileReader(file));
        String s=br.readLine();
        while(s!=null) {
        	System.out.println(s);
        }
		
		br.close();
	}

}
