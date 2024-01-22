package Bai4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Bai4_2_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLoaiXe;
	private JTextField txtSoKm;
	private JTextField txtTienCuoc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4_2_form frame = new Bai4_2_form();
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
	public Bai4_2_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loại xe");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(43, 359, 59, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Số km");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(307, 359, 71, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tiền cước");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(113, 484, 84, 24);
		contentPane.add(lblNewLabel_2);
		
		txtLoaiXe = new JTextField();
		txtLoaiXe.setHorizontalAlignment(SwingConstants.TRAILING);
		txtLoaiXe.setBounds(132, 359, 129, 29);
		contentPane.add(txtLoaiXe);
		txtLoaiXe.setColumns(10);
		
		txtSoKm = new JTextField();
		txtSoKm.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSoKm.setBounds(388, 360, 129, 26);
		contentPane.add(txtSoKm);
		txtSoKm.setColumns(10);
		
		txtTienCuoc = new JTextField();
		txtTienCuoc.setHorizontalAlignment(SwingConstants.TRAILING);
		txtTienCuoc.setForeground(new Color(255, 0, 0));
		txtTienCuoc.setEditable(false);
		txtTienCuoc.setBounds(223, 484, 129, 29);
		contentPane.add(txtTienCuoc);
		txtTienCuoc.setColumns(10);
		
		JButton btnTinhTien = new JButton("Tính Tiền");
		btnTinhTien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tính tiền cước
				int loai = Integer.parseInt(txtLoaiXe.getText());
				double km = Double.parseDouble(txtSoKm.getText());
				double thanhTien=0;
				final double giaMoCua = 11000;
				switch(loai) {
				case 4: 
					if (km<=0.8)    thanhTien = giaMoCua;
					else if(km<=30) thanhTien = giaMoCua+(km-0.8)*16500;
					else            thanhTien = giaMoCua+30*16500+(km-0.8-30)*12400;
				break;
				case 7:
					if(km<=0.8)     thanhTien = giaMoCua;
					else if(km<=30) thanhTien = giaMoCua+(km-0.8)*17000;
					else            thanhTien = giaMoCua+30*17000+(km-0.8-30)*14400;
				break;
				default: 
					JOptionPane.showMessageDialog(null, "Nhập loại xe 4 chỗ hoặc 7 chỗ");
				}
				txtTienCuoc.setText(String.format("%.0f", thanhTien));
			}
		});
		btnTinhTien.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTinhTien.setBounds(223, 416, 136, 29);
		contentPane.add(btnTinhTien);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\NGUYEN\\Downloads\\Screenshot 2023-12-13 184308.png"));
		lblNewLabel_3.setBounds(10, 11, 635, 333);
		contentPane.add(lblNewLabel_3);
	}

}
