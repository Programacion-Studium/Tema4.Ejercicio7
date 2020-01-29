package es.Studium.Ejercicio7;
import java.awt.*;
import java.awt.event.*;
/**
 * @author alvaro
 *
 */
public class Ejercicio7 extends Frame implements WindowListener, ActionListener 
{
	private static final long serialVersionUID = 1L;
	Dialog dlgArtNuevo = new Dialog(this, "Diálogo con mensaje", true);
	Label lblArtNuevo = new Label("Nuevo Articulo");
	Dialog dlgArtEliminar = new Dialog(this, "Diálogo� con mensaje", true);
	Label lblArtEliminar = new Label("Articulo Eliminar");
	Dialog dlgArtConsul = new Dialog(this, "Diálogo con mensaje", true);
	Label lblArtConsul = new Label("Articulo Consultar");
	Dialog dlgCliNuevo = new Dialog(this, "Diálogo con mensaje", true);
	Label lblCliNuevo = new Label("Nuevo Cliente");
	Dialog dlgCliEliminar = new Dialog(this, "Diálogo con mensaje", true);
	Label lblCliEliminar = new Label("Eliminar Cliente");
	Dialog dlgCliConsul = new Dialog(this, "Diálogo con mensaje", true);
	Label lblCliConsul = new Label("Consultar Cliente");
	Dialog dlgFactNuevo = new Dialog(this, "Dialogo con mensaje", true);
	Label lblFactNuevo = new Label("Nueva Factura");
	Dialog dlgFactConsul = new Dialog(this, "Dialogo con mensaje", true);
	Label lblFactConsul = new Label("Consultar Factura");
	// En primer lugar creamos la barra de menÃº
	MenuBar barraMenu = new MenuBar();

	// Ahora creamos los elementos principales del menÃº
	Menu menuArt = new Menu("Articulo");
	Menu menuCli = new Menu("Clientes");
	Menu menuFact = new Menu("Facturas");

	// Y Ahora los elementos de cada opciÃ³n del menÃº principal

	// Los siguientes son MenuItem pues dentro no tienen submenÃºs
	MenuItem mniArtNuevo = new MenuItem("Nuevo Articulo");
	MenuItem mniArtEliminar = new MenuItem("Eliminar Articulo");
	MenuItem mniArtConsul = new MenuItem("Consultar Articulo");

	// Luego los de clientes
	MenuItem mniCliNuevo = new MenuItem("Nuevo Cliente");
	MenuItem mniCliEliminar = new MenuItem("Eliminar Cliente");
	MenuItem mniCliConsul = new MenuItem("Consultar Cliente");
	// Luego las Facturas
	MenuItem mniFactNuevo = new MenuItem("Nueva Factura");
	MenuItem mniFactConsul = new MenuItem("Consultar Factura");
	public Ejercicio7()
	{
		setLayout (new FlowLayout());
		setTitle ("Menu" );
		// Establecemos la barra de menÃº
		setMenuBar(barraMenu);
		// Empezamos a aÃ±adirle los elementos
		// menu Articulo
		menuArt.add(mniArtNuevo);
		menuArt.add(mniArtEliminar);
		menuArt.add(mniArtConsul);
		// Menu Cliente
		menuCli.add(mniCliNuevo);
		menuCli.add(mniCliEliminar);
		menuCli.add(mniCliConsul);
		// Menu Facturas
		menuFact.add(mniFactNuevo);
		menuFact.add(mniFactConsul);
		barraMenu.add(menuArt);
		barraMenu.add(menuCli);
		barraMenu.add(menuFact);
		setLocationRelativeTo(null);
		setSize(200,200);
		addWindowListener(this);
		// Se anÌƒaden los Listeners a las opciones de los submenuÌ�s no a las opciones del menuÌ� 
		mniArtNuevo.addActionListener((ActionListener) this);
		mniArtEliminar.addActionListener((ActionListener) this);
		mniArtConsul.addActionListener((ActionListener) this);
		mniCliNuevo.addActionListener((ActionListener) this);
		mniCliEliminar.addActionListener((ActionListener) this);
		mniCliConsul.addActionListener((ActionListener) this);
		mniFactNuevo.addActionListener((ActionListener) this);
		mniFactConsul.addActionListener((ActionListener) this);
		
		dlgArtNuevo.setLayout(new FlowLayout());
		dlgArtNuevo.add(lblArtNuevo);
		dlgArtNuevo.setSize(200,150);
		//Para poder cerrar el DiaÌ�logo 
		dlgArtNuevo.addWindowListener(this);
		
		dlgArtEliminar.setLayout(new FlowLayout());
		dlgArtEliminar.add(lblArtEliminar);
		dlgArtEliminar.setSize(200,150);
		//Para poder cerrar el DiaÌ�logo 
		dlgArtEliminar.addWindowListener(this);
		
		dlgArtConsul.addWindowListener(this);
		dlgArtConsul.setLayout(new FlowLayout());
		dlgArtConsul.add(lblArtConsul);
		dlgArtConsul.setSize(200,150);
		//Para poder cerrar el DiaÌ�logo 
		dlgArtConsul.addWindowListener(this);
		
		dlgCliNuevo.setLayout(new FlowLayout());
		dlgCliNuevo.add(lblCliNuevo);
		dlgCliNuevo.setSize(200,150);
		//Para poder cerrar el DiaÌ�logo 
		dlgCliNuevo.addWindowListener(this);
		
		dlgCliEliminar.setLayout(new FlowLayout());
		dlgCliEliminar.add(lblCliEliminar);
		dlgCliEliminar.setSize(200,150);
		//Para poder cerrar el DiaÌ�logo 
		dlgCliEliminar.addWindowListener(this);
		
		dlgCliConsul.addWindowListener(this);
		dlgCliConsul.setLayout(new FlowLayout());
		dlgCliConsul.add(lblCliConsul);
		dlgCliConsul.setSize(200,150);
		//Para poder cerrar el DiaÌ�logo 
		dlgCliConsul.addWindowListener(this);
		
		dlgFactNuevo.setLayout(new FlowLayout());
		dlgFactNuevo.add(lblFactNuevo);
		dlgFactNuevo.setSize(200,150);
		//Para poder cerrar el DiaÌ�logo
		dlgFactNuevo.addWindowListener(this);
		
		dlgFactConsul.setLayout(new FlowLayout());
		dlgFactConsul.add(lblFactConsul);
		dlgFactConsul.setSize(200,150);
		//Para poder cerrar el DiaÌ�logo 
		dlgFactConsul.addWindowListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio7();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		Object a; a=ae.getSource(); if(a.equals(mniArtNuevo)) 
		{
			dlgArtNuevo.setVisible(true);
		}
		else if(a.equals(mniArtEliminar)) 
		{
			dlgArtEliminar.setVisible(true);
		}
		else if(a.equals(mniArtConsul)) 
		{
			dlgArtConsul.setVisible(true);
		}
		else if(a.equals(mniCliNuevo))
		{
			dlgCliNuevo.setVisible(true);
		}
		else if(a.equals(mniCliEliminar)) 
		{
			dlgCliEliminar.setVisible(true);
		}
		else if(a.equals(mniCliConsul)) 
		{
			dlgCliConsul.setVisible(true);
		}
		else if(a.equals(mniFactNuevo))
		{
			dlgFactNuevo.setVisible(true);
		}
		else if(a.equals(mniFactConsul)) 
		{
			dlgFactConsul.setVisible(true);
		}
	}
	@Override
	public void windowOpened(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent we) {
		if(dlgArtNuevo.isActive()) 
		{
			dlgArtNuevo.setVisible(false); 
		}
		else if(dlgArtEliminar.isActive()) 
		{
			dlgArtEliminar.setVisible(false); 
		}
		else if(dlgArtConsul.isActive()) 
		{
			dlgArtConsul.setVisible(false); 
		}
		else if(dlgCliNuevo.isActive()) 
		{
			dlgCliNuevo.setVisible(false); 
		}
		else if(dlgCliEliminar.isActive()) 
		{
			dlgCliEliminar.setVisible(false); 
		}
		else if(dlgCliConsul.isActive()) 
		{
			dlgCliConsul.setVisible(false); 
		}
		else if(dlgFactNuevo.isActive()) 
		{
			dlgFactNuevo.setVisible(false); 
		}
		else if(dlgCliConsul.isActive()) 
		{
			dlgFactConsul.setVisible(false); 
		}
		else {
			System.exit(0); 
		} 
	}
	@Override
	public void windowClosed(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent we) {
		// TODO Auto-generated method stub
		
	}
}