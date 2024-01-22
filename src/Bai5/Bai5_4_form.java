package Bai5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai5_4_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5_4_form frame = new Bai5_4_form();
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
	public Bai5_4_form() {
		setTitle("Tính giá trị biểu thức ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(36, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(36, 138, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(36, 179, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("D");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(36, 219, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("A");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(36, 99, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtN = new JTextField();
		txtN.setHorizontalAlignment(SwingConstants.TRAILING);
		txtN.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtN.setBounds(92, 29, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtA.setHorizontalAlignment(SwingConstants.TRAILING);
		txtA.setEditable(false);
		txtA.setBounds(92, 98, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtB.setHorizontalAlignment(SwingConstants.TRAILING);
		txtB.setEditable(false);
		txtB.setBounds(92, 137, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtC.setHorizontalAlignment(SwingConstants.TRAILING);
		txtC.setEditable(false);
		txtC.setBounds(92, 178, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		txtD = new JTextField();
		txtD.setHorizontalAlignment(SwingConstants.TRAILING);
		txtD.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtD.setEditable(false);
		txtD.setBounds(92, 218, 86, 20);
		contentPane.add(txtD);
		txtD.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("(tổng các số lẻ nhỏ hơn hay bằng n)");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(203, 101, 246, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("(tổng các số chẵn nhỏ hơn hay bằng n)");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(203, 140, 245, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("(tích các số từ 1 đến n)");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(207, 181, 242, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("(tích các số chia hết cho 3 nhỏ hơn hay bằng n)");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(203, 221, 317, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Nhập n. Tính A, B, C, D
				int n = Integer.parseInt(txtN.getText());
				int A = 0, B = 0, C = 1, D = 1; 
				// Tính A
				for (int i = 1; i <= n; i++) {
					if (n % i != 0) {
						A += i;
					}
				}
				txtA.setText(Integer.toString(A));
				// Tính B
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						B += i;
					}
				}
				txtB.setText(Integer.toString(B));
				// Tính C
				for (int i = 1; i <= n; i++) {
					C *= i;
				}
				txtC.setText(Integer.toString(C));
				// Tính D
				for (int i = 1; i <= n; i++) {
					if (i % 3 == 0) // Use i instead of n
						D *= i;
				}
				txtD.setText(Integer.toString(D));
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTinh.setBounds(91, 60, 86, 23);
		contentPane.add(btnTinh);
	}
}
