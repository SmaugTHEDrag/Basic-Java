package Bai8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai8_2_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai8_2_form frame = new Bai8_2_form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bai8_2_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("x");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(57, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("y");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(57, 109, 46, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(57, 210, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtX = new JTextField();
		txtX.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtX.setHorizontalAlignment(SwingConstants.TRAILING);
		txtX.setBounds(131, 51, 190, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtY.setHorizontalAlignment(SwingConstants.TRAILING);
		txtY.setBounds(131, 115, 190, 20);
		contentPane.add(txtY);
		txtY.setColumns(10);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtA.setHorizontalAlignment(SwingConstants.TRAILING);
		txtA.setBounds(131, 209, 190, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JButton btnNewButton = new JButton("Tính");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// Tính căn bậc 2 của (5x-y)/(2x+y)
				try {
					int x = Integer.parseInt(txtX.getText());
					int y = Integer.parseInt(txtY.getText());
					double kq=Math.sqrt((double)(5*x-y)/(2*x+7*y));
					if(Double.isNaN(kq)) throw new Exception();
					txtA.setText(String.format("%.2f", kq));
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Nhập sai kiểu số!");
					txtA.setText(null);
				}catch(Exception ex) {// phải ở cuối cùng
					JOptionPane.showMessageDialog(null, "Giá trị Not a Number!");
					txtA.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(179, 160, 89, 23);
		contentPane.add(btnNewButton);
	}
}
