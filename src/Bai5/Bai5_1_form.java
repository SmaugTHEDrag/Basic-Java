package Bai5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai5_1_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtX;
	private JTextField txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5_1_form frame = new Bai5_1_form();
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
	public Bai5_1_form() {
		setTitle("(x^2+1)^n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(27, 49, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("x");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(27, 96, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("S");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(27, 202, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtN = new JTextField();
		txtN.setHorizontalAlignment(SwingConstants.TRAILING);
		txtN.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtN.setBounds(122, 48, 178, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		txtX = new JTextField();
		txtX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtX.setHorizontalAlignment(SwingConstants.TRAILING);
		txtX.setBounds(122, 95, 178, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		txtS = new JTextField();
		txtS.setHorizontalAlignment(SwingConstants.TRAILING);
		txtS.setForeground(Color.RED);
		txtS.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtS.setEditable(false);
		txtS.setBounds(122, 201, 178, 20);
		contentPane.add(txtS);
		txtS.setColumns(10);
		
		JButton btnTinh = new JButton("Tính S");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nhập vào n,x. Tính S
				int n = Integer.parseInt(txtN.getText());
				double x = Double.parseDouble(txtX.getText());
				double S=1;
				for(int i=1;i<=n;i++) {
					S*=(x*x+1);
				}
				txtS.setText(String.format("%.0f", S));
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTinh.setBounds(87, 149, 260, 23);
		contentPane.add(btnTinh);
	}
}
