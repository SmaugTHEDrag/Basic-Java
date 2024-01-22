package Bai1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai2 frame = new bai2();
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
	//Khoi tao
	public bai2() {
		setTitle("xin chào");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhâp họ tên");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 70, 112, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblXuatchao = new JLabel("");
		lblXuatchao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblXuatchao.setBounds(10, 136, 414, 34);
		contentPane.add(lblXuatchao);				
		
		JButton btnXuatchao = new JButton("Xuất chào");
		btnXuatchao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nhập họ và tên 
				lblXuatchao.setText("Chào bạn "+txtHoTen.getText()+" đến với lớp Java cơ bản!");
			}
		});
		btnXuatchao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnXuatchao.setBounds(194, 197, 112, 34);
		contentPane.add(btnXuatchao);
		
		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtHoTen.setBounds(133, 70, 258, 41);
		contentPane.add(txtHoTen);
		txtHoTen.setColumns(10);
		

	}
}
