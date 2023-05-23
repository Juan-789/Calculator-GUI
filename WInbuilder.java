package WInBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WInbuilder {

	private JFrame frame;
	private final Action action = new SwingAction();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WInbuilder window = new WInbuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WInbuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 313, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton.setBounds(10, 193, 45, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 131, 45, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_2.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(10, 162, 45, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2_1.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_2_1.setBounds(65, 162, 45, 21);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("2");
		btnNewButton_2_2.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2_2.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_2_2.setBounds(65, 131, 45, 21);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("8");
		btnNewButton_2_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2_3.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_2_3.setBounds(65, 193, 45, 21);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("3");
		btnNewButton_2_4.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_4.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_2_4.setBounds(120, 131, 45, 21);
		frame.getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_2_5 = new JButton(".");
		btnNewButton_2_5.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_2_5.setBounds(65, 224, 45, 21);
		frame.getContentPane().add(btnNewButton_2_5);
		
		JButton btnNewButton_2_6 = new JButton("0");
		btnNewButton_2_6.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_2_6.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2_6.setBounds(10, 224, 45, 21);
		frame.getContentPane().add(btnNewButton_2_6);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_3.setBounds(120, 162, 45, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_4.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(120, 193, 45, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("/");
		btnNewButton_5.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_5.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_5.setBounds(120, 224, 45, 21);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_6.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_6.setBounds(175, 131, 45, 21);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_7.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_7.setBounds(175, 162, 45, 21);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("x");
		btnNewButton_8.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_8.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_8.setBounds(175, 196, 45, 21);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("=");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_9.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_9.setBounds(175, 224, 45, 21);
		frame.getContentPane().add(btnNewButton_9);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 240, 73);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("^");
		btnNewButton_10.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_10.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(230, 133, 45, 21);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("!");
		btnNewButton_11.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_11.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton_11.setBounds(230, 164, 45, 21);
		frame.getContentPane().add(btnNewButton_11);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
