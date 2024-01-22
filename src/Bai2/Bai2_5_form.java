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

public class Bai2_5_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtChuVi;
	private JTextField txtChieuRong;
	private JTextField txtChieuDai;
	private JTextField txtDienTich;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_5_form frame = new Bai2_5_form();
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
	public Bai2_5_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chu Vi");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(31, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chiều Rộng");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(31, 75, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chiều Dài");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(31, 127, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Diện tích");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(31, 179, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		txtChuVi = new JTextField();
		txtChuVi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtChuVi.setBounds(155, 26, 86, 20);
		contentPane.add(txtChuVi);
		txtChuVi.setColumns(10);
		
		txtChieuRong = new JTextField();
		txtChieuRong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtChieuRong.setEditable(false);
		txtChieuRong.setBounds(155, 74, 86, 20);
		contentPane.add(txtChieuRong);
		txtChieuRong.setColumns(10);
		
		txtChieuDai = new JTextField();
		txtChieuDai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtChieuDai.setEditable(false);
		txtChieuDai.setBounds(155, 126, 86, 20);
		contentPane.add(txtChieuDai);
		txtChieuDai.setColumns(10);
		
		txtDienTich = new JTextField();
		txtDienTich.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDienTich.setEditable(false);
		txtDienTich.setBounds(155, 178, 86, 20);
		contentPane.add(txtDienTich);
		txtDienTich.setColumns(10);
		
		JButton btnNewButton = new JButton("Tính toán");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Tính diện tích
			double chuVi = Double.parseDouble(txtChuVi.getText());
			double chieuRong = chuVi/5;
			double chieuDai = chieuRong * 1.5;
			double dienTich = chieuDai * chieuRong;
			txtChieuRong.setText(String.valueOf(chieuRong));
			txtChieuDai.setText(String.valueOf(chieuDai));
			txtDienTich.setText(String.valueOf(dienTich));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(152, 227, 110, 23);
		contentPane.add(btnNewButton);
	}

}
