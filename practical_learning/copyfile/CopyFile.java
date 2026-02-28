package copyfile;

import java.io.IOException;
import copyfile.com.mode.*;

public class CopyFile {
	public static void main(String[] args)
		throws IOException
	{
		// change the FileCopier instance according to the 
		// need of the question!
		FileCopier fcopier = new HalfLineFileCopier();
		cpManager = new FileCopyManager(fcopier);
		
		cpManager.copy(inputFilePath, outputFilePath);
	}
	
	private static String inputFilePath = "data.txt";
	private static String outputFilePath = "dataCopy.txt";
	private static FileCopyManager cpManager;
}
