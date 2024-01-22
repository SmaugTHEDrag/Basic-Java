package PhamThaiNguyen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Bai2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenKhach;
	private JTextField txtSoNgay;
	private JTextField txtSoGio;
	private JTextField txtThanhTien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2 frame = new Bai2();
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
	public Bai2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên khách");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(88, 35, 112, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Số ngày thuê");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(88, 77, 112, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Số giờ thuê");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(88, 121, 112, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Thành tiền");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(88, 174, 112, 14);
		contentPane.add(lblNewLabel_3);
		
		txtTenKhach = new JTextField();
		txtTenKhach.setHorizontalAlignment(SwingConstants.TRAILING);
		txtTenKhach.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtTenKhach.setBounds(260, 34, 256, 20);
		contentPane.add(txtTenKhach);
		txtTenKhach.setColumns(10);
		
		txtSoNgay = new JTextField();
		txtSoNgay.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSoNgay.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSoNgay.setBounds(260, 76, 256, 20);
		contentPane.add(txtSoNgay);
		txtSoNgay.setColumns(10);
		
		txtSoGio = new JTextField();
		txtSoGio.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSoGio.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtSoGio.setBounds(260, 120, 256, 20);
		contentPane.add(txtSoGio);
		txtSoGio.setColumns(10);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setHorizontalAlignment(SwingConstants.TRAILING);
		txtThanhTien.setForeground(new Color(255, 0, 0));
		txtThanhTien.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtThanhTien.setEditable(false);
		txtThanhTien.setBounds(260, 173, 256, 20);
		contentPane.add(txtThanhTien);
		txtThanhTien.setColumns(10);
		
		JRadioButton rbtNgay = new JRadioButton("Ngày");
		rbtNgay.setFont(new Font("Tahoma", Font.BOLD, 13));
		rbtNgay.setBounds(0, 144, 63, 23);
		contentPane.add(rbtNgay);
		
		JRadioButton rbtGio = new JRadioButton("Giờ");
		rbtGio.setFont(new Font("Tahoma", Font.BOLD, 13));
		rbtGio.setBounds(0, 91, 54, 23);
		contentPane.add(rbtGio);
		
		JButton btnNewButton = new JButton("Tính tiền thuê phòng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tính tiền thuê phòng 
				DecimalFormat df= new DecimalFormat("#,###");
				if(txtTenKhach.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Chưa nhập tên khách hàng");
					return; //thoát
				}
				try {
					double thanhTien = 0;
					if(rbtGio.isSelected()&& (rbtNgay.isSelected()==false)) {
						int soGio = Integer.parseInt(txtSoGio.getText());
						if (soGio==1) {
						thanhTien=100000;
					  }
					  else if(soGio<=10) {
						thanhTien=100000+(soGio-1)*80000;
					  }
					  else if(soGio<20) {
						thanhTien=100000+(soGio-1)*80000;
					  }
					  else {JOptionPane.showMessageDialog(null,"Số giờ thuê < 20!");  
						txtThanhTien.setText("");
					  }
					}
					if(rbtNgay.isSelected()&&(rbtGio.isSelected()==false)) {
						int soNgay = Integer.parseInt(txtSoNgay.getText());
						if(soNgay<=7) {
							thanhTien=soNgay*600000;
						}
						if(soNgay>7)
							thanhTien=(7*600000)+((soNgay-7)*600000-(soNgay-7)*600000*0.2);
					}
					if(rbtGio.isSelected()&& rbtNgay.isSelected())
						throw new Exception();
					txtThanhTien.setText(df.format(thanhTien));
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Nhập sai kiểu dữ liệu!");
					txtThanhTien.setText("");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Chỉ được chọn 1 trong 2 Ngày hoặc Giờ");
					txtThanhTien.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(141, 234, 347, 23);
		contentPane.add(btnNewButton);
	}
}
