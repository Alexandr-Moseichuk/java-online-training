package my.home.oop.task1;

public class File {
	private String name;
	private Directory directory;
	
	public File(Directory dir, String name) {
		this.directory = dir;
		this.name = name;
	}
	
	public File create(Directory dir, String name) {
		return new File(dir, name);
	}
	
	public void rename(String newName) {
		this.name = newName;
	}
	
	public abstract void delete();

}
