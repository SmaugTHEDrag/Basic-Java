package Bai5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai5_3_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtX;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5_3_form frame = new Bai5_3_form();
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
	public Bai5_3_form() {
		setTitle("Kiểm tra số nguyên tố");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("x");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(45, 42, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kết quả");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(45, 184, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		txtX = new JTextField();
		txtX.setHorizontalAlignment(SwingConstants.TRAILING);
		txtX.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtX.setBounds(135, 39, 132, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtKetQua.setBounds(135, 181, 241, 20);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
		
		JButton btnTinh = new JButton("Kiểm tra");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Nhập x. Kiểm tra xem nó có phải là số nguyên tố không
				int x = Integer.parseInt(txtX.getText());
				boolean prime = true;
				if(x<2) prime = false;
				for(int i=2; i<x ;i++) {
					if(x%i==0)
						prime = false;
					    break;
				}
				txtKetQua.setText((prime==true)?"Là số nguyên tố":"Không phải là số nguyên tố");
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTinh.setBounds(100, 109, 204, 23);
		contentPane.add(btnTinh);
	}

}
