package ma.JDBCT;

import java.sql.*;
import java.io.*;
import java.util.*;
public class Executezhixing {
	private String qu;
	private String di;
	private String yong;
	private String mi;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	public void initParam(String paramFile)throws Exception{
		Properties props=new Properties();
		props.load(new FileInputStream(paramFile));
		qu=props.getProperty("qu");
		di=props.getProperty("di");
		yong=props.getProperty("yong");
		mi=props.getProperty("pass");
	}
	public void executeSql(String sql)throws Exception{
		try{
			Class.forName(qu);
			conn=DriverManager.getConnection(di,yong,mi);
			stmt=conn.createStatement();
			boolean hasResultSet=stmt.execute(sql);
			if(hasResultSet){
				rs=stmt.getResultSet();
				ResultSetMetaData rsmd=rs.getMetaData();
				int columnCount=rsmd.getColumnCount();
				while(rs.next()){
					for(int i=0;i<columnCount;i++){
						System.out.println(rs.getString(i+1)+"\t");
					}
					System.out.println("\n");
				}
			}else{
				System.out.println("Ӱ����"+stmt.getUpdateCount()+"����¼");
			}
		}finally{
			if(rs!=null){
				rs.close();
			}
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
		Executezhixing es=new Executezhixing();
		es.initParam("mysql.ini");
		System.out.println("-----ִ��ɾ�����DDL���-----");
		es.executeSql("create table my_test"
				+"(test_id int auto_increment primary key,"
				+"test_name varchar(255))");
		System.out.println("-----ִ�в������ݵ�DML���-----");
		es.executeSql("insert into my_test(test_name)"
				+"select student_name from student_table");
		System.out.println("-----ִ�в�ѯ���ݵĲ�ѯ���-----");
		es.executeSql("select * from my_test");

	}

}
