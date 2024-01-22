package Bai4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai4_4_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSoDem;
	private JTextField txtThanhTien;
	private JTextField txtLoaiPhong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4_4_form frame = new Bai4_4_form();
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
	public Bai4_4_form() {
		setTitle("Tính tiền phòng ở");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bảng giá phòng");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(325, 10, 207, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\NGUYEN\\Downloads\\Screenshot 2023-12-13 203326.png"));
		lblNewLabel_1.setBounds(10, 48, 756, 340);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Loại phòng");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(55, 441, 146, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Số đêm");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(388, 441, 76, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Thành tiền");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(55, 531, 110, 32);
		contentPane.add(lblNewLabel_4);
		
		txtSoDem = new JTextField();
		txtSoDem.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSoDem.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSoDem.setBounds(474, 441, 146, 26);
		contentPane.add(txtSoDem);
		txtSoDem.setColumns(10);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setEditable(false);
		txtThanhTien.setForeground(new Color(255, 0, 0));
		txtThanhTien.setHorizontalAlignment(SwingConstants.TRAILING);
		txtThanhTien.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtThanhTien.setBounds(175, 533, 146, 29);
		contentPane.add(txtThanhTien);
		txtThanhTien.setColumns(10);
		
		txtLoaiPhong = new JTextField();
		txtLoaiPhong.setHorizontalAlignment(SwingConstants.TRAILING);
		txtLoaiPhong.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtLoaiPhong.setBounds(171, 441, 146, 26);
		contentPane.add(txtLoaiPhong);
		txtLoaiPhong.setColumns(10);
		
		JButton btnNewButton = new JButton("Tính tiền");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tính tiền phòng 
				int loai = Integer.parseInt(txtLoaiPhong.getText());
				int soDem = Integer.parseInt(txtSoDem.getText());
				double thanhTien = 0;
				final double donGia1=1260000, donGia2=1550000, donGia3=1830000,
						     donGia4=1830000, donGia5=2120000, donGia6=2120000,
						     donGia7=2540000, donGia8=4800000;
				// Nhập loại phòng
				switch(loai) {
				case 1: 
					if(soDem==1) thanhTien = donGia1;
					else if(soDem<=3) thanhTien = soDem*donGia1 - soDem*donGia1*0.25;
					else if(soDem>=4) thanhTien = soDem*donGia1 - 3*donGia1*0.25 - soDem*donGia1*0.3;
					break;
				case 2: 
					if(soDem==1) thanhTien = donGia2;
					else if(soDem<=3) thanhTien = soDem*donGia2 - soDem*donGia2*0.25;
					else if(soDem>=4) thanhTien = soDem*donGia2 - 3*donGia2*0.25 - soDem*donGia2*0.3;
					break;
				case 3: 
					if(soDem==1) thanhTien = donGia3;
					else if(soDem<=3) thanhTien = soDem*donGia3 - soDem*donGia3*0.25;
					else if(soDem>=4) thanhTien = soDem*donGia3 - 3*donGia3*0.25 - soDem*donGia3*0.3;
					break;
				case 4: 
					if(soDem==1) thanhTien = donGia4;
					else if(soDem<=3) thanhTien = soDem*donGia4 - soDem*donGia4*0.25;
					else if(soDem>=4) thanhTien = soDem*donGia4 - 3*donGia4*0.25 - soDem*donGia4*0.3;
					break;
				case 5: 
					if(soDem==1) thanhTien = donGia5;
					else if(soDem<=3) thanhTien = soDem*donGia5 - soDem*donGia5*0.25;
					else if(soDem>=4) thanhTien = soDem*donGia5 - 3*donGia5*0.25 - soDem*donGia5*0.3;
					break;
				case 6: 
					if(soDem==1) thanhTien = donGia6;
					else if(soDem<=3) thanhTien = soDem*donGia6 - soDem*donGia6*0.25;
					else if(soDem>=4) thanhTien = soDem*donGia6 - 3*donGia6*0.25 - soDem*donGia6*0.3;
					break;
				case 7: 
					if(soDem==1) thanhTien = donGia7;
					else if(soDem<=3) thanhTien = soDem*donGia7 - soDem*donGia7*0.25;
					else if(soDem>=4) thanhTien = soDem*donGia7 - 3*donGia7*0.25 - soDem*donGia7*0.3;
					break;
				case 8: 
					if(soDem==1) thanhTien = donGia8;
					else if(soDem<=3) thanhTien = soDem*donGia8 - soDem*donGia8*0.25;
					else if(soDem>=4) thanhTien = soDem*donGia8 - 3*donGia8*0.25 - soDem*donGia8*0.3;
					break;
				}
				txtThanhTien.setText(String.format("%.0f", thanhTien));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(398, 531, 157, 32);
		contentPane.add(btnNewButton);
	}

}
