import java.io.File;

public class Entry {

	public static void main(String[] args) {
		
		FileHandler objFH=new FileHandler();
		switch(1)
		{
		case 1:
			objFH.dispAllFilesD();
			break;
		case 2:
			objFH.deleteFileByFileName("zSomil.txt");
			break;
		}
	}
}

// hello hi
class FileHandler
{
	public void dispAllFilesD()
	{
		File file=new File("d://");
		String arrFiles[]=file.list();////sk,hardik,somil
		for (String str : arrFiles) {
			System.out.println(str);
		}
	}
	
	public void deleteFileByFileName(String strFileName)
	{
		File file=new  File("d://");
		File arrFiles[]=file.listFiles();//sk,hardik,somil
		for (File f : arrFiles) 
		{
			if(f.isFile())
			{
				if(f.getName().equals(strFileName))
				{
					f.delete();
					System.out.println("file deleted");
					break;
				}
			}
		}
		
		
	}
	
	
}