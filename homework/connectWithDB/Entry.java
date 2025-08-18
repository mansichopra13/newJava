package homework.connectWithDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import oracle.jdbc.pool.OracleDataSource;

// java database connectivity
public class Entry {
    public static void main (String [] args){
        DBHandler objDH=new DBHandler();
        switch(3){
            case 1:
            objDH.insertIntoTblEmp(100,"mansi",21,"delhi",98000);
            break;
            case 2:
			objDH.deleteFromTblEmpByEmpno(3);
			break;
		    case 3:
			objDH.udpateTblEmp(100	, "abc",21, "chd", 78450);
			break;
		    case 4:
			objDH.dispEmp();
			break;
        }
    }
}
// oracle table for reference
//create table tblemp
// (
//     empno number(5) primary key,
//     ename varchar(20),
//     eage number(4),
//     eadd varchar(20),
//     esal number(5)
// );

class DBHandler{

    public Connection getDBCon(){
        OracleDataSource ods;
        Connection con =null;

        try {
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            con=ods.getConnection("JavaDb","icsd");
            System.out.println("Connection established successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public void dispEmp(){
        Connection con =getDBCon();
        try {
            PreparedStatement stmt = con.prepareStatement("select * from tblemp");
            ResultSet rset = stmt.executeQuery();
            //rset is like a pointer which points to the first row of the result of query
            while(rset.next())//it read current record and record pointer moves to next record
            {
                String strEmpno,strEname,strEage,strEadd,strEsal;
                strEmpno=rset.getString("empno");
                strEname=rset.getString("ename");
                strEage=rset.getString("eage");
                strEadd=rset.getString("eadd");
                strEsal=rset.getString("esal");

                System.out.println(strEmpno+" "+strEname+" "+strEage+" "+strEadd+" "+strEsal);

            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    	public void udpateTblEmp(int empno, String ename, int eage, String eadd, double esal)
	{
		Connection con=getDBCon();
		try {
			PreparedStatement stmt=con.prepareStatement("update tblemp set ename=?,eage=?,eadd=?,esal=? where empno=?");
			
			stmt.setString(1, ename);
			stmt.setInt(2, eage);
			stmt.setString(3, eadd);
			stmt.setDouble(4, esal);
			stmt.setInt(5, empno);
			
			stmt.executeUpdate();
			
			System.out.println("data updated ");
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

   	public void deleteFromTblEmpByEmpno(int empno)
	{
		//1 Establish the conenction with data base
		Connection con=getDBCon();
		//2 specify your objective
		try {
			PreparedStatement stmt=con.prepareStatement("delete from tblemp where empno=?");
			//3 pass the parametr if any
			stmt.setInt(1, empno);
			//4 execute your query
			// I D U=- executeUpdate();
			
			stmt.executeUpdate();
			//5 close your connection 
			con.close();
			System.out.println("Data deleted");
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

    public void insertIntoTblEmp( int empno,String strEname,int eage,String eadd,int esal){
        // 1 establish the connection with db
        //wehave to provide ojdbc6.jar to java envt.
        //how to add ext jar(java archive) file to project
        //D:\oraclesetup\sqldeveloper-3.2.09.30\sqldeveloper\jdbc\lib

        //OracleDataSource ods = new OracleDataSource();
        // OracleDataSource is a class provided by the Oracle JDBC Driver (ojdbc) that implements the javax.sql.DataSource interface.
        OracleDataSource ods;
        try {
            ods=new OracleDataSource();
            //	The Thin driver, a lightweight, platform-independent JDBC driver
            	// The SID (System ID) of the Oracle database. xe is the default for Oracle XE
            ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            Connection con =ods.getConnection("JavaDb","icsd");//Person p1=new SM();
            System.out.println("connection established successfully");
            //2 specify your objective - insert,delete,update,select
            //A PreparedStatement in Java is a feature of JDBC that allows you to execute parameterized SQL queries.
            //  placeholders (?) for parameters instead of hardcoding values directly. values will be provided later using setter methods like setInt(), setString()
            PreparedStatement stmt = con.prepareStatement("insert into tblemp values(?,?,?,?,?)");
            //3 pass parameters if any
            stmt.setInt(1,empno);
            stmt.setString(2,strEname);
            stmt.setInt(3,eage);
            stmt.setString(4,eadd);
            stmt.setInt(5,esal);
            //4 execute your query
            // i,d,u executeUpdate();
            // select executeQuery();
            stmt.executeUpdate();
            System.out.println("Insert successful");
            //closing
            stmt.close();
            con.close();
        } catch (SQLException e) {
           e.printStackTrace(); // Shows full error for debugging
            // System.out.println(e.getMessage());
        }
    }



}

