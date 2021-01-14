package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class VentanaMain {
	
	private static final long serialVersionUID = 1L;
	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMain window = new VentanaMain();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmLogin.getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("Sign in");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 169, SpringLayout.WEST, frmLogin.getContentPane());
		frmLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Username:");
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField, 39, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textField, -169, SpringLayout.EAST, frmLogin.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 7, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 30, SpringLayout.NORTH, frmLogin.getContentPane());
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 159, SpringLayout.WEST, frmLogin.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -169, SpringLayout.EAST, frmLogin.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 4, SpringLayout.NORTH, passwordField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -39, SpringLayout.WEST, passwordField);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -6, SpringLayout.NORTH, passwordField);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 53, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 64, SpringLayout.NORTH, frmLogin.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, -176, SpringLayout.SOUTH, frmLogin.getContentPane());
		frmLogin.getContentPane().add(passwordField);
	}
}
