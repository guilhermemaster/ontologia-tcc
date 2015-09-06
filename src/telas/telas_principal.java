package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class telas_principal {

	private JFrame frmAmbienteInteligenet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telas_principal window = new telas_principal();
					window.frmAmbienteInteligenet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telas_principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		guilherme gl = new guilherme();
		
		
		frmAmbienteInteligenet = new JFrame();
		frmAmbienteInteligenet.setTitle("Ambiente inteligenet ");
		frmAmbienteInteligenet.setBounds(100, 100, 555, 208);
		frmAmbienteInteligenet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar_1 = new JMenuBar();
		frmAmbienteInteligenet.setJMenuBar(menuBar_1);
		
		JMenu mnQuartos = new JMenu("Quartos");
		menuBar_1.add(mnQuartos);
		
		JMenuItem mntmGuilherme = new JMenuItem("Guilherme");
		mntmGuilherme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gl.setVisible(true);
				
			}
		});
		mnQuartos.add(mntmGuilherme);
		
		JMenuItem mntmTia = new JMenuItem("Tia");
		mnQuartos.add(mntmTia);
		frmAmbienteInteligenet.getContentPane().setLayout(null);
		
		JLabel lblAmbienteInteligente = new JLabel("Ambiente Inteligente");
		lblAmbienteInteligente.setBounds(227, 56, 186, 15);
		frmAmbienteInteligenet.getContentPane().add(lblAmbienteInteligente);
	}
}
