package AppVentanaLogin;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImgFondoLogin extends JPanel{
	private static final long serialVersionUID = 1L;
	private Image imagen;

    public ImgFondoLogin(String rutaImagen) {
        try {
            imagen = ImageIO.read(new File(rutaImagen));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setLayout(null); // QUITA EL CAMBIO DEL ESTILO DETERMINADO
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0,getWidth(), getHeight(),this);
        }
    }
}