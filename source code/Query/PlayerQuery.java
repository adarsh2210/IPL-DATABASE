package Query;

import java.sql.*;

public class PlayerQuery
{
    public ResultSet GetPlayerResults(String text)
    {
        ResultSet results = null;
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl", "root", "password");
            String query = "SELECT * FROM Player WHERE PlayerName='" + text + "'";
            Statement statement = connection.createStatement();
            results = statement.executeQuery(query);
            return results;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return results;
    }
}