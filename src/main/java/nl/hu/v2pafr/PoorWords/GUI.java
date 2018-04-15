package nl.hu.v2pafr.PoorWords;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import nl.hu.v2pafr.PoorWords.filewriter.FileFactory;
import nl.hu.v2pafr.PoorWords.parser.Parser;
import nl.hu.v2pafr.PoorWords.parser.Translator;
import nl.hu.v2pafr.PoorWords.strategy.ChooseStrategy;

@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame implements UIInterface{

	//Maak de variabelen aan                  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1 = new JComboBox<String>();
    private javax.swing.JComboBox<String> jComboBox2 = new JComboBox<String>();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1 = new JTextArea();
    private javax.swing.JTextField jTextField1 = new JTextField();
    private Parser parser = new Parser();
    private Translator translator = new Translator();
    private ChooseStrategy strategy = new ChooseStrategy();
    private FileFactory factory = new FileFactory();
    private String translation;
    private String src;
    private ArrayList<String> zinnen = new ArrayList<String>(); 
	
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Translator"));
        
        //Maak de velden, selectboxen en buttons aan en voeg waar nodig een eventlistener hieraan toe
        jTextField1.setText("inputTextField");
        
        jButton1.setText("Translate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jButton2.setText("Export");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		jButton2ActionpPerformed(evt);
        	}
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "German" }));      
        
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"TXT", "CSV", "XML"}));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon("Google.png")); // NOI18N
        jLabel1.setText("labelIMG");
        
        //Maak de layout
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Translator");

        pack();
    }                                                              
    
    //Geef aan wat er moet gebeuren als er een action plaatsvindt.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	src = jTextField1.getText();
    	Translate();
    }
    
    private void jButton2ActionpPerformed(java.awt.event.ActionEvent evt) {
    	Export();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }    
    
    //Verander de foto met de foto die gebruikt wordt bij de zin
    @Override
    public void setPicture(String src) {
    	jLabel1.setIcon(new javax.swing.ImageIcon(src));
        jLabel1.setText("labelIMG");
    }
    
    //Als de zin niet correct is laat dan deze foutmelding zien
    @Override
    public void setError() {
    	jTextArea1.append("Error, dit is geen correcte zin\n");
    	jTextField1.setText("");
    }
    
    //Voeg de vertaalde zin toe aan het scherm
    @Override
    public void addText(String text) {
    	jTextArea1.append(text + "\n");
    	jTextField1.setText("");
    }
    
    //Exporteer de zinnen naar een document
    @Override
    public void Export() {
    	factory.setWriter((String) jComboBox2.getSelectedItem(), zinnen);
    }
    
    //Vertaal de zin en voeg deze ook toe aan de arraylist
    @Override
    public void Translate() {
    	boolean result = parser.checkZin(jTextField1.getText()); 
    	if (result == true) {
    		translation = translator.translate(jTextField1.getText(), "DUTCH", (String) jComboBox1.getSelectedItem());
    		addText(translation);
    		setPicture(strategy.chooseStrategy(src));
    		zinnen.add("Taal 1: " + src + " Taal 2: " + translation);
    	}
    	else {
    		setError();
    	}
    } 
}
