package LabJDBC;

import java.sql.*;
import java.util.*;

public class Ex1_2 {
		public static void main(String[] args) throws SQLException 
		{

		Scanner sc= new Scanner(System.in);
			
		try {
			//Loading Driver
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Establishing Connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","labbook","labbook");
		if(connection!=null)
		System.out.println("Connection established");
		else
		System.out.println("Connection not established");

		
		while(true)
		{
		System.out.println("Enter the operation you want to perform");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1 :
			String sql1 = "INSERT INTO Author (authorId, firstName, middleName, lastName,phoneNo) VALUES (?, ?, ?, ?,?)";
			 
			PreparedStatement statement1 = connection.prepareStatement(sql1);
			System.out.println("Enter Author Id");
			statement1.setInt(1,sc.nextInt());
			System.out.println("Enter First Name");
			statement1.setString(2,sc.next());
			System.out.println("Enter Middle Name");
			statement1.setString(3, sc.next());
			System.out.println("Enter Last Name");
			statement1.setString(4,sc.next());
			System.out.println("Enter Mobile Number");
			statement1.setInt(5,sc.nextInt());
			int rowsInserted = statement1.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new row was inserted successfully!");
			}
			else
			{
			System.out.println("Insert operation failed");
			}

			statement1 = connection.prepareStatement("select*from Author");
			ResultSet rs1=statement1.executeQuery();
			while(rs1.next())
					  System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+" "+rs1.getString(3)+rs1.getString(4)+" "+rs1.getInt(5));
			break;

		case 2 :
			String sql2 = "UPDATE Author SET authorId=?,firstName=?,middleName=?,lastName=? ,phoneNo=? WHERE authorId=?";
			 
			PreparedStatement statement2 = connection.prepareStatement(sql2);
			System.out.println("Enter Author Id");
			statement2.setInt(1,sc.nextInt());
			System.out.println("Enter First Name");
			statement2.setString(2,sc.next());
			System.out.println("Enter Middle Name");
			statement2.setString(3, sc.next());
			System.out.println("Enter Last Name");
			statement2.setString(4,sc.next());
			System.out.println("Enter Mobile Number");
			statement2.setInt(5,sc.nextInt());
			System.out.println("Enter Author Id");
			statement2.setInt(6,sc.nextInt());
			 
			int rowsUpdated = statement2.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("Row was updated successfully!");
			}
		    else
		      {
					System.out.println("Update operation failed");
			  }

			statement2 = connection.prepareStatement("select*from Author");
			ResultSet rs2=statement2.executeQuery();
			while(rs2.next())
					  System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+" "+rs2.getString(3)+rs2.getString(4)+" "+rs2.getInt(5));
			break;

		case 3 :
			String sql3 = "DELETE FROM Author WHERE authorId=?";
			 
			PreparedStatement statement3 = connection.prepareStatement(sql3);
			System.out.println("Enter author id");
			statement3.setInt(1,sc.nextInt());
			 
			int rowsDeleted = statement3.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("Row was deleted successfully!");
			}
			else
			{
				System.out.println("Deletion Unsuccessful");
			}

			statement3 = connection.prepareStatement("select * from Author");
			ResultSet rs3=statement3.executeQuery();
			while(rs3.next())
					  System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+" "+rs3.getString(3)+rs3.getString(4)+" "+rs3.getInt(5));
			break;
//------------------------------------------------------------------------------------------------------------------------------//
		case 4:
			System.out.println("Thank you for using !!!!");
			System.exit(0);
			break;
		default:System.out.println("Incorrect input!!! Please re-enter");
		}//switch
		}//while

		}//try
		catch(Exception e) 
	     { 
	            System.out.println(e); 
	            e.printStackTrace();
	     } //catch
		
		sc.close();
} //main
		
} //class