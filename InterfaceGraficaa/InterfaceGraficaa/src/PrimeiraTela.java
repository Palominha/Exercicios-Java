import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeiraTela extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cx2;
	private JTextField cxresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
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
	public PrimeiraTela() {
		setResizable(false);
		setTitle("Oprera\u00E7\u00F5es Matem\u00E1ticas Basicas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o primeiro n\u00FAmero:\r\n\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 11, 162, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o segundo n\u00FAmero:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 55, 148, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:\r\n");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(49, 111, 69, 14);
		panel.add(lblNewLabel_2);
		
		cx1 = new JTextField();
		cx1.setBackground(new Color(255, 182, 193));
		cx1.setForeground(new Color(255, 255, 255));
		cx1.setBounds(166, 9, 86, 20);
		panel.add(cx1);
		cx1.setColumns(10);
		
		cx2 = new JTextField();
		cx2.setForeground(new Color(255, 255, 255));
		cx2.setBackground(new Color(255, 182, 193));
		cx2.setBounds(168, 53, 86, 20);
		panel.add(cx2);
		cx2.setColumns(10);
		
		cxresultado = new JTextField();
		cxresultado.setEditable(false);
		cxresultado.setForeground(new Color(255, 255, 255));
		cxresultado.setBackground(new Color(255, 182, 193));
		cxresultado.setBounds(128, 109, 86, 20);
		panel.add(cxresultado);
		cxresultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Declarando as Variaveis
				
				double n1,n2,resultado;
				
				
				if (cx1.getText().equals("") || cx2.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Venho informar-lhe que n�o foi possivel realizar"
							+ "\na soma sem n�meros! Digite novamente.", "Aten��o!", JOptionPane.ERROR_MESSAGE);
				}else {
					//Convreter a caixinha em varialvel
					
					n1 = Double.parseDouble(cx1.getText());
					
					n2 = Double.parseDouble(cx2.getText());
					
					resultado = n1+n2;
					cxresultado.setText(String.valueOf(resultado));
					
				{
						
					}
					
				}
					
			}
		});
		btnNewButton.setBounds(10, 147, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cx1.setText("");
				cx2.setText("");
				cxresultado.setText("");
				
				cx1.requestFocus();
				
			}
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Subtra\u00E7\u00E3o\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double n1, n2, resultado;
			
                n1 = Double.parseDouble(cx1.getText());
				n2 = Double.parseDouble(cx2.getText());
				
				resultado = n1 - n2;
				cxresultado.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_2.setBounds(128, 147, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Multiplica\u00E7\u00E3o");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				double n1, n2, resultado;
			
                n1 = Double.parseDouble(cx1.getText());
				n2 = Double.parseDouble(cx2.getText());
				
				resultado = n1 * n2;
				cxresultado.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_3.setBounds(10, 181, 108, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Divis\u00E3o");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				double n1, n2, resultado;
			
                n1 = Double.parseDouble(cx1.getText());
				n2 = Double.parseDouble(cx2.getText());
				
				resultado = n1 / n2;
				cxresultado.setText(String.valueOf(resultado));
				
				if (n2 == 0) {
					
				}
			}
		});
		btnNewButton_4.setBounds(128, 181, 89, 23);
		panel.add(btnNewButton_4);
	}
}
