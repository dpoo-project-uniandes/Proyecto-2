
package hotel_system.interfaces;

	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import hotel_system.interfaces.components.Button;

		public class MenuCargaAdmin extends JPanel implements ActionListener{

		    private BufferedImage iconoR;
		    private Button BotonRest;
		    private Button BotonSpa;
		    private Button BotonHabitaciones;
		    private JLabel title;
		    private JPanel PanelOpciones;

		    public 	MenuCargaAdmin()  {
	                configPanel();
	                configTitle();
		            configOpciones();
		            configComponents();
		         }

		    private void configComponents() {
		    		this.add(title);
		    		this.add(PanelOpciones);

		    }

		    private void configPanel() {
		        this.setOpaque(true);
		        this.setBackground(Color.WHITE);
		        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
				this.setBorder(new EmptyBorder(130, 30, 10, 12));

		    }

		    private void configTitle() {
		    	title = new JLabel("Seleccione el servicio que desea cargar:");
		    	title.setBackground(Color.WHITE);
		    	title.setForeground(Color.BLACK);
		    	title.setOpaque(true);
		    	title.setFont(new Font(getName(), Font.BOLD, 16));
		    	title.setHorizontalAlignment(SwingConstants.CENTER);
		    	title.setAlignmentX(Component.RIGHT_ALIGNMENT);
		    }



		    private void configOpciones()  {
		    	 this.BotonRest = new Button("Cargar",new Dimension(150,150));
		    	 this.BotonRest.setBackground(Color.BLACK);
		    	 this.BotonRest.setIcon(new ImageIcon("./assets/cargar.png"));
		    	 this.BotonSpa = new Button("Modificar",new Dimension(150,150));
		    	 this.BotonSpa.setIcon(new ImageIcon("./assets/modificar.png"));
		    	 this.BotonHabitaciones = new Button("Consultar",new Dimension(150,150));
		    	 this.BotonHabitaciones.setIcon(new ImageIcon("./assets/consultar.png"));

		    	 this.PanelOpciones = new JPanel(new FlowLayout(1, 30, 1));
		    	 this.PanelOpciones.setBackground(Color.WHITE);
		 		 this.PanelOpciones.add(this.BotonRest,BorderLayout.CENTER);
		 		 this.PanelOpciones.add(this.BotonSpa,BorderLayout.CENTER);
		 		 this.PanelOpciones.add(this.BotonHabitaciones,BorderLayout.CENTER);

		    }



		    @Override
		    public void actionPerformed(ActionEvent e) {
		    }

	}




