/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**ça marche?!!!!!
	
	bande de cacas
 *
 * @author Clement
 */

package projet;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JWindow;

class Fermeture implements WindowListener{
    @Override
    public void windowClosing(WindowEvent e){
        int r = JOptionPane.showConfirmDialog(null, "Voulez-vous fermer?");
        if(r == 0) {
            System.exit(0);
        }
    }

    @Override
    public void windowOpened(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

public class Webphone extends javax.swing.JFrame {

    
    private JWindow window;
    private int x,y,h1,h2 = 0;
    
    
    public Webphone() {
        initComponents();
        this.addWindowListener(new Fermeture());
    }
     
    public Webphone(String path, String name){
        initComponents();
        this.addWindowListener(new Fermeture());
        labelProjectNameWp.setText(path);
        labelUserLoginWp.setText(name);
        panelBlocHeaderWp.setVisible(false);
        panelBlocBodyWp.setVisible(false);
        panelBlocFooterWp.setVisible(false);
        panelBlocMenuWp.setVisible(false);
        panelBlocWp.setLayout(new BorderLayout());
        
        panelBlocNordWp.setLayout(new FlowLayout());
        panelBlocWp.add(panelBlocNordWp,BorderLayout.NORTH);
       panelBlocWp.add(panelBlocSudWp,BorderLayout.SOUTH);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        textfieldURLWp = new javax.swing.JTextField();
        buttonShowCodeWp = new javax.swing.JButton();
        panelBlocWp = new javax.swing.JPanel();
        panelBlocSudWp = new javax.swing.JPanel();
        panelBlocFooterWp = new javax.swing.JPanel();
        panelBlocBodyWp = new javax.swing.JPanel();
        panelBlocMenuWp = new javax.swing.JPanel();
        panelBlocNordWp = new javax.swing.JPanel();
        panelBlocHeaderWp = new javax.swing.JPanel();
        buttonConvertWp = new javax.swing.JButton();
        buttonShowSiteWp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelHeaderWp = new javax.swing.JPanel();
        tabbedPanelHeaderWp = new javax.swing.JTabbedPane();
        panelPositionHeaderWp = new javax.swing.JPanel();
        comboBox2HeaderWp = new javax.swing.JComboBox();
        panelSizeHeaderWp = new javax.swing.JPanel();
        labelHeightHeaderWp = new javax.swing.JLabel();
        sliderHeightHeaderWp = new javax.swing.JSlider();
        labelHeaderWp = new javax.swing.JLabel();
        checkBoxHeaderWp = new javax.swing.JCheckBox();
        panelBodyWp = new javax.swing.JPanel();
        tabbedPaneBodyWp = new javax.swing.JTabbedPane();
        panelPositionBodyWp = new javax.swing.JPanel();
        comboBox2BodyWp = new javax.swing.JComboBox();
        panelSizeBodyWp = new javax.swing.JPanel();
        sliderWidthBodyWp = new javax.swing.JSlider();
        labelWidthBodyWp = new javax.swing.JLabel();
        labelHeightBodyWp = new javax.swing.JLabel();
        sliderHeightBodyWp = new javax.swing.JSlider();
        labelBodyWp = new javax.swing.JLabel();
        checkBoxBodyWp = new javax.swing.JCheckBox();
        panelMenuWp = new javax.swing.JPanel();
        tabbedPaneMenuWp = new javax.swing.JTabbedPane();
        panelPositionMenuWp = new javax.swing.JPanel();
        comboBox2MenuWp = new javax.swing.JComboBox();
        panelSizeMenuWp = new javax.swing.JPanel();
        labelWidthMenuWp = new javax.swing.JLabel();
        labelHeightMenuWp = new javax.swing.JLabel();
        sliderHeightMenuWp = new javax.swing.JSlider();
        sliderWidthMenuWp = new javax.swing.JSlider();
        labelMenuWp = new javax.swing.JLabel();
        checkBoxMenuWp = new javax.swing.JCheckBox();
        panelFooterWp = new javax.swing.JPanel();
        tabbedPaneFooterWp = new javax.swing.JTabbedPane();
        panelPositionFooterWp = new javax.swing.JPanel();
        comboBox2FooterWp = new javax.swing.JComboBox();
        panelSizeFooterWp = new javax.swing.JPanel();
        labelHeightFooterWp = new javax.swing.JLabel();
        sliderHeightFooterWp = new javax.swing.JSlider();
        labelFooterWp = new javax.swing.JLabel();
        checkBoxFooterWp = new javax.swing.JCheckBox();
        labelProjectNameWp = new javax.swing.JLabel();
        panelLoginWp = new javax.swing.JPanel();
        labelLoginWp = new javax.swing.JLabel();
        labelUserLoginWp = new javax.swing.JLabel();
        labelLogoWp = new javax.swing.JLabel();
        menuBarWp = new javax.swing.JMenuBar();
        menuFileWp = new javax.swing.JMenu();
        itemNewWp = new javax.swing.JMenuItem();
        itemOpenWp = new javax.swing.JMenuItem();
        itemSaveWp = new javax.swing.JMenuItem();
        itemSaveAsWp = new javax.swing.JMenuItem();
        itemDisconnectWp = new javax.swing.JMenuItem();
        itemExitWp = new javax.swing.JMenuItem();
        menuOptionsWp = new javax.swing.JMenu();
        itemPrintWp = new javax.swing.JMenuItem();
        itemResetWp = new javax.swing.JMenuItem();
        menuHelpWp = new javax.swing.JMenu();
        itemPrintTutoWp = new javax.swing.JMenuItem();
        itemDLTutoWp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Webphone");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(100, 100));
        setPreferredSize(new java.awt.Dimension(850, 580));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));
        mainPanel.setPreferredSize(new java.awt.Dimension(850, 580));

        textfieldURLWp.setText("URL de votre site");
        textfieldURLWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldURLWpActionPerformed(evt);
            }
        });

        buttonShowCodeWp.setText("Afficher code");
        buttonShowCodeWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowCodeWpActionPerformed(evt);
            }
        });

        panelBlocWp.setBackground(new java.awt.Color(255, 255, 255));
        panelBlocWp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBlocWp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBlocWp.setFocusCycleRoot(true);
        panelBlocWp.setMaximumSize(new java.awt.Dimension(250, 300));
        panelBlocWp.setPreferredSize(new java.awt.Dimension(200, 250));

        panelBlocSudWp.setPreferredSize(new java.awt.Dimension(200, 45));

        panelBlocFooterWp.setBackground(new java.awt.Color(255, 255, 51));
        panelBlocFooterWp.setPreferredSize(new java.awt.Dimension(100, 45));

        org.jdesktop.layout.GroupLayout panelBlocFooterWpLayout = new org.jdesktop.layout.GroupLayout(panelBlocFooterWp);
        panelBlocFooterWp.setLayout(panelBlocFooterWpLayout);
        panelBlocFooterWpLayout.setHorizontalGroup(
            panelBlocFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        panelBlocFooterWpLayout.setVerticalGroup(
            panelBlocFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 45, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout panelBlocSudWpLayout = new org.jdesktop.layout.GroupLayout(panelBlocSudWp);
        panelBlocSudWp.setLayout(panelBlocSudWpLayout);
        panelBlocSudWpLayout.setHorizontalGroup(
            panelBlocSudWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelBlocSudWpLayout.createSequentialGroup()
                .add(47, 47, 47)
                .add(panelBlocFooterWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(51, 51, 51))
        );
        panelBlocSudWpLayout.setVerticalGroup(
            panelBlocSudWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelBlocFooterWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBlocBodyWp.setBackground(new java.awt.Color(0, 0, 255));

        org.jdesktop.layout.GroupLayout panelBlocBodyWpLayout = new org.jdesktop.layout.GroupLayout(panelBlocBodyWp);
        panelBlocBodyWp.setLayout(panelBlocBodyWpLayout);
        panelBlocBodyWpLayout.setHorizontalGroup(
            panelBlocBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        panelBlocBodyWpLayout.setVerticalGroup(
            panelBlocBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 183, Short.MAX_VALUE)
        );

        panelBlocMenuWp.setBackground(new java.awt.Color(0, 102, 0));

        org.jdesktop.layout.GroupLayout panelBlocMenuWpLayout = new org.jdesktop.layout.GroupLayout(panelBlocMenuWp);
        panelBlocMenuWp.setLayout(panelBlocMenuWpLayout);
        panelBlocMenuWpLayout.setHorizontalGroup(
            panelBlocMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 77, Short.MAX_VALUE)
        );
        panelBlocMenuWpLayout.setVerticalGroup(
            panelBlocMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        panelBlocNordWp.setPreferredSize(new java.awt.Dimension(180, 40));

        panelBlocHeaderWp.setBackground(new java.awt.Color(255, 0, 0));

        org.jdesktop.layout.GroupLayout panelBlocHeaderWpLayout = new org.jdesktop.layout.GroupLayout(panelBlocHeaderWp);
        panelBlocHeaderWp.setLayout(panelBlocHeaderWpLayout);
        panelBlocHeaderWpLayout.setHorizontalGroup(
            panelBlocHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        panelBlocHeaderWpLayout.setVerticalGroup(
            panelBlocHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 40, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout panelBlocNordWpLayout = new org.jdesktop.layout.GroupLayout(panelBlocNordWp);
        panelBlocNordWp.setLayout(panelBlocNordWpLayout);
        panelBlocNordWpLayout.setHorizontalGroup(
            panelBlocNordWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelBlocNordWpLayout.createSequentialGroup()
                .add(49, 49, 49)
                .add(panelBlocHeaderWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBlocNordWpLayout.setVerticalGroup(
            panelBlocNordWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelBlocHeaderWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout panelBlocWpLayout = new org.jdesktop.layout.GroupLayout(panelBlocWp);
        panelBlocWp.setLayout(panelBlocWpLayout);
        panelBlocWpLayout.setHorizontalGroup(
            panelBlocWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelBlocWpLayout.createSequentialGroup()
                .add(panelBlocMenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelBlocBodyWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(panelBlocSudWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .add(panelBlocWpLayout.createSequentialGroup()
                .add(panelBlocNordWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 155, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 43, Short.MAX_VALUE))
        );
        panelBlocWpLayout.setVerticalGroup(
            panelBlocWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelBlocWpLayout.createSequentialGroup()
                .add(panelBlocNordWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelBlocWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(panelBlocBodyWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(panelBlocMenuWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelBlocSudWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        buttonConvertWp.setBackground(new java.awt.Color(204, 204, 204));
        buttonConvertWp.setText("Convertir");

        buttonShowSiteWp.setText("Afficher le site");
        buttonShowSiteWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowSiteWpActionPerformed(evt);
            }
        });

        panelHeaderWp.setBackground(new java.awt.Color(204, 204, 204));
        panelHeaderWp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHeaderWp.setPreferredSize(new java.awt.Dimension(260, 150));

        tabbedPanelHeaderWp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabbedPanelHeaderWp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabbedPanelHeaderWp.setPreferredSize(new java.awt.Dimension(220, 115));
        tabbedPanelHeaderWp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPanelHeaderWpStateChanged(evt);
            }
        });

        panelPositionHeaderWp.setBackground(new java.awt.Color(204, 204, 204));

        comboBox2HeaderWp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Milieu", "Gauche", "Droite" }));
        comboBox2HeaderWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox2HeaderWpActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelPositionHeaderWpLayout = new org.jdesktop.layout.GroupLayout(panelPositionHeaderWp);
        panelPositionHeaderWp.setLayout(panelPositionHeaderWpLayout);
        panelPositionHeaderWpLayout.setHorizontalGroup(
            panelPositionHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelPositionHeaderWpLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .add(comboBox2HeaderWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 186, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPositionHeaderWpLayout.setVerticalGroup(
            panelPositionHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelPositionHeaderWpLayout.createSequentialGroup()
                .add(18, 18, 18)
                .add(comboBox2HeaderWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tabbedPanelHeaderWp.addTab("Position", panelPositionHeaderWp);

        labelHeightHeaderWp.setText("Hauteur :");

        sliderHeightHeaderWp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderHeightHeaderWpStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelSizeHeaderWpLayout = new org.jdesktop.layout.GroupLayout(panelSizeHeaderWp);
        panelSizeHeaderWp.setLayout(panelSizeHeaderWpLayout);
        panelSizeHeaderWpLayout.setHorizontalGroup(
            panelSizeHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelSizeHeaderWpLayout.createSequentialGroup()
                .add(panelSizeHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelSizeHeaderWpLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(labelHeightHeaderWp))
                    .add(panelSizeHeaderWpLayout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(sliderHeightHeaderWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panelSizeHeaderWpLayout.setVerticalGroup(
            panelSizeHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelSizeHeaderWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(labelHeightHeaderWp)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(sliderHeightHeaderWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(22, 22, 22))
        );

        tabbedPanelHeaderWp.addTab("Taille", panelSizeHeaderWp);

        labelHeaderWp.setText("Header");

        checkBoxHeaderWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHeaderWpActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelHeaderWpLayout = new org.jdesktop.layout.GroupLayout(panelHeaderWp);
        panelHeaderWp.setLayout(panelHeaderWpLayout);
        panelHeaderWpLayout.setHorizontalGroup(
            panelHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelHeaderWpLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(panelHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelHeaderWpLayout.createSequentialGroup()
                        .add(labelHeaderWp)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(checkBoxHeaderWp))
                    .add(tabbedPanelHeaderWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 223, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        panelHeaderWpLayout.setVerticalGroup(
            panelHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelHeaderWpLayout.createSequentialGroup()
                .add(7, 7, 7)
                .add(panelHeaderWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(labelHeaderWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(checkBoxHeaderWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(tabbedPanelHeaderWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBodyWp.setBackground(new java.awt.Color(204, 204, 204));
        panelBodyWp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBodyWp.setToolTipText("");
        panelBodyWp.setMaximumSize(new java.awt.Dimension(260, 196));
        panelBodyWp.setPreferredSize(new java.awt.Dimension(260, 150));

        tabbedPaneBodyWp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabbedPaneBodyWp.setPreferredSize(new java.awt.Dimension(220, 115));

        panelPositionBodyWp.setBackground(new java.awt.Color(204, 204, 204));

        comboBox2BodyWp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gauche", "Droite" }));
        comboBox2BodyWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox2BodyWpActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelPositionBodyWpLayout = new org.jdesktop.layout.GroupLayout(panelPositionBodyWp);
        panelPositionBodyWp.setLayout(panelPositionBodyWpLayout);
        panelPositionBodyWpLayout.setHorizontalGroup(
            panelPositionBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelPositionBodyWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(comboBox2BodyWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 186, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPositionBodyWpLayout.setVerticalGroup(
            panelPositionBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelPositionBodyWpLayout.createSequentialGroup()
                .add(15, 15, 15)
                .add(comboBox2BodyWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tabbedPaneBodyWp.addTab("Position", panelPositionBodyWp);

        labelWidthBodyWp.setText("Largeur :");

        labelHeightBodyWp.setText("Hauteur :");

        org.jdesktop.layout.GroupLayout panelSizeBodyWpLayout = new org.jdesktop.layout.GroupLayout(panelSizeBodyWp);
        panelSizeBodyWp.setLayout(panelSizeBodyWpLayout);
        panelSizeBodyWpLayout.setHorizontalGroup(
            panelSizeBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelSizeBodyWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelSizeBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labelWidthBodyWp)
                    .add(sliderWidthBodyWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(panelSizeBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelSizeBodyWpLayout.createSequentialGroup()
                        .add(sliderHeightBodyWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .add(10, 10, 10))
                    .add(panelSizeBodyWpLayout.createSequentialGroup()
                        .add(labelHeightBodyWp)
                        .add(55, 55, 55))))
        );
        panelSizeBodyWpLayout.setVerticalGroup(
            panelSizeBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelSizeBodyWpLayout.createSequentialGroup()
                .add(panelSizeBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelWidthBodyWp)
                    .add(labelHeightBodyWp))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelSizeBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(sliderWidthBodyWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(sliderHeightBodyWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tabbedPaneBodyWp.addTab("Taille", panelSizeBodyWp);

        labelBodyWp.setText("Body");

        checkBoxBodyWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBodyWpActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelBodyWpLayout = new org.jdesktop.layout.GroupLayout(panelBodyWp);
        panelBodyWp.setLayout(panelBodyWpLayout);
        panelBodyWpLayout.setHorizontalGroup(
            panelBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelBodyWpLayout.createSequentialGroup()
                .add(panelBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelBodyWpLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(tabbedPaneBodyWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panelBodyWpLayout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(labelBodyWp)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(checkBoxBodyWp)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBodyWpLayout.setVerticalGroup(
            panelBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelBodyWpLayout.createSequentialGroup()
                .add(7, 7, 7)
                .add(panelBodyWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(labelBodyWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(checkBoxBodyWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(tabbedPaneBodyWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMenuWp.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuWp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelMenuWp.setToolTipText("");

        tabbedPaneMenuWp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabbedPaneMenuWp.setPreferredSize(new java.awt.Dimension(220, 115));

        panelPositionMenuWp.setBackground(new java.awt.Color(204, 204, 204));

        comboBox2MenuWp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gauche", "Droite", "Haut", "Bas" }));
        comboBox2MenuWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox2MenuWpActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelPositionMenuWpLayout = new org.jdesktop.layout.GroupLayout(panelPositionMenuWp);
        panelPositionMenuWp.setLayout(panelPositionMenuWpLayout);
        panelPositionMenuWpLayout.setHorizontalGroup(
            panelPositionMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelPositionMenuWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(comboBox2MenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 186, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPositionMenuWpLayout.setVerticalGroup(
            panelPositionMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelPositionMenuWpLayout.createSequentialGroup()
                .add(16, 16, 16)
                .add(comboBox2MenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tabbedPaneMenuWp.addTab("Position", panelPositionMenuWp);

        labelWidthMenuWp.setText("Largeur :");

        labelHeightMenuWp.setText("Hauteur :");

        org.jdesktop.layout.GroupLayout panelSizeMenuWpLayout = new org.jdesktop.layout.GroupLayout(panelSizeMenuWp);
        panelSizeMenuWp.setLayout(panelSizeMenuWpLayout);
        panelSizeMenuWpLayout.setHorizontalGroup(
            panelSizeMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelSizeMenuWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelSizeMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labelWidthMenuWp)
                    .add(sliderWidthMenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelSizeMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(sliderHeightMenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelHeightMenuWp))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelSizeMenuWpLayout.setVerticalGroup(
            panelSizeMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelSizeMenuWpLayout.createSequentialGroup()
                .add(panelSizeMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelWidthMenuWp)
                    .add(labelHeightMenuWp))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelSizeMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(sliderHeightMenuWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(sliderWidthMenuWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(18, 18, 18))
        );

        tabbedPaneMenuWp.addTab("Taille", panelSizeMenuWp);

        labelMenuWp.setText("Menu");

        checkBoxMenuWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMenuWpActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelMenuWpLayout = new org.jdesktop.layout.GroupLayout(panelMenuWp);
        panelMenuWp.setLayout(panelMenuWpLayout);
        panelMenuWpLayout.setHorizontalGroup(
            panelMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelMenuWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelMenuWpLayout.createSequentialGroup()
                        .add(labelMenuWp)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(checkBoxMenuWp)
                        .add(198, 198, 198))
                    .add(panelMenuWpLayout.createSequentialGroup()
                        .add(tabbedPaneMenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelMenuWpLayout.setVerticalGroup(
            panelMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelMenuWpLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(panelMenuWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(checkBoxMenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelMenuWp))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tabbedPaneMenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(38, 38, 38))
        );

        panelFooterWp.setBackground(new java.awt.Color(204, 204, 204));
        panelFooterWp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelFooterWp.setToolTipText("");
        panelFooterWp.setPreferredSize(new java.awt.Dimension(260, 189));

        tabbedPaneFooterWp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabbedPaneFooterWp.setPreferredSize(new java.awt.Dimension(220, 115));

        panelPositionFooterWp.setBackground(new java.awt.Color(204, 204, 204));

        comboBox2FooterWp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Milieu", "Gauche", "Droite" }));
        comboBox2FooterWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox2FooterWpActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelPositionFooterWpLayout = new org.jdesktop.layout.GroupLayout(panelPositionFooterWp);
        panelPositionFooterWp.setLayout(panelPositionFooterWpLayout);
        panelPositionFooterWpLayout.setHorizontalGroup(
            panelPositionFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelPositionFooterWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(comboBox2FooterWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 186, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPositionFooterWpLayout.setVerticalGroup(
            panelPositionFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelPositionFooterWpLayout.createSequentialGroup()
                .add(14, 14, 14)
                .add(comboBox2FooterWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tabbedPaneFooterWp.addTab("Position", panelPositionFooterWp);

        labelHeightFooterWp.setText("Hauteur :");

        sliderHeightFooterWp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderHeightFooterWpStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelSizeFooterWpLayout = new org.jdesktop.layout.GroupLayout(panelSizeFooterWp);
        panelSizeFooterWp.setLayout(panelSizeFooterWpLayout);
        panelSizeFooterWpLayout.setHorizontalGroup(
            panelSizeFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelSizeFooterWpLayout.createSequentialGroup()
                .add(panelSizeFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelSizeFooterWpLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(labelHeightFooterWp))
                    .add(panelSizeFooterWpLayout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(sliderHeightFooterWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panelSizeFooterWpLayout.setVerticalGroup(
            panelSizeFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelSizeFooterWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(labelHeightFooterWp)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(sliderHeightFooterWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(18, 18, 18))
        );

        tabbedPaneFooterWp.addTab("Taille", panelSizeFooterWp);

        labelFooterWp.setText("Footer");

        checkBoxFooterWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFooterWpActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelFooterWpLayout = new org.jdesktop.layout.GroupLayout(panelFooterWp);
        panelFooterWp.setLayout(panelFooterWpLayout);
        panelFooterWpLayout.setHorizontalGroup(
            panelFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelFooterWpLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(panelFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panelFooterWpLayout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(tabbedPaneFooterWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panelFooterWpLayout.createSequentialGroup()
                        .add(labelFooterWp)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(checkBoxFooterWp))))
        );
        panelFooterWpLayout.setVerticalGroup(
            panelFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelFooterWpLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(panelFooterWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(labelFooterWp)
                    .add(checkBoxFooterWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tabbedPaneFooterWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(38, 38, 38))
        );

        panelLoginWp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelLoginWp.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelLoginWp.setText("Login : ");
        labelLoginWp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labelUserLoginWp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        org.jdesktop.layout.GroupLayout panelLoginWpLayout = new org.jdesktop.layout.GroupLayout(panelLoginWp);
        panelLoginWp.setLayout(panelLoginWpLayout);
        panelLoginWpLayout.setHorizontalGroup(
            panelLoginWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLoginWpLayout.createSequentialGroup()
                .addContainerGap()
                .add(labelLoginWp)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(labelUserLoginWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelLoginWpLayout.setVerticalGroup(
            panelLoginWpLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(labelLoginWp)
            .add(labelUserLoginWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        labelLogoWp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/LogoWP.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 763, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(75, 75, 75))
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(mainPanelLayout.createSequentialGroup()
                                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(mainPanelLayout.createSequentialGroup()
                                        .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelMenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(panelHeaderWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 235, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(55, 55, 55)
                                        .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(panelBodyWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                            .add(panelFooterWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                                    .add(labelProjectNameWp))
                                .add(38, 38, 38)
                                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(buttonConvertWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(panelBlocWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(mainPanelLayout.createSequentialGroup()
                                .add(textfieldURLWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 472, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(buttonShowSiteWp)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(buttonShowCodeWp)
                                .add(18, 18, 18)
                                .add(labelLogoWp)))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 666, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(panelLoginWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelLoginWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(labelProjectNameWp)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(textfieldURLWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(buttonShowSiteWp)
                        .add(buttonShowCodeWp))
                    .add(labelLogoWp))
                .add(22, 22, 22)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(panelHeaderWp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .add(panelBodyWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 162, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(23, 23, 23)
                        .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(panelMenuWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(panelFooterWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(panelBlocWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 299, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(11, 11, 11)
                .add(buttonConvertWp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27))
        );

        menuFileWp.setBackground(new java.awt.Color(204, 204, 204));
        menuFileWp.setText("File");

        itemNewWp.setText("Nouveau");
        menuFileWp.add(itemNewWp);

        itemOpenWp.setText("Ouvrir");
        itemOpenWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpenWpActionPerformed(evt);
            }
        });
        menuFileWp.add(itemOpenWp);

        itemSaveWp.setText("Enregistrer");
        itemSaveWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaveWpActionPerformed(evt);
            }
        });
        menuFileWp.add(itemSaveWp);

        itemSaveAsWp.setText("Enregistrer Sous");
        menuFileWp.add(itemSaveAsWp);

        itemDisconnectWp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        itemDisconnectWp.setText("Se déconnecter");
        itemDisconnectWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDisconnectWpActionPerformed(evt);
            }
        });
        menuFileWp.add(itemDisconnectWp);

        itemExitWp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        itemExitWp.setText("Quitter");
        itemExitWp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitWpActionPerformed(evt);
            }
        });
        menuFileWp.add(itemExitWp);

        menuBarWp.add(menuFileWp);

        menuOptionsWp.setBackground(new java.awt.Color(204, 204, 204));
        menuOptionsWp.setText("Options");

        itemPrintWp.setText("Imprimer");
        menuOptionsWp.add(itemPrintWp);

        itemResetWp.setText("Reinitialiser");
        menuOptionsWp.add(itemResetWp);

        menuBarWp.add(menuOptionsWp);

        menuHelpWp.setBackground(new java.awt.Color(204, 204, 204));
        menuHelpWp.setText("Aide");

        itemPrintTutoWp.setText("Afficher tutoriel");
        menuHelpWp.add(itemPrintTutoWp);

        itemDLTutoWp.setText("Télécharger le tutoriel");
        menuHelpWp.add(itemDLTutoWp);

        menuBarWp.add(menuHelpWp);

        setJMenuBar(menuBarWp);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldURLWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldURLWpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldURLWpActionPerformed

    private void comboBox2HeaderWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox2HeaderWpActionPerformed
       
        /****** Selection HEADER *******/
        
        x= comboBox2HeaderWp.getSelectedIndex();
       if(x==0){ // Milieu
           panelBlocNordWp.setLayout(new FlowLayout());

           validate ();
           
       }
       if(x==1){ // Gauche
            panelBlocNordWp.setLayout(new FlowLayout( FlowLayout.LEFT) );

            validate ();
       }
       if(x==2){ // Droite
            panelBlocNordWp.setLayout(new FlowLayout( FlowLayout.RIGHT) );

            validate ();
       }
       
        
        
    }//GEN-LAST:event_comboBox2HeaderWpActionPerformed

    
    
    private void buttonShowCodeWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowCodeWpActionPerformed
       
        String c=new String(textfieldURLWp.getText());
        String code = new String();

        c = "http://" + c;

            
        URL oracle = null;
        try {
            oracle = new URL(c);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Webphone.class.getName()).log(Level.SEVERE, null, ex);
        }
        URLConnection yc = null;
        try {
            yc = oracle.openConnection();
        } catch (IOException ex) {
            Logger.getLogger(Webphone.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Webphone.class.getName()).log(Level.SEVERE, null, ex);
        }
        String inputLine;

        try {
            while ((inputLine = in.readLine()) != null) {
            code = code + inputLine;
            code = code + "\n";
            }
            
            window = new JWindow();
            window.setSize(600, 600);
            JTextArea text2 = new JTextArea(code);
            text2.setLineWrap(true);
            text2.setEditable(false);
            JScrollPane scroll2 = new JScrollPane(text2);
            window.add(scroll2);
            JButton button2 = new JButton("Fermer");
            window.add(button2, BorderLayout.SOUTH); 

            button2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    button2ActionPerformed(evt);
                }
            });

            window.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(Webphone.class.getName()).log(Level.SEVERE, null, ex);
        }
               
            
     
        
    }//GEN-LAST:event_buttonShowCodeWpActionPerformed

private void button2ActionPerformed(java.awt.event.ActionEvent evt) { 
        window.setVisible(false);
}
    
    private void comboBox2BodyWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox2BodyWpActionPerformed
        
       
       x= comboBox2BodyWp.getSelectedIndex();

       if(x==0){ // Gauche
            panelBlocWp.add(panelBlocBodyWp,BorderLayout.WEST);
            System.out.print("1");
            validate ();
       }
       if(x==1){ // Droite
            panelBlocWp.add(panelBlocBodyWp,BorderLayout.EAST);
            System.out.print("2");
            validate ();
       }
        
    }//GEN-LAST:event_comboBox2BodyWpActionPerformed

    private void comboBox2MenuWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox2MenuWpActionPerformed
        
        x= comboBox2MenuWp.getSelectedIndex();
        
       if(x==0){ // Gauche
           panelBlocWp.add(panelBlocMenuWp,BorderLayout.WEST);
           System.out.print("0");
           validate ();
           
       }
       if(x==1){ // Droite
            panelBlocWp.add(panelBlocMenuWp,BorderLayout.EAST);
            System.out.print("1");
            validate ();
       }
       if(x==2){ // Haut
            panelBlocWp.add(panelBlocMenuWp,BorderLayout.NORTH);
            panelBlocMenuWp.setPreferredSize(new Dimension(200,45));
            System.out.print("2");
            validate ();
       }
       
       if(x==3){ // Bas
            panelBlocWp.add(panelBlocMenuWp,BorderLayout.SOUTH);
            panelBlocMenuWp.setPreferredSize(new Dimension(200,45));
            
            System.out.print("2");
            validate ();
       }  
        
    }//GEN-LAST:event_comboBox2MenuWpActionPerformed

    private void comboBox2FooterWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox2FooterWpActionPerformed

        
        /****** Selection FOOTER *******/
        
        x= comboBox2FooterWp.getSelectedIndex();
       if(x==0){ // Milieu
           panelBlocSudWp.setLayout(new FlowLayout());
           System.out.print("0");
           validate ();
           
       }
       if(x==1){ // Gauche
            panelBlocSudWp.setLayout(new FlowLayout( FlowLayout.LEFT) );
            System.out.print("1");
            validate ();
       }
       if(x==2){ // Droite
            panelBlocSudWp.setLayout(new FlowLayout( FlowLayout.RIGHT) );
            System.out.print("2");
            validate ();
       }      
    }//GEN-LAST:event_comboBox2FooterWpActionPerformed

    private void checkBoxMenuWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMenuWpActionPerformed
        if(checkBoxMenuWp.isSelected()){
            panelBlocMenuWp.setVisible(true);
        }
        else {
            panelBlocMenuWp.setVisible(false);
        }
    }//GEN-LAST:event_checkBoxMenuWpActionPerformed

    private void buttonShowSiteWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowSiteWpActionPerformed
       
         String c=new String(textfieldURLWp.getText());

    c = "http://" + c;
      

if ( Desktop.isDesktopSupported() ) {
    
    Desktop desktop = Desktop.getDesktop();

    if (desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
                try {
                    desktop.browse(new URI(c));  
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Webphone.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                    Logger.getLogger(Webphone.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
}
        
    }//GEN-LAST:event_buttonShowSiteWpActionPerformed

    private void itemOpenWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenWpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemOpenWpActionPerformed

    private void itemSaveWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveWpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSaveWpActionPerformed

    private void itemExitWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitWpActionPerformed
        // TODO add your handling code here:
        int r = JOptionPane.showConfirmDialog(null, "Voulez-vous fermer?");
        if(r == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_itemExitWpActionPerformed

    private void itemDisconnectWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDisconnectWpActionPerformed
        
        this.setVisible(false);
        new Connexion().setVisible(true);
    }//GEN-LAST:event_itemDisconnectWpActionPerformed

    private void checkBoxHeaderWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHeaderWpActionPerformed
        if(checkBoxHeaderWp.isSelected()){
            panelBlocHeaderWp.setVisible(true);
            
        }
        else {
            panelBlocHeaderWp.setVisible(false);
        }
        
    }//GEN-LAST:event_checkBoxHeaderWpActionPerformed

    private void checkBoxBodyWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBodyWpActionPerformed
         if(checkBoxBodyWp.isSelected()){
            panelBlocBodyWp.setVisible(true);
        }
        else {
            panelBlocBodyWp.setVisible(false);
        }
    }//GEN-LAST:event_checkBoxBodyWpActionPerformed

    private void checkBoxFooterWpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFooterWpActionPerformed
        if(checkBoxFooterWp.isSelected()){
            panelBlocFooterWp.setVisible(true);
        }
        else {
            panelBlocFooterWp.setVisible(false);
        }
        
    }//GEN-LAST:event_checkBoxFooterWpActionPerformed

    private void sliderHeightHeaderWpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderHeightHeaderWpStateChanged
        h2=0;
        h2=sliderHeightHeaderWp.getValue();
        panelBlocHeaderWp.setSize(100,h2);
        panelBlocNordWp.setSize(200, h2);
    }//GEN-LAST:event_sliderHeightHeaderWpStateChanged

    private void tabbedPanelHeaderWpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPanelHeaderWpStateChanged

        y=tabbedPanelHeaderWp.getSelectedIndex();
        
        if(y==0){   // Onglet positon
        h2=sliderHeightHeaderWp.getValue();
        System.out.println(h2);
        panelBlocHeaderWp.setSize(100,h2);
        panelBlocNordWp.setSize(200, h2);
        /*** Probleme lorsqu'on change d'onglet le bloc header reprend sa taille d'origine ***/
        validate();
        }
        if(y==1){   // Onglet taille
            
            System.out.println("Onglet taille");
            
        }

    }//GEN-LAST:event_tabbedPanelHeaderWpStateChanged

    private void sliderHeightFooterWpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderHeightFooterWpStateChanged
        
        h2=0;
        h2=sliderHeightFooterWp.getValue();
        panelBlocFooterWp.setSize(100,h2);
        panelBlocSudWp.setSize(200, h2);
                
                
    }//GEN-LAST:event_sliderHeightFooterWpStateChanged
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Webphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Webphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Webphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Webphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Connexion().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConvertWp;
    private javax.swing.JButton buttonShowCodeWp;
    private javax.swing.JButton buttonShowSiteWp;
    private javax.swing.JCheckBox checkBoxBodyWp;
    private javax.swing.JCheckBox checkBoxFooterWp;
    private javax.swing.JCheckBox checkBoxHeaderWp;
    private javax.swing.JCheckBox checkBoxMenuWp;
    private javax.swing.JComboBox comboBox2BodyWp;
    private javax.swing.JComboBox comboBox2FooterWp;
    private javax.swing.JComboBox comboBox2HeaderWp;
    private javax.swing.JComboBox comboBox2MenuWp;
    private javax.swing.JMenuItem itemDLTutoWp;
    private javax.swing.JMenuItem itemDisconnectWp;
    private javax.swing.JMenuItem itemExitWp;
    private javax.swing.JMenuItem itemNewWp;
    private javax.swing.JMenuItem itemOpenWp;
    private javax.swing.JMenuItem itemPrintTutoWp;
    private javax.swing.JMenuItem itemPrintWp;
    private javax.swing.JMenuItem itemResetWp;
    private javax.swing.JMenuItem itemSaveAsWp;
    private javax.swing.JMenuItem itemSaveWp;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBodyWp;
    private javax.swing.JLabel labelFooterWp;
    private javax.swing.JLabel labelHeaderWp;
    private javax.swing.JLabel labelHeightBodyWp;
    private javax.swing.JLabel labelHeightFooterWp;
    private javax.swing.JLabel labelHeightHeaderWp;
    private javax.swing.JLabel labelHeightMenuWp;
    private javax.swing.JLabel labelLoginWp;
    private javax.swing.JLabel labelLogoWp;
    private javax.swing.JLabel labelMenuWp;
    private javax.swing.JLabel labelProjectNameWp;
    private javax.swing.JLabel labelUserLoginWp;
    private javax.swing.JLabel labelWidthBodyWp;
    private javax.swing.JLabel labelWidthMenuWp;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBarWp;
    private javax.swing.JMenu menuFileWp;
    private javax.swing.JMenu menuHelpWp;
    private javax.swing.JMenu menuOptionsWp;
    private javax.swing.JPanel panelBlocBodyWp;
    private javax.swing.JPanel panelBlocFooterWp;
    private javax.swing.JPanel panelBlocHeaderWp;
    private javax.swing.JPanel panelBlocMenuWp;
    private javax.swing.JPanel panelBlocNordWp;
    private javax.swing.JPanel panelBlocSudWp;
    private javax.swing.JPanel panelBlocWp;
    private javax.swing.JPanel panelBodyWp;
    private javax.swing.JPanel panelFooterWp;
    private javax.swing.JPanel panelHeaderWp;
    private javax.swing.JPanel panelLoginWp;
    private javax.swing.JPanel panelMenuWp;
    private javax.swing.JPanel panelPositionBodyWp;
    private javax.swing.JPanel panelPositionFooterWp;
    private javax.swing.JPanel panelPositionHeaderWp;
    private javax.swing.JPanel panelPositionMenuWp;
    private javax.swing.JPanel panelSizeBodyWp;
    private javax.swing.JPanel panelSizeFooterWp;
    private javax.swing.JPanel panelSizeHeaderWp;
    private javax.swing.JPanel panelSizeMenuWp;
    private javax.swing.JSlider sliderHeightBodyWp;
    private javax.swing.JSlider sliderHeightFooterWp;
    private javax.swing.JSlider sliderHeightHeaderWp;
    private javax.swing.JSlider sliderHeightMenuWp;
    private javax.swing.JSlider sliderWidthBodyWp;
    private javax.swing.JSlider sliderWidthMenuWp;
    private javax.swing.JTabbedPane tabbedPaneBodyWp;
    private javax.swing.JTabbedPane tabbedPaneFooterWp;
    private javax.swing.JTabbedPane tabbedPaneMenuWp;
    private javax.swing.JTabbedPane tabbedPanelHeaderWp;
    private javax.swing.JTextField textfieldURLWp;
    // End of variables declaration//GEN-END:variables


    
}
