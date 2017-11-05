
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;


import java.sql.*;


public class usercheck{
private String username;
private int cash;
public int getCash() {
	return cash;
}

public void setCash(int cash) {
	this.cash = cash;
}
private int id;
private String password;
private String accountno;
private ArrayList<String> gender;
private ArrayList<String> state;
private ArrayList<String> degree;
private ArrayList<usercheck> list;
private String dob;


public usercheck()
{
username="null";
password="null";
dob=null;
/*gender=new ArrayList<String>();
gender.add(new String("MALE"));
gender.add(new String("FEMALE"));
gender.add(new String("UNKNOWN"));
state=new ArrayList();
state.add("UTTAR PRADESH");
state.add("MADHYA PRADESH");
state.add("PUNJAB");
state.add("HARYANA");
state.add("TAMILNADU");
state.add("KARNATAKA");
state.add("ANDRA PRADESH");
state.add("ARUNACHAL PRADESH");
state.add("JAMMU & KASHMIR");
state.add("BIHAR");
degree.add("HIGH SCHOOL");
degree.add("INTERMEDIATE");
degree.add("UNDERGRADUATE");
degree.add("GRADUATE");*/
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public ArrayList<usercheck> getList() {
	return list;
}

public void setList(ArrayList<usercheck> list) {
	this.list = list;
}

public String getAccountno() {
	return accountno;
}

public void setAccountno(String accountno) {
	this.accountno = accountno;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public ArrayList<String> getGender() {
	return gender;
}
public void setGender(ArrayList<String> gender) {
	this.gender = gender;
}
public ArrayList<String> getState() {
	return state;
}
public void setState(ArrayList<String> state) {
	this.state = state;
}
public ArrayList<String> getDegree() {
	return degree;
}
public void setDegree(ArrayList<String> degree) {
	this.degree = degree;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDefaultGenderValue(){
	return "unknown";
}
public String insert()
{
	String s=null;

	try{

		//load driver class 
		Class.forName("com.mysql.jdbc.Driver");
		//DriverManager class has getco
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
		//create statement
		String sql="insert into citizenbank(username,password,accountno,cash)values(?,?,?,?)";
		
		PreparedStatement ptmt=con.prepareStatement(sql);
		
		con.setAutoCommit(false);
	
		ptmt.setString(1,username);
		ptmt.setString(2,password);
		ptmt.setString(3,accountno);
		ptmt.setInt(4, 0);
		
		int i=ptmt.executeUpdate();
		con.commit();
		if(i>0)
		{
		
		s="inserted";
		System.out.println("data inserted successfully");
		}
		con.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		
return s;
}
public String display()
{
	String s=null;
	
	try{

		//load driver class 
		Class.forName("com.mysql.jdbc.Driver");
		//DriverManager class has getco
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
		//create statement
		String sql="select * from citizenbank";
		
		PreparedStatement ptmt=con.prepareStatement(sql);
		
		con.setAutoCommit(false);

		
		ResultSet rs=ptmt.executeQuery();
		list=new ArrayList();
        
		while(rs.next())
         {
			usercheck ob=new usercheck();
			
			ob.setId(rs.getInt(1));
			ob.setUsername(rs.getString(2));
			ob.setPassword(rs.getString(3));
			list.add(ob);
         }
		con.close();
		s="displayrun";
	  }
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return s;
	
}
public String login()
{

	String s=null;
	String t=display();
	ArrayList lis=getList();
	Iterator itr=lis.iterator();
	while(itr.hasNext())
	{
		
		usercheck e=(usercheck)itr.next();

		if(e.username.equals(this.username) && e.password.equals(this.password))
		{
			s="loggedin";
			break;
		}
	}
	

	return s;

}
}

