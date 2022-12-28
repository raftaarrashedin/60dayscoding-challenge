import java.mysql.*;
public class jdbcxd{
	public static void main(String args[]){
		try{

			// loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating a connection
			String url = "jdbc:mysql://localhost:3306/raftaar";
			String username = "root";
			String password = "root";

			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Created......");
			// if(conn.isclosed()){
			// 	System.out.println("Connection is still closed ");
			// }else{
			// 	System.out.println("Connection Created......");
			// }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}