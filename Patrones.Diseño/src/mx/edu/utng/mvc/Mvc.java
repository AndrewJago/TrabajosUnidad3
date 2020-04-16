package mx.edu.utng.mvc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JEditorPane;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Mvc extends JFrame {
	
	private JPanel contentPane;
	private javax.swing.JScrollPane jScrollPane1;
	private JTextField txtNomTrab;
    Info inf = new Info ();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mvc frame = new Mvc();
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
	public Mvc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Trabajador");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(22, 71, 158, 30);
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Datos del trabajador");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(111, 11, 202, 24);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Puesto");
		lblNewLabel_1_1.setToolTipText("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(22, 112, 158, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Turno");
		lblNewLabel_1_1_1.setToolTipText("");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(22, 153, 158, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtNomTrab = new JTextField();
		txtNomTrab.setBounds(190, 77, 176, 24);
		contentPane.add(txtNomTrab);
		txtNomTrab.setColumns(10);
		
		JTextField txtPuesto = new JTextField();
		txtPuesto.setColumns(10);
		txtPuesto.setBounds(190, 116, 176, 24);
		contentPane.add(txtPuesto);
		
		JTextField txtTurno = new JTextField();
		txtTurno.setColumns(10);
		txtTurno.setBounds(190, 157, 176, 24);
		contentPane.add(txtTurno);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.GREEN);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inf.setNombreTrab(txtNomTrab.getText());
				inf.setPuesto(txtPuesto.getText());
				inf.setTurno(txtTurno.getText());
		        JOptionPane.showMessageDialog(null, "Guardado");
		        
		        
		        txtNomTrab.setText("");
		        txtPuesto.setText("");
		        txtTurno.setText("");
			}
		});
		btnGuardar.setBounds(277, 209, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        
	        JOptionPane.showMessageDialog(null,"Nombre del Trabajador: "+inf.getNombreTab()+"\n"+
					   "Puesto: "+inf.getPuesto()+"\n"+
					   "Turno: "+inf.getTurno());
			}
		});
		btnVisualizar.setBounds(47, 209, 105, 23);
		contentPane.add(btnVisualizar);
	}
}
