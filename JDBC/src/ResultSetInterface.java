import java.sql.* ;

public class ResultSetInterface {

	public static void main(String[] args)	{
		
		try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection 
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Wysiwyg");
		
		Statement
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		// gettint the record of third row.
		
		rs.absolute(3);
		System.out.println(rs.getInt(1) + " " +rs.getString(2) + " " +rs.getInt(3));
		
		con.close();
		}
		catch(Exception e)	{
			System.out.println(e);
		}
	}

}
