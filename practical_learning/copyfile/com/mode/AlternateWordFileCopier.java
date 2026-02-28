package copyfile.com.mode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AlternateWordFileCopier implements FileCopier {
	@Override
	public void copyFile(String src, String dest) {
		try (FileInputStream fin = new FileInputStream(src);
			 FileOutputStream fout = new FileOutputStream(dest)) {
			
			int ch = fin.read();
			boolean isAlternateWord = false;
			
			while(ch != CH_EOF) {
				if (!isAlternateWord)
					fout.write(ch);
				
				ch = fin.read();
				
				switch(ch) {
				case CH_NEWLINE:
					isAlternateWord = false;
					break;
					
				case CH_SPACE:
					isAlternateWord = !isAlternateWord;
					break;
					
				default: break;
				}
			}
			
			System.out.println("File Copied!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

