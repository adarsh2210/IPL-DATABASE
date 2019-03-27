import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import Query.PlayerQuery;

public class IPLDB {
    JFrame MainFrame;
    JPanel EnterPanel, RadioPanel;
    JTextField NameTextField;
    JLabel NameLabel;
    JButton EnterButton;
    JRadioButton PlayerRadioButton, TeamRadioButton;
    ButtonGroup RadioGroup;

    boolean GetRadioButtonState()
    {
        return PlayerRadioButton.isSelected()? true : false;
    }

    void DisplayPlayerResults(ResultSet results, JFrame MainFrame)
    {
        JPanel Results;
        JLabel Name, Team, Age, Country, Role, Runs, Wicket;

        try
        {
            results.first();
            Name = new JLabel("<html>Player Name<br>" + results.getString("PlayerName") + "</html>");
            Team = new JLabel("<html>Team<br>" + results.getString("Team") + "</html>");
            Age = new JLabel("<html>Age<br>" + results.getString("PlayerAge") + "</html>");
            Country = new JLabel("<html>Coutnry<br>" + results.getString("PlayerCountry") + "</html>");
            Role = new JLabel("<html>Role<br>" + results.getString("PlayerRole") + "</html>");
            Runs = new JLabel("<html>Runs<br>" + results.getString("PlayerRuns") + "</html>");
            Wicket = new JLabel("<html>Wickets<br>" + results.getString("PlayerWicket") + "</html>");

            Results = new JPanel();

            Results.add(Name);
            Results.add(Team);
            Results.add(Age);
            Results.add(Country);
            Results.add(Role);
            Results.add(Runs);
            Results.add(Wicket);

            MainFrame.add(Results);
            MainFrame.setLayout(new FlowLayout());
            MainFrame.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    void Display() {
        MainFrame = new JFrame("IPL Database");

        EnterPanel = new JPanel();
        NameLabel = new JLabel("Player Name");
        NameTextField = new JTextField(30);
        EnterButton = new JButton("Enter");
        EnterPanel.add(NameLabel);
        EnterPanel.add(NameTextField);

        PlayerRadioButton = new JRadioButton("Player Name", true);
        TeamRadioButton = new JRadioButton("Team Name");
        RadioGroup = new ButtonGroup();
        RadioGroup.add(PlayerRadioButton);
        RadioGroup.add(TeamRadioButton);

        RadioPanel = new JPanel();
        RadioPanel.add(PlayerRadioButton);
        RadioPanel.add(TeamRadioButton);
        MainFrame.add(EnterPanel);
        MainFrame.add(RadioPanel);

        /*MainFrame.add(NameLabel); MainFrame.add(NameTextField);
        MainFrame.add(PlayerRadioButton); MainFrame.add(TeamRadioButton);*/
        MainFrame.add(EnterButton);

        MainFrame.setLayout(new FlowLayout());
        MainFrame.setSize(500,500); // JFrame Size
        MainFrame.setVisible(true); //JFrame visibility
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        EnterButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                boolean state = GetRadioButtonState();
                String text = NameTextField.getText();
                if(state == true)
                {
                    PlayerQuery query = new PlayerQuery();
                    ResultSet results = query.GetPlayerResults(text);
                    DisplayPlayerResults(results, MainFrame);
                }
                else
                {
                    //TODO TeamQuery
                }
            }
        });
    }

    public static void main(String args[])
    {
        IPLDB kek = new IPLDB();
        kek.Display();
    }
}