package copyfile.com.mode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WholeFileCopier implements FileCopier {
	@Override
	public void copyFile(String src, String dest) {
		try (FileInputStream fin = new FileInputStream(src);
			 FileOutputStream fout = new FileOutputStream(dest)) {
			
			int ch = fin.read();
			while(ch != CH_EOF) {
				fout.write(ch);
				ch = fin.read();
			}
			
			System.out.println("File Copied!");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

