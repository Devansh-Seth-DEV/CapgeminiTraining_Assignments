package javafoundation.copyfile.mode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AlternateLineFileCopier implements FileCopier {
	@Override
	public void copyFile(String src, String dest) {
		try (FileInputStream fin = new FileInputStream(src);
			 FileOutputStream fout = new FileOutputStream(dest)) {
			
			int ch = fin.read();
			boolean isAlternateLine = false;
			
			while(ch != CH_EOF) {
				if (!isAlternateLine)
					fout.write(ch);
				
				ch = fin.read();
				
				if (ch == CH_NEWLINE)
					isAlternateLine = !isAlternateLine;
			}
			
			System.out.println("File Copied!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
