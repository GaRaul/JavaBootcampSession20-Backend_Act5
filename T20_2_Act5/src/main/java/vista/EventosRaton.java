package vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 * autores: Abel, Edgar, Raul 
 * Fecha modificacion: 14/02/2022
 */

@SuppressWarnings("serial")
public class EventosRaton extends JFrame implements MouseListener {

	private JButton btnLimpiar;
	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventosRaton frame = new EventosRaton();
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
	public EventosRaton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		addMouseListener(this);

		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});

		btnLimpiar.setBounds(228, 11, 89, 23);
		contentPane.add(btnLimpiar);

		textArea = new JTextArea();
		textArea.setBounds(0, 32, 527, 343);
		contentPane.add(textArea);

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		textArea.append("El raton ha salido del componente\n");
	}

	public void mouseExited(MouseEvent e) {
		textArea.append("El raton ha entrado en el componente\n");
	}
}
