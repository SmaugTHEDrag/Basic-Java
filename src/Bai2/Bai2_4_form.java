package Bai2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai2_4_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTienGui;
	private JTextField txtLaiSuat;
	private JTextField txtThangGui;
	private JTextField txtTienLai;
	private JTextField txtTong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_4_form frame = new Bai2_4_form();
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
	public Bai2_4_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Số tiền gửi ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 47, 88, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lãi suất 1 năm");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 89, 103, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Số tháng");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(21, 120, 88, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tiền lãi");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(21, 159, 67, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tổng số tiền");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(21, 193, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tính tiền lãi gửi tiết kiệm");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(138, 11, 183, 20);
		contentPane.add(lblNewLabel_5);
		
		txtTienGui = new JTextField();
		txtTienGui.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTienGui.setBounds(164, 49, 215, 20);
		contentPane.add(txtTienGui);
		txtTienGui.setColumns(10);
		
		txtLaiSuat = new JTextField();
		txtLaiSuat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLaiSuat.setBounds(164, 89, 215, 20);
		contentPane.add(txtLaiSuat);
		txtLaiSuat.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(388, 94, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtThangGui = new JTextField();
		txtThangGui.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtThangGui.setBounds(164, 120, 215, 20);
		contentPane.add(txtThangGui);
		txtThangGui.setColumns(10);
		
		txtTienLai = new JTextField();
		txtTienLai.setEditable(false);
		txtTienLai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTienLai.setBounds(164, 159, 215, 20);
		contentPane.add(txtTienLai);
		txtTienLai.setColumns(10);
		
		txtTong = new JTextField();
		txtTong.setEditable(false);
		txtTong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTong.setBounds(164, 190, 215, 20);
		contentPane.add(txtTong);
		txtTong.setColumns(10);
		
		JButton btnTinhTien = new JButton("Tính tiền");
		btnTinhTien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tính tiền lãi và tổng số tiền 
				double tienGui = Double.parseDouble(txtTienGui.getText());
				float laiSuat = Float.parseFloat(txtLaiSuat.getText());
				int soThang = Integer.parseInt(txtThangGui.getText());
				double tienLai = (tienGui*soThang)*(laiSuat/100/12);
				double Tong = tienGui + tienLai;
				txtTienLai.setText(String.format("%.0f", tienLai));
				txtTong.setText(String.format("%.0f", Tong));
			}
		});
		btnTinhTien.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTinhTien.setBounds(164, 227, 103, 23);
		contentPane.add(btnTinhTien);
		
		JLabel lblNewLabel_7 = new JLabel("VNĐ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(388, 164, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("VNĐ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(388, 195, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("VNĐ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(388, 50, 46, 15);
		contentPane.add(lblNewLabel_9);
	}
}
