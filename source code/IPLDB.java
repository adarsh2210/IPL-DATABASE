import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class IPLDB {
    JFrame MainFrame;
    JTextField PlayerNameTextField, TeamNameTextField;
    JLabel PlayerNameLabel, TeamNameLabel;
    JButton EnterButton;

    void ipldb() {
        MainFrame = new JFrame("IPL Database");
        PlayerNameLabel = new JLabel("Player Name");
        PlayerNameTextField = new JTextField(10);
        TeamNameLabel = new JLabel("Team");
        TeamNameTextField = new JTextField(10);
        EnterButton = new JButton("Enter");
        MainFrame.add(PlayerNameLabel); MainFrame.add(PlayerNameTextField);
        MainFrame.add(TeamNameLabel); MainFrame.add(TeamNameTextField);
        MainFrame.add(EnterButton);
        MainFrame.setLayout(new FlowLayout());
        MainFrame.setSize(500,500); // JFrame Size
        MainFrame.setVisible(true); //JFrame visibility
    }


    public static void main(String args[])
    {
        new IPLDB();
    }
}