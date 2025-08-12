package homework.connectWithDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

import oracle.jdbc.pool.OracleDataSource;

// java database connectivity
public class Entry {
    public static void main (String [] args){
        DBHandler objDH=new DBHandler();
        switch(1){
            case 1:
            objDH.insertIntoTblEmp(100,"mansi",21,"delhi",98000);
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
    public void insertIntoTblEmp( int empno,String strEname,int eage,String eadd,int esal){
        // 1 establish the connection with db
        //wehave to provide ojdbc6.jar to java envt.
        //how to add ext jar(java archive) file to project
        //D:\oraclesetup\sqldeveloper-3.2.09.30\sqldeveloper\jdbc\lib

        //OracleDataSource ods = new OracleDataSource();
        OracleDataSource ods;
        try {
            ods=new OracleDataSource();
            //	The Thin driver, a lightweight, platform-independent JDBC driver
            	// The SID (System ID) of the Oracle database. xe is the default for Oracle XE
            ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            Connection con =ods.getConnection("JavaDb","icsd");//Person p1=new SM();
            System.out.println("connection established successfully");
            //2 specify your objective - insert,delete,update,select
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
        } catch (Exception e) {
           
            System.out.println(e.getMessage());
        }
    }
}

