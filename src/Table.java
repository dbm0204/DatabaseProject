/**
 * Hello World Example of of the SQLite API
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Table{
	public static void main(String[] args){
        Connection connection = null;
        try{
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();
          statement.executeUpdate("drop table if exists doctor");
          statement.executeUpdate("drop table if exists patient");
          statement.executeUpdate("drop table if exists illness");
          statement.executeUpdate("create table doctor (id integer, name string)");
          statement.executeUpdate("create table patient(id integer, name string)");
          statement.executeUpdate("create table illness (id integer, name string)");
          statement.executeUpdate("insert into doctor values(1, 'leo')");
          statement.executeUpdate("insert into doctor values(2, 'yui')");
          
          ResultSet rs = statement.executeQuery("select * from doctor");
          System.out.println("ID"+"\t"+"Name");
          while(rs.next())
          {
            // read the result set
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\n");
          }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e);
          }
        }
      }
    }