package Query;

import java.sql.*;

public class PlayerQuery
{
    public void GetPlayerResults(String text)
    {
        connection = DriverManager.getConnection("jbdc:mysql://localhost:3306/");
        PrepareStatement Query =  connection.prepareState("SELECT * FROM Player where PlayerName='?'");
    }
}