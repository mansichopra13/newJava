import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

public class Two {

	public static void main(String[] args) {
		
		FileHandler objFH=new FileHandler();
		switch(4)
		{
		case 1:
			objFH.dispAllFilesD();
			break;
		case 2:
			objFH.deleteFileByFileName("zSomil.txt");
			break;
		case 3:
			objFH.writeBytesToFile();
			break;
		case 4:
			objFH.readBytesFromFile();
			break;
		}
	}
}


class FileHandler
{
	public void readBytesFromFile()
	{
		File objFile=new File("d://zabc.txt");
		try {
			FileInputStream fis=new FileInputStream(objFile);
			byte arrBytes[]=new byte[(int) objFile.length()];//10
			fis.read(arrBytes);
			String str=new String(arrBytes);//byte to string conversion
			System.out.println(str);
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeBytesToFile()
	{
		File objFile=new File("d://zabc.txt");
		try
		{
		if(!objFile.exists())
		{
			objFile.createNewFile();
		}
		
			String str="abc";
			FileOutputStream fos=new FileOutputStream(objFile);
			fos.write(str.getBytes());
			System.out.println("bytes writtent to file");
			fos.close();
		
		
		}
		catch(IOException me)
		{
			System.out.println(me.getMessage());
		}
	}
	
	
	
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