package Bai1;

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

public class Bai1_4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSoLuong;
	private JTextField txtDonGia;
	private JTextField txtThanhTien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1_4 frame = new Bai1_4();
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
	public Bai1_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tính giá trị hóa đơn");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(130, 34, 150, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblSoluong = new JLabel("Số lượng: ");
		lblSoluong.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSoluong.setBounds(25, 80, 77, 23);
		contentPane.add(lblSoluong);
		
		JLabel lblDongia = new JLabel("Đơn giá: ");
		lblDongia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDongia.setBounds(25, 121, 66, 23);
		contentPane.add(lblDongia);
		
		JLabel lblThanhtien = new JLabel("Thành tiền:");
		lblThanhtien.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThanhtien.setBounds(25, 169, 87, 23);
		contentPane.add(lblThanhtien);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(143, 80, 86, 23);
		contentPane.add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		txtDonGia = new JTextField();
		txtDonGia.setBounds(143, 124, 86, 20);
		contentPane.add(txtDonGia);
		txtDonGia.setColumns(10);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setEditable(false);
		txtThanhTien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtThanhTien.setBounds(143, 172, 86, 20);
		contentPane.add(txtThanhTien);
		txtThanhTien.setColumns(10);
		
		JButton btnTinhTien = new JButton("Tính tiền");
		btnTinhTien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tính thành tiền
				int soLuong = Integer.parseInt(txtSoLuong.getText()); // chuyển từ chuỗi sang int
				float donGia = Float.parseFloat(txtDonGia.getText()); // chuyển từ chuỗi sang float
				double thanhTien = soLuong * donGia;
				txtThanhTien.setText(String.valueOf(thanhTien));  // chuyển từ số thành chuỗi
			}
		});
		btnTinhTien.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTinhTien.setBounds(140, 227, 89, 23);
		contentPane.add(btnTinhTien);
		
		JLabel lblNewLabel_1 = new JLabel("VNĐ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(248, 175, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("VNĐ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(248, 127, 46, 14);
		contentPane.add(lblNewLabel_2);
	}

}
