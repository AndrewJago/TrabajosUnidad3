package mx.edu.utng.singleton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Singleton extends JFrame {

	private JPanel contentPane;
	private JTextField txtJuzgado;
	private JTextField txtTipoAct;
	private JTextField txtActo;
	private JTextField txtNumActa;
	private JTextField txtLibro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singleton frame = new Singleton();
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
	public Singleton() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 302);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_3 = new JLabel("Solicitud Registro Civil");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 1;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de Acta");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtTipoAct = new JTextField();
		GridBagConstraints gbc_txtTipoAct = new GridBagConstraints();
		gbc_txtTipoAct.insets = new Insets(0, 0, 5, 5);
		gbc_txtTipoAct.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTipoAct.gridx = 2;
		gbc_txtTipoAct.gridy = 3;
		contentPane.add(txtTipoAct, gbc_txtTipoAct);
		txtTipoAct.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Acto");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtActo = new JTextField();
		GridBagConstraints gbc_txtActo = new GridBagConstraints();
		gbc_txtActo.insets = new Insets(0, 0, 5, 5);
		gbc_txtActo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtActo.gridx = 2;
		gbc_txtActo.gridy = 4;
		contentPane.add(txtActo, gbc_txtActo);
		txtActo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Juzgado");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 5;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		SolicitudSingleton sin = SolicitudSingleton.getInstance();
		
		txtJuzgado = new JTextField();
		GridBagConstraints gbc_txtJuzgado = new GridBagConstraints();
		gbc_txtJuzgado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtJuzgado.insets = new Insets(0, 0, 5, 5);
		gbc_txtJuzgado.gridx = 2;
		gbc_txtJuzgado.gridy = 5;
		contentPane.add(txtJuzgado, gbc_txtJuzgado);
		txtJuzgado.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Libro");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 6;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
				
		txtLibro = new JTextField();
		GridBagConstraints gbc_txtLibro = new GridBagConstraints();
		gbc_txtLibro.insets = new Insets(0, 0, 5, 5);
		gbc_txtLibro.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLibro.gridx = 2;
		gbc_txtLibro.gridy = 6;
		contentPane.add(txtLibro, gbc_txtLibro);
		txtLibro.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("N\u00FAmero de Acta");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 7;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		txtNumActa = new JTextField();
		GridBagConstraints gbc_txtNumActa = new GridBagConstraints();
		gbc_txtNumActa.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumActa.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumActa.gridx = 2;
		gbc_txtNumActa.gridy = 7;
		contentPane.add(txtNumActa, gbc_txtNumActa);
		txtNumActa.setColumns(10);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitudSingleton sin = SolicitudSingleton.getInstance();
				
				Datos info = sin.getInfo();
				
				JOptionPane.showMessageDialog(null,"Tipo de Acta: "+info.getTipoAc()+"\n"+
												   "Acto: "+info.getActo()+"\n"+
												   "Juzgado: "+info.getJuzado()+"\n"+
												   "Libro: "+info.getLibro()+"\n"+
												   "Número de Acta: "+info.getNumActa());
												   
			}
		});
		GridBagConstraints gbc_btnVisualizar = new GridBagConstraints();
		gbc_btnVisualizar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVisualizar.gridx = 1;
		gbc_btnVisualizar.gridy = 9;
		contentPane.add(btnVisualizar, gbc_btnVisualizar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.GREEN);
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Datos info = new Datos();
			info.setTipoAct(txtTipoAct.getText());
			info.setActo(txtActo.getText());
			info.setJuzgado(txtJuzgado.getText());
			info.setLibro(txtLibro.getText());
			info.setNumActa(txtNumActa.getText());
				
			SolicitudSingleton sin = SolicitudSingleton.getInstance();
			sin.setInfo(info);
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 9;
		contentPane.add(btnGuardar, gbc_btnGuardar);
	}

}
