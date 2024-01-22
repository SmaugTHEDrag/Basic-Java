package Bai4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai4_1_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtd;
	private JTextField txtMax;
	private JTextField txtMin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4_1_form frame = new Bai4_1_form();
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
	public Bai4_1_form() {
		setTitle("Tìm max, min");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("b");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(59, 46, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("c");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(59, 82, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("d");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(59, 113, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel a = new JLabel("a");
		a.setFont(new Font("Tahoma", Font.BOLD, 14));
		a.setBounds(59, 12, 46, 14);
		contentPane.add(a);
		
		JLabel lblNewLabel_4 = new JLabel("Max");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(59, 191, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Min");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(59, 231, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txta = new JTextField();
		txta.setBounds(168, 11, 99, 20);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setBounds(168, 45, 99, 20);
		contentPane.add(txtb);
		txtb.setColumns(10);
		
		txtc = new JTextField();
		txtc.setBounds(168, 81, 99, 20);
		contentPane.add(txtc);
		txtc.setColumns(10);
		
		txtd = new JTextField();
		txtd.setBounds(168, 112, 99, 20);
		contentPane.add(txtd);
		txtd.setColumns(10);
		
		txtMax = new JTextField();
		txtMax.setForeground(new Color(255, 0, 0));
		txtMax.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMax.setEditable(false);
		txtMax.setBounds(168, 190, 99, 20);
		contentPane.add(txtMax);
		txtMax.setColumns(10);
		
		txtMin = new JTextField();
		txtMin.setForeground(new Color(255, 0, 0));
		txtMin.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMin.setEditable(false);
		txtMin.setBounds(168, 230, 99, 20);
		contentPane.add(txtMin);
		txtMin.setColumns(10);
		
		JButton btnButton = new JButton("Lớn nhất - Nhỏ nhất");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nhập a, b, c, d. Xuất Max và Min
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				int c = Integer.parseInt(txtc.getText());
				int d = Integer.parseInt(txtd.getText());
				int max1=(a>b)?a:b;
				int max2=(c>d)?c:d;
				int max=(max1>max2)?max1:max2;
				int min1=(a<b)?a:b;
				int min2=(c<d)?c:d;
				int min=(min1<min2)?min1:min2;
				txtMax.setText(String.valueOf(max));
				txtMin.setText(String.valueOf(min));
			}
		});
		btnButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnButton.setBounds(111, 143, 206, 23);
		contentPane.add(btnButton);
	}
}
