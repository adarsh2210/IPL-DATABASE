import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class IPLDB {
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

    void Display() {
        MainFrame = new JFrame("IPL Database");

        EnterPanel = new JPanel();
        NameLabel = new JLabel("Player Name");
        NameTextField = new JTextField(10);
        EnterButton = new JButton("Enter");
        EnterPanel.add(NameLabel);
        EnterPanel.add(NameTextField);

        PlayerRadioButton = new JRadioButton("Player Name");
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
            }
        });
    }

    public static void main(String args[])
    {
        IPLDB kek = new IPLDB();
        kek.Display();
    }
}