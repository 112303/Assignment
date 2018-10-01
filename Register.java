import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegisterFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("First Name");
    JLabel passwordLabel = new JLabel("Last Name");
	JLabel telephoneLabel = new JLabel("Telephone");
	JLabel dobLabel = new JLabel("Date Of Birth");
    
	JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
	JTextField telephoneField = new JTextField();
	JTextField dobField = new JTextField();
	
    //JButton saveUserButton = new JButton("SAVE USER");
    // JButton clearButton = new JButton("CLEAR");
	JButton saveUserButton = new JButton("SAVE USER");
    JButton clearButton = new JButton("CLEAR");
    JCheckBox showPassword = new JCheckBox("Show Password");
	
    RegisterFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        saveUserButton.setBounds(50, 300, 100, 30);
        clearButton.setBounds(200, 300, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(saveUserButton);
        container.add(clearButton);
    }

    public void addActionEvent() {
        saveUserButton.addActionListener(this);
        clearButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == saveUserButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        //Coding Part of RESET button
        if (e.getSource() == clearButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }

}

public class Register {
    public static void createGUI() {
        RegisterFrame frame = new RegisterFrame();
        frame.setTitle("Register Form");
		frame.setSize(500,500);
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}