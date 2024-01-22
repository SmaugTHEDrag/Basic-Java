package Bai5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai5_5_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtNhiPhan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5_5_form frame = new Bai5_5_form();
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
	public Bai5_5_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Số thập phân");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 58, 133, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Số nhị phân");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(23, 168, 133, 20);
		contentPane.add(lblNewLabel_1);
		
		txtN = new JTextField();
		txtN.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtN.setBounds(166, 55, 165, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		txtNhiPhan = new JTextField();
		txtNhiPhan.setEditable(false);
		txtNhiPhan.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtNhiPhan.setBounds(167, 167, 164, 20);
		contentPane.add(txtNhiPhan);
		txtNhiPhan.setColumns(10);
		
		JButton btnDoi = new JButton("Đổi nhị phân");
		btnDoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Nhập n. Đổi từ số thập phân sang số nhị phân
				int n = Integer.parseInt(txtN.getText());
				int sum=0, rem, i=1;
				while (n>0) {
					rem = n%2;
					sum+=(i*rem);
					n/=2;
					i*=10;
				}
				txtNhiPhan.setText(Integer.toString(sum));
			}
		});
		btnDoi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDoi.setBounds(164, 113, 167, 23);
		contentPane.add(btnDoi);
	}

}
