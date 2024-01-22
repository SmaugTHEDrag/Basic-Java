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

public class Bai2_3_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtChiSoCu;
	private JTextField txtChiSoMoi;
	private JTextField txtSoDienTieuThu;
	private JTextField txtTienDien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_3_form frame = new Bai2_3_form();
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
	public Bai2_3_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tính tiền điện");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(158, 11, 108, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chỉ số cũ ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(26, 49, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chỉ số mới");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(26, 90, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Số điện tiêu thụ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(26, 133, 130, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tiền điện");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(26, 177, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		txtChiSoCu = new JTextField();
		txtChiSoCu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtChiSoCu.setBounds(158, 48, 222, 20);
		contentPane.add(txtChiSoCu);
		txtChiSoCu.setColumns(10);
		
		txtChiSoMoi = new JTextField();
		txtChiSoMoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtChiSoMoi.setBounds(158, 89, 222, 20);
		contentPane.add(txtChiSoMoi);
		txtChiSoMoi.setColumns(10);
		
		txtSoDienTieuThu = new JTextField();
		txtSoDienTieuThu.setEditable(false);
		txtSoDienTieuThu.setBounds(158, 132, 222, 20);
		contentPane.add(txtSoDienTieuThu);
		txtSoDienTieuThu.setColumns(10);
		
		txtTienDien = new JTextField();
		txtTienDien.setEditable(false);
		txtTienDien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTienDien.setBounds(158, 176, 222, 20);
		contentPane.add(txtTienDien);
		txtTienDien.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("VNĐ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(390, 179, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnTinhTien = new JButton("Tính tiền");
		btnTinhTien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Tính số điện tiêu thụ và tiền điện
				int chiSoCu = Integer.parseInt(txtChiSoCu.getText());
				int chiSoMoi = Integer.parseInt(txtChiSoMoi.getText());
				int soDien = chiSoMoi - chiSoCu;
				double tienDien = soDien * 2500;
				txtSoDienTieuThu.setText(String.valueOf(soDien));
				txtTienDien.setText(String.valueOf(tienDien));
			}
		});
		btnTinhTien.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTinhTien.setBounds(158, 227, 108, 23);
		contentPane.add(btnTinhTien);
	}

}
