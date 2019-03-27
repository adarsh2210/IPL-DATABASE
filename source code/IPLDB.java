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

    void DisplayPlayerResults(ResultSet results)
    {
        JPanel Results;
        JLabel NameLabel, TeamLabel, AgeLabel, CountryLabel, RoleLabel, RunsLabel, WicketLabel;
        JTextField Name, Team, Age, Country, Role, Runs, Wicket;

        NameLabel = new JLabel("Player Name");
        TeamLabel = new JLabel("Team Name");
        AgeLabel = new JLabel("Age");
        CountryLabel = new JLabel("Country");
        RoleLabel = new JLabel("Role");
        RunsLabel = new JLabel("Runs");
        WicketLabel = new JLabel("Wickets");

        Name = new JTextField(30);
        Team = new JTextField(30);
        Age = new JTextField(30);
        Country = new JTextField(30);
        Role = new JTextField(30);
        Runs = new JTextField(30);
        Wicket = new JTextField(30);

        Name.setEditable(false);
        Team.setEditable(false);
        Age.setEditable(false);
        Country.setEditable(false);
        Role.setEditable(false);
        Runs.setEditable(false);
        Wicket.setEditable(false);

        try
        {
            results.first();
            Name.setText(results.getString("PlayerName"));
            Team.setText(results.getString("Team"));
            Age.setText(results.getString("PlayerAge"));
            Country.setText(results.getString("PlayerCountry"));
            Role.setText(results.getString("PlayerRole"));
            Runs.setText(results.getString("PlayerRuns"));
            Wicket.setText(results.getString("PlayerWicket"));
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            System.out.println("\nFuck you too");
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
                    DisplayPlayerResults(results);
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