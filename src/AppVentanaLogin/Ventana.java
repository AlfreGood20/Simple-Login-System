package AppVentanaLogin;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import AppVentanaRegistro.VentanaRegistros;

public class Ventana extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextField campoTxtCorreo;
	private JPasswordField campotxtContraseña;
	private JPanel panel;
	private JPanel panelUni;
	
	public Ventana() {
		setTitle("Login");
		setSize(700,550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLocationRelativeTo(null);  
		setResizable(false);
		
		panel=new ImgFondoLogin("C:/Users/HP/Documents/PROGRAMACION/SimpleLoginSystem_JavaGui/Imagenes/FondoLogin2.jpg");
		panel.setLayout(null);
		this.getContentPane().add(panel);
		componentes();
	}
	
	private void componentes() {
		campoTextoCorreo();
		campoTextoContraseña();
		botonConfirmar();
		panelUni();
		botonRegistrame();
	}
	
	private void panelUni() {
		panelUni=new JPanel();
		panelUni.setBackground(Color.WHITE);
		panelUni.setBounds(100,50,480,400);
		panelUni.setLayout(null);
		panel.add(panelUni);
	}
	
	private void campoTextoCorreo() {
		campoTxtCorreo=new JTextField();
		campoTxtCorreo.setBounds(150,160,383, 50);
		MetodosSueltos.addPlaceholder(campoTxtCorreo, "Correo");
		panel.add(campoTxtCorreo);
		
		JLabel texto=new JLabel ("Bienvenido");
		texto.setBounds(150,20,250,200);
		texto.setForeground(Color.BLACK);
		texto.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,40));
		panel.add(texto);
	}
	
	private void campoTextoContraseña() {
		campotxtContraseña=new JPasswordField("Contraseña");
		campotxtContraseña.setBounds(150,250, 383, 50);
		MetodosSueltos.addPlaceholder(campotxtContraseña,"Contraseña"); //ESTO HACE QUE SE OCULTE LA CONTRASEÑA DEL USUARIO
		campotxtContraseña.setEchoChar('*'); //HACE QUE LA CONTRASEÑA DEL USUARIO SE CONVIERTA EN *
		panel.add(campotxtContraseña);
	}
	
	
	private void botonConfirmar() {
		JButton botonLogin=new JButton("Login");
		botonLogin.setBounds(250,320,180, 50);
		botonLogin.addActionListener(evento->{
			String correo = campoTxtCorreo.getText().trim();
		    String contraseña = new String(campotxtContraseña.getPassword()).trim();
		    
			//SI EL CAMPO CORREO TIENE ESPACIO EN BLANCO O SI ESTA VACIO Y SI EL CAMPO CONTRASEÑA ESTA EN BLANCO O VACIO MANDAR ESA INFORMACION
			if (correo.isEmpty() || contraseña.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese datos", "Nota", JOptionPane.INFORMATION_MESSAGE);
	        }
			else {
				LogicaLogin segurar=new LogicaLogin(correo,contraseña);
				if(segurar.comproCorreo() && segurar.comproContraseña()){
					JOptionPane.showMessageDialog(null,"Acabas de entrar al sistema");
				}
				else {
					JOptionPane.showMessageDialog(null,"Correo y contraseña incorrectas");
				}
			}
		});
		panel.add(botonLogin);
	}
	
	private void botonRegistrame() {
		JLabel enlace = new JLabel("<html><a href=''>Crear Cuenta</a></html>");
		enlace.setBounds(50,350,100,30);
        enlace.setForeground(Color.BLACK);  // PONER DE COLOR AZUL EL TEXTO
        enlace.setCursor(new Cursor(Cursor.HAND_CURSOR));  // Cambiar el cursor al pasar sobre el enlace
        enlace.setFont(new Font("Arial", Font.PLAIN,15));  // Fuente del enlace
        panelUni.add(enlace);
        
        enlace.addMouseListener(new MouseAdapter() {
        	
        	@Override
            public void mouseClicked(MouseEvent e) {
        		setVisible(false);
                VentanaRegistros creaCuenta=new VentanaRegistros(); // CREADO CONSTRUCTOR DONDE APRETE EL BOTON 
                creaCuenta.setVisible(true);						// SE  HABAR LA VENTANA DE REGISTROS
            }
        });
	}
	
}
