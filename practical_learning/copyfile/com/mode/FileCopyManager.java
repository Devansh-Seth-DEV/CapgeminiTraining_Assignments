package javafoundation.copyfile.mode;

public class FileCopyManager {
	public FileCopyManager() {}
	
	public FileCopyManager(FileCopier copier) {
		this.copier = copier;
	}
	
	public void setFileCopier(FileCopier copier) {
		this.copier = copier;
	}
	
	public void copy(String src, String dest) {
		copier.copyFile(src, dest);
	}
	
	private FileCopier copier;
}