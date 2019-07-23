import java.sql.* ;

public class Retrival {

	public static void main(String[] args) {

		try	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Wysiwyg");
			
			Statement stmt = con.createStatement();
			
			//stmt.executeUpdate("insert into emp values(33,'Irfan',35)");
			
			//int result = stmt.executeUpdate("update emp set name = 'Vimal', age = 30 where id = 33");
			
			int result = stmt.executeUpdate("delete from emp where id = 33");
			
			System.out.println(result + " records affected");
			
			con.close();
		}
		catch(Exception e)	{
			System.out.println(e);
		}
				
	}

}
