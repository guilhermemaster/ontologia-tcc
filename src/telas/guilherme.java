package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import inferencia.Ontologia;


import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guilherme extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guilherme frame = new guilherme();
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
	public guilherme() {
		setTitle("Quarto Guilherme");
		setBounds(100, 100, 450, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 26, 410, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("Temperatura:");
		lblTemperatura.setBounds(12, 12, 108, 15);
		panel.add(lblTemperatura);
		
		JLabel lblLuminosidade = new JLabel("Luminosidade:");
		lblLuminosidade.setBounds(12, 38, 120, 15);
		panel.add(lblLuminosidade);
		
		textField = new JTextField();
		textField.setBounds(114, 10, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 36, 114, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTempo = new JLabel("Tempo:");
		lblTempo.setBounds(246, 12, 70, 15);
		panel.add(lblTempo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(304, 10, 76, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblValoresRecebidosPelos = new JLabel("Valores recebidos pelos sensores");
		lblValoresRecebidosPelos.setBounds(93, -1, 250, 15);
		contentPane.add(lblValoresRecebidosPelos);
		
		JLabel lblEstadoDeCada = new JLabel("Estado");
		lblEstadoDeCada.setBounds(186, 116, 66, 15);
		contentPane.add(lblEstadoDeCada);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(26, 143, 410, 68);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("Temperatura:");
		label_1.setBounds(12, 12, 108, 15);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Luminosidade:");
		label_2.setBounds(12, 38, 120, 15);
		panel_1.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(114, 10, 114, 19);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 36, 114, 19);
		panel_1.add(textField_4);
		
		JLabel label_3 = new JLabel("Tempo:");
		label_3.setBounds(246, 12, 70, 15);
		panel_1.add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(304, 10, 76, 19);
		panel_1.add(textField_5);
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ontologia  m = new Ontologia ();
				m.loadontology();
				
				
			}
		});

		btnGerar.setBounds(157, 227, 117, 25);
		contentPane.add(btnGerar);
	}
}
