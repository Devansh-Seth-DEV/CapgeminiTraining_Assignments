package copyfile.com.mode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HalfLineFileCopier implements FileCopier {
	@Override
	public void copyFile(String src, String dest) {
		try (FileInputStream fin = new FileInputStream(src);
			 FileOutputStream fout = new FileOutputStream(dest);
			 Scanner sc = new Scanner(fin);
			 PrintWriter pw = new PrintWriter(fout)) {
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] words = line.split("\\s+");
				String halfLine = "";
				int halfCount = words.length/2;
				
				for(int i=0; i<halfCount-1; i++) {
					halfLine += words[i] + " ";
				}
				
				if (halfCount>1)
					halfLine += words[halfCount-1];
				
				pw.println(halfLine);
			}
			
			System.out.println("File Copied!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

