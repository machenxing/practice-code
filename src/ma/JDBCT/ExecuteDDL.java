package ma.JDBCT;

import java.sql.*;
import java.io.*;
import java.util.*;
public class ExecuteDDL {
	private String qu;
	private String di;
	private String yong;
	private String mi;
	Connection conn;
	Statement stmt;
	public void initParam(String paramFile)throws Exception{
		Properties props=new Properties();
		props.load(new FileInputStream(paramFile));
		qu=props.getProperty("qu");
		di=props.getProperty("di");
		yong=props.getProperty("yong");
		mi=props.getProperty("mi");
	}
	public void createTable(String sql)throws Exception{
		try{
			Class.forName(qu);
			conn=DriverManager.getConnection(di,yong,mi);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		}
		finally{
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ExecuteDDL ed=new ExecuteDDL();
		ed.initParam("mysql.ini");
		ed.createTable("create table mmtest"
				+"(jdbc_id int auto_increment primary key,"
				+"jdbc_name varchar(255),"
				+"jdbc_desc text);");
		System.out.println("---------建表成功---------");

	}

}
