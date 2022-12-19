/**
 * 
 */
package Frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author VISIO TAG
 *
 */
public class Fenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1786612821511865711L;

	/**
	 * 
	 */
	public Fenetre() {
		// TODO Auto-generated constructor stub
		super("My first window");
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		contentPane();
	}
	
	// Panneau
	private JPanel contentPane() {
		
		JPanel contentPane = (JPanel) this.getContentPane();
		

		
		DefaultMutableTreeNode rapport = new DefaultMutableTreeNode("Rapport");
		DefaultMutableTreeNode annee2020 =  new DefaultMutableTreeNode("Annee 2020");
		DefaultMutableTreeNode annee2021 =  new DefaultMutableTreeNode("Annee 2021");
		DefaultMutableTreeNode annee2022 =  new DefaultMutableTreeNode("Annee 2022");
		
		rapport.add(annee2020);
		rapport.add(annee2021);
		rapport.add(annee2022);
		

		DefaultMutableTreeNode janvier =  new DefaultMutableTreeNode("Janvier");
		DefaultMutableTreeNode fevrier =  new DefaultMutableTreeNode("Fevrier");
		DefaultMutableTreeNode mars =  new DefaultMutableTreeNode("Mars");
		
		JScrollPane westComp = new JScrollPane(new JTree(rapport));
		westComp.setPreferredSize(new Dimension(200, 0));
		contentPane.add(editeur(), BorderLayout.CENTER);
		contentPane.add(this.createToolBar(), BorderLayout.NORTH);
		contentPane.add(westComp, BorderLayout.WEST);
		contentPane.add(statusBar(), BorderLayout.SOUTH);
		
		return contentPane;
	}
	
	// barre d'outils
	private JToolBar createToolBar() {
		JToolBar toolbar =  new JToolBar();
		
		JButton btnClic =  new JButton("Imprimer PDF");
		toolbar.add(btnClic);
		
		JButton btnClic1 =  new JButton("Imprimer Excel");
		toolbar.add(btnClic1);
		
		JButton btnClic2 =  new JButton("Annuler");
		toolbar.add(btnClic2);
		
		return toolbar; 
	}
	
	
	private JPanel editeur()
	{
		JPanel panel = new JPanel();
		JEditorPane edit = new JEditorPane();
		edit.setPreferredSize(new Dimension(450, 370));
		panel.add(edit);
		
		JButton btn = new JButton("Valider");
		btn .setPreferredSize(new Dimension(450, 30));
		panel.add(btn);
		
		return panel;
	}
	
	private JPanel statusBar()
	{
		JPanel panel = new JPanel(new FlowLayout());
		
		JLabel lbltxt1 = new JLabel("Heure : 23:10");
		lbltxt1.setPreferredSize(new Dimension(100, 10));
		JLabel lbltxt2 = new JLabel("Date : 20/12/2022");
		lbltxt2.setPreferredSize(new Dimension(100, 10));
		
		panel.add(lbltxt1);
		panel.add(lbltxt2);
		
		return panel;
	}

}
