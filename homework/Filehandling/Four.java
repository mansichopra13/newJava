// FileHandler objFH=new FileHandler();
// 		switch(8)
// 		{
// 		case 8:
// 			objFH.readObjFromFile();
// 			break;
// 		case 7:
// 			objFH.writeObjTofile();
// 			break;
//         }

// public void writeObjTofile()
// 	{
// 		File  objFile=new File("d://znv.txt");
// 		try {
// 			FileOutputStream fos=new FileOutputStream(objFile);
// 			ObjectOutputStream oos=new ObjectOutputStream(fos);
// 			Emp e1=new Emp();
// 			e1.setEmp("somil", 21, 45000);
// 			oos.writeObject(e1);
// 			System.out.println("object written to file");
// 			fos.close();
// 			oos.close();
// 		} catch (FileNotFoundException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		}
		
// 	}
// 	public void readObjFromFile()
// 	{
// 		File  objFile=new File("d://znv.txt");
// 		try {
// 			FileInputStream fis=new FileInputStream(objFile);
// 			ObjectInputStream ois=new ObjectInputStream(fis);
// 			Object o=ois.readObject();
// 			Emp e= (Emp)o;
// 			e.dispEmp();
			
// 			fis.close();
// 			ois.close();
			
// 		} catch (FileNotFoundException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		} catch (IOException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		} catch (ClassNotFoundException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		}
		
// 	}

// class Emp implements Serializable//marker interface- empty interface
// {
// 	String strEname;
// 	static int age;
// 	transient float sal;
// 	public void setEmp(String s,int a,float sl)
// 	{
// 		strEname=s;
// 		age=a;
// 		sal=sl;
// 	}
// 	public void dispEmp()
// 	{
// 		System.out.println(strEname+ " "+ age+ " "+ sal);
// 	}
// }