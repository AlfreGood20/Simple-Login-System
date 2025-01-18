package AppVentanaRegistro;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import AppVentanaLogin.Ventana;

public class VentanaRegistros extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel panelUni;
	private JTextField nombre;
	private JTextField apellido;
	private JComboBox<String> genero;
	private JSpinner edad;
	private JTextField correo;
	private JTextField contraseña;
	
	public VentanaRegistros() {
		setTitle("Ventana Registro");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new ImgFondoRegistro("C:/Users/HP/Documents/PROGRAMACION/SimpleLoginSystem_JavaGui/Imagenes/FondoRegistro.jpg");
		panel.setLayout(null);
		this.getContentPane().add(panel);
		componentes();
	}
	
	private void componentes() {
		panelUni();
		campoTextos();
		etiquetas();
		regresarLogin();
		botonRegistrarme();
	}
	
	private void panelUni() {
		panelUni=new JPanel();
		panelUni.setBackground(Color.WHITE);
		panelUni.setBounds(250,100,850,330);
		panelUni.setLayout(null);
		panel.add(panelUni);
	}
	
	private void campoTextos() {
		nombre=new JTextField("");
		nombre.setBounds(50,50,200,50);
		panelUni.add(nombre);
		MetodoSueltos.agregarEstiloCampo(nombre);
		
		apellido=new JTextField("");
		apellido.setBounds(330,50, 200, 50);
		panelUni.add(apellido);
		MetodoSueltos.agregarEstiloCampo(apellido);
		
		String [] opciones= {"Elegir genero:","Hombre","Mujer","Otro"};
		genero=new JComboBox<>(opciones);
		genero.setBounds(600,50,200,50);
		panelUni.add(genero);
		
		SpinnerNumberModel edadModel = new SpinnerNumberModel(18, 18, 80, 1);  // valor inicial, mínimo, máximo, incremento
        edad = new JSpinner(edadModel);
        edad.setBounds(50,150, 100, 50);  // Establecer la ubicación y tamaño
        panelUni.add(edad);  // Agregar el spinner al panel
        
        correo=new JTextField("@gmail.com");
        correo.setBounds(230,150,300, 50);	
        panelUni.add(correo);
        MetodoSueltos.agregarEstiloCampo(correo);
        
        contraseña=new JTextField();
        contraseña.setBounds(600,150,200,50);
        panelUni.add(contraseña);
        MetodoSueltos.agregarEstiloCampo(contraseña);
    }
	
	private void etiquetas() {
		JLabel etiquetaNombre=new JLabel ("Nombre");
		etiquetaNombre.setBounds(120,-5, 100, 90);
		panelUni.add(etiquetaNombre);
		
		JLabel etiquetaApellido=new JLabel ("Apellido");
		etiquetaApellido.setBounds(410,-5,100,90);
		panelUni.add(etiquetaApellido);
		
		JLabel etiquetaGenero=new JLabel("Selecciona Genero");
		etiquetaGenero.setBounds(640,-5,150,90);
		panelUni.add(etiquetaGenero);
		
		JLabel etiquetaEdad=new JLabel("Edad");
		etiquetaEdad.setBounds(85,95,100, 90);
		panelUni.add(etiquetaEdad);
		
		JLabel etiquetaCorreo=new JLabel("Correo");
		etiquetaCorreo.setBounds(365,95,100,90);
		panelUni.add(etiquetaCorreo);
		
		JLabel etiquetaContra=new JLabel("Crea una contraseña");
		etiquetaContra.setBounds(640,95,150,90);
		panelUni.add(etiquetaContra);
		
		JLabel etiquetaNota=new JLabel("<html>Nota: Ingrese correctamente los datos para no tener problemas.<br>"
		        + "En la contraseña por favor de ingresar al menos 8 caracteres sin espacios.</html>");
		etiquetaNota.setForeground(Color.RED);
		etiquetaNota.setBounds(50,200,800,50);
		panelUni.add(etiquetaNota);
	}
	
	private void botonRegistrarme() {
		JButton registrame=new JButton();
		registrame.setBounds(320,260, 200, 50);
		panelUni.add(registrame);
		
		ImageIcon imagen=new ImageIcon("C:/Users/HP/Documents/PROGRAMACION/SimpleLoginSystem_JavaGui/Imagenes/imgBoton.png"); // AGREGAMOS LA IMAGEN
		registrame.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(270,390,Image.SCALE_SMOOTH)));
		
		registrame.addActionListener(evento->{
			String nombreSelec=(String)nombre.getText();
			String apellidoSelec=(String) apellido.getText();
			String correoSelec=(String) correo.getText();
			String contraseñaSelec=(String) contraseña.getText();
			String generoSelec = (String) genero.getSelectedItem();
			int edadSelec = (int) edad.getValue();
			boolean longiCorrecto=(contraseñaSelec.length()>8);
			
			if(!longiCorrecto) {
				JOptionPane.showMessageDialog(null,"Por favor de tener una contraseña mayor a 8 caracteres");
				if(nombreSelec.equals("") || apellidoSelec.equals("") || correoSelec.equals("@gmail.com")||contraseñaSelec.equals("")  || generoSelec.equals("Elegir genero:")){
				JOptionPane.showMessageDialog(null,"Por favor rellena el formulario correctamente","Datos incorectos",JOptionPane.ERROR_MESSAGE);
				}
			}
			else {
				usuario persona = new usuario(nombreSelec,apellidoSelec,edadSelec,correoSelec,contraseñaSelec,generoSelec);
				baseDeDato base = new baseDeDato();
				base.agregarUsuario(persona);
				JOptionPane.showMessageDialog(null,"Registro exitoso","Nice",JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
                Ventana ventanaLogin=new Ventana();
                ventanaLogin.setVisible(true);
			}
		});
	}
	
	private void regresarLogin() {
		JLabel regresar=new JLabel("<html><a href=''>Regresar al login</a></html>");
		regresar.setBounds(50,280,150,20);
        regresar.setForeground(Color.BLACK);  // PONER DE COLOR AZUL EL TEXTO
        regresar.setCursor(new Cursor(Cursor.HAND_CURSOR));  // Cambiar el cursor al pasar sobre el enlace
        regresar.setFont(new Font("Arial", Font.PLAIN,15));  // Fuente del enlace
        panelUni.add(regresar);
        
        regresar.addMouseListener(new MouseAdapter() {
        	
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		setVisible(false);
                Ventana ventanaLogin=new Ventana();// CREADO CONSTRUCTOR DONDE APRETE EL BOTON 
                ventanaLogin.setVisible(true);						// SE  HABAR LA VENTANA DE LOGIN
            }
        });
	}
}
