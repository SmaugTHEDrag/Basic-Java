package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class tienLuong extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMaNV;
	private JTextField txtSoSP;
	private JTextField donGiaSP;
	private JTextField txtTienLuong;
	private JTextField txtTroCap;

	/**
	 * Launch the application.
	 */
	public double tienLuong(int soSP) {
		// Tính tiền lương theo số SP
		final double donGiaSP=50000;
		final double dinhMucSP=200;
		double tienThuong=0;
		if(soSP>dinhMucSP) tienThuong=(soSP-dinhMucSP)*donGiaSP*0.05;
		double tienLuong=soSP*donGiaSP+tienThuong;
		return tienLuong;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tienLuong frame = new tienLuong();
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
	public tienLuong() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã NV");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(27, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Số SP");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 93, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tiền lương");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 178, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Trợ cấp");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(204, 178, 59, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Đơn giá SP");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(192, 93, 85, 14);
		contentPane.add(lblNewLabel_4);
		
		txtMaNV = new JTextField();
		txtMaNV.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtMaNV.setBounds(91, 30, 86, 20);
		contentPane.add(txtMaNV);
		txtMaNV.setColumns(10);
		
		txtSoSP = new JTextField();
		txtSoSP.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtSoSP.setBounds(91, 90, 86, 20);
		contentPane.add(txtSoSP);
		txtSoSP.setColumns(10);
		
		donGiaSP = new JTextField();
		donGiaSP.setFont(new Font("Tahoma", Font.BOLD, 13));
		donGiaSP.setText("50000");
		donGiaSP.setEditable(false);
		donGiaSP.setBounds(287, 91, 115, 20);
		contentPane.add(donGiaSP);
		donGiaSP.setColumns(10);
		
		txtTienLuong = new JTextField();
		txtTienLuong.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTienLuong.setEditable(false);
		txtTienLuong.setBounds(96, 176, 86, 20);
		contentPane.add(txtTienLuong);
		txtTienLuong.setColumns(10);
		
		txtTroCap = new JTextField();
		txtTroCap.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTroCap.setEditable(false);
		txtTroCap.setBounds(273, 176, 151, 20);
		contentPane.add(txtTroCap);
		txtTroCap.setColumns(10);
		
		JRadioButton rbtTangCa = new JRadioButton("Tăng ca");
		rbtTangCa.setFont(new Font("Tahoma", Font.BOLD, 13));
		rbtTangCa.setBounds(222, 29, 109, 23);
		contentPane.add(rbtTangCa);
		
		JButton btnTinhLuong = new JButton("Tính lương");
		btnTinhLuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tính tiền lượng theo số SP
				DecimalFormat df= new DecimalFormat("#,###");
				if(txtMaNV.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Chưa nhập mã NV!");
					return; //thoát
				}
				try {
					int sosp=Integer.parseInt(txtSoSP.getText());
					if(sosp<=0) throw new Exception();
					double tienLuong=tienLuong(sosp);
					double troCap=(rbtTangCa.isSelected())?1000000:500000;
					txtTienLuong.setText(df.format(tienLuong));
					txtTroCap.setText(df.format(troCap));
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Nhập sai kiểu dữ liệu!");
					txtTienLuong.setText("");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Nhập số sp phải > 0 !");
					txtTienLuong.setText("");
				}
			}
		});
		btnTinhLuong.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTinhLuong.setBounds(149, 131, 114, 23);
		contentPane.add(btnTinhLuong);
	}
}
