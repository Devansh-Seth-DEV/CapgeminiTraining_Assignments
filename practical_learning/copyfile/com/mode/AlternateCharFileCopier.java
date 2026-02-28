package javafoundation.copyfile.mode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AlternateCharFileCopier implements FileCopier {
	@Override
	public void copyFile(String src, String dest) {
		try (FileInputStream fin = new FileInputStream(src);
			 FileOutputStream fout = new FileOutputStream(dest)) {
			
			int ch = fin.read();
			boolean isAlternateChar = false;
			
			while(ch != CH_EOF) {
				if (!isAlternateChar)
					fout.write(ch);
				
				ch = fin.read();
				isAlternateChar = !isAlternateChar;
			}
			
			System.out.println("File Copied!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
