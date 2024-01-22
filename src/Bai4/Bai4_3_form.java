package Bai4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Bai4_3_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSoKwh;
	private JTextField txtTongTien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai4_3_form frame = new Bai4_3_form();
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
	public Bai4_3_form() {
		setTitle("Tính tiền điện");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NGUYEN\\Downloads\\Screenshot 2023-12-13 19313.png"));
		lblNewLabel.setBounds(48, 61, 576, 288);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BẢNG GIÁ ĐIỆN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(233, 23, 183, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Số Kwh tiêu thụ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(94, 394, 135, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tổng số tiền");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(94, 447, 135, 27);
		contentPane.add(lblNewLabel_3);
		
		txtSoKwh = new JTextField();
		txtSoKwh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSoKwh.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSoKwh.setBounds(256, 399, 160, 20);
		contentPane.add(txtSoKwh);
		txtSoKwh.setColumns(10);
		
		txtTongTien = new JTextField();
		txtTongTien.setForeground(new Color(255, 0, 0));
		txtTongTien.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTongTien.setHorizontalAlignment(SwingConstants.TRAILING);
		txtTongTien.setEditable(false);
		txtTongTien.setBounds(256, 452, 160, 20);
		contentPane.add(txtTongTien);
		txtTongTien.setColumns(10);
		
		JButton btnTinh = new JButton("Tính tiền điện");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tính tiền điện
                int soKwh = Integer.parseInt(txtSoKwh.getText());
                double thanhTien = 0;
                double bac1 = 1388, bac2 = 1433, bac3 = 1660, bac4 = 2082, bac5 = 2324, bac6 = 2399;
                if (soKwh >= 0 && soKwh <= 50)
                    thanhTien = soKwh * bac1;
                else if(soKwh<=100)
                	thanhTien = 50*bac1+(soKwh-50)*bac2;
                else if(soKwh<=200)
                	thanhTien = 50*(bac1+bac2)+(soKwh-100)*bac3;
                else if(soKwh<=300)
                	thanhTien = 50*(bac1+bac2)+100*bac3+(soKwh-200)*bac4;
                else if(soKwh<=400)
                	thanhTien = 50*(bac1+bac2)+100*bac3+100*bac4+(soKwh-300)*bac5;
                else 
                	thanhTien = 50*(bac1+bac2)+100*bac3+100*bac4+100*(soKwh-400)*bac6;
                txtTongTien.setText(String.format("%.0f", thanhTien));
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTinh.setBounds(233, 498, 133, 23);
		contentPane.add(btnTinh);
	}

}
