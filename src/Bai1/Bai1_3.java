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

public class Bai1_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Tong2songuyen;
	private JTextField txtSonguyenThuNhat;
	private JTextField txtSoNguyenThuHai;
	private JTextField txtKetqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1_3 frame = new Bai1_3();
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
	public Bai1_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Tong2songuyen = new JPanel();
		Tong2songuyen.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Tong2songuyen);
		Tong2songuyen.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tính tổng 2 số nguyên");
		lblNewLabel.setBounds(135, 11, 140, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Tong2songuyen.add(lblNewLabel);
		
		JLabel lblinteger1 = new JLabel("Số nguyên thứ nhất: ");
		lblinteger1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblinteger1.setBounds(10, 56, 128, 23);
		Tong2songuyen.add(lblinteger1);
		
		JLabel lblinteger2 = new JLabel("Số nguyên thứ hai: ");
		lblinteger2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblinteger2.setBounds(10, 96, 128, 23);
		Tong2songuyen.add(lblinteger2);
		
		JLabel Result = new JLabel("Kết quả: ");
		Result.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Result.setBounds(10, 146, 69, 14);
		Tong2songuyen.add(Result);
		
		txtSonguyenThuNhat = new JTextField();
		txtSonguyenThuNhat.setBounds(167, 58, 86, 20);
		Tong2songuyen.add(txtSonguyenThuNhat);
		txtSonguyenThuNhat.setColumns(10);

		txtSoNguyenThuHai = new JTextField();
		txtSoNguyenThuHai.setBounds(167, 98, 86, 20);
		Tong2songuyen.add(txtSoNguyenThuHai);
		txtSoNguyenThuHai.setColumns(10);
		
		txtKetqua = new JTextField();
		txtKetqua.setEditable(false);
		txtKetqua.setBounds(167, 146, 86, 20);
		Tong2songuyen.add(txtKetqua);
		txtKetqua.setColumns(10);
		
		JButton btnTong = new JButton("Tổng");
		btnTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int SoNguyenThuNhat = Integer.parseInt(txtSonguyenThuNhat.getText()); // chuyển từ chuỗi sang int
			int SoNguyenThuHai = Integer.parseInt(txtSoNguyenThuHai.getText()); // chuyển từ chuỗi sang int
			long tongHaiSoNguyen = SoNguyenThuNhat + SoNguyenThuHai;
			txtKetqua.setText(String.valueOf(tongHaiSoNguyen)); // chuyển từ số sang chuỗi 
			}
		});
		btnTong.setBounds(167, 202, 89, 23);
		Tong2songuyen.add(btnTong);
	}
}
