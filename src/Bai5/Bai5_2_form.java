package Bai5;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai5_2_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel blank;
	private JTextField txtN;
	private JTextField txtX;
	private JTextField txtA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5_2_form frame = new Bai5_2_form();
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
	public Bai5_2_form() {
		setTitle("(x^2+x+1)^n+(x^2-x+1)^n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		blank = new JPanel();
		blank.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(blank);
		blank.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 62, 46, 14);
		blank.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("x");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(47, 114, 46, 14);
		blank.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(47, 205, 46, 14);
		blank.add(lblNewLabel_2);
		
		txtN = new JTextField();
		txtN.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtN.setHorizontalAlignment(SwingConstants.TRAILING);
		txtN.setBounds(145, 61, 155, 20);
		blank.add(txtN);
		txtN.setColumns(10);
		
		txtX = new JTextField();
		txtX.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtX.setHorizontalAlignment(SwingConstants.TRAILING);
		txtX.setBounds(145, 113, 155, 20);
		blank.add(txtX);
		txtX.setColumns(10);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtA.setEditable(false);
		txtA.setHorizontalAlignment(SwingConstants.TRAILING);
		txtA.setBounds(145, 204, 155, 20);
		blank.add(txtA);
		txtA.setColumns(10);
		
		JButton btnTinh = new JButton("Tính A");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Nhập n,x. Tính A = (x^2+x+1)^n +(x^2-x+1)^n
				int n = Integer.parseInt(txtN.getText());
				double x = Double.parseDouble(txtX.getText());
				double A1 = 1, A2=1;
				for(int i=1;i<=n;i++) {
					A1*=(x*x+x+1);
				}
				for(int i=1;i<=n;i++) {
					A2*=(x*x-x+1);
				}
				double A = A1+A2;
				txtA.setText(String.format("%.0f", A));
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTinh.setBounds(103, 157, 230, 23);
		blank.add(btnTinh);
	}
}
