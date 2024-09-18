 
package view;


import Controller.Controller;
import Model.Deck.Deck;
import Model.Pawn.Pawn;
import Model.Square.EndSlideSquare;
import Model.Square.Square;
import Model.Square.StartSlideSquare;
import Model.card.Card;
import Model.card.NumberElevenCard;
import Model.card.NumberFourCard;
import Model.card.NumberOneCard;
import Model.card.NumberSevenCard;
import Model.card.NumberTenCard;
import Model.card.NumberTwoCard;
import Model.card.SimpleNumberCard;
import Model.card.SorryCard;
import Model.player.Player;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;




public class GraphicsUI extends JFrame {
    private Image image;
    
     
    private JTextArea InfoBox = new javax.swing.JTextArea();
    private JButton[] buttons = new JButton[44];
    private JLabel jLabel1 = new javax.swing.JLabel();
    private JButton CurrentCardButton = new javax.swing.JButton();
    private JPanel jPanel1 = new javax.swing.JPanel();
    private JButton BackCardButton = new javax.swing.JButton();
    public JButton RP1 = new javax.swing.JButton();
    public JButton RP2 = new javax.swing.JButton();
    public JButton YP1 = new javax.swing.JButton();
    public JButton YP2 = new javax.swing.JButton();
    private JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private JButton FoldButton = new javax.swing.JButton();
    private JLabel crete = new javax.swing.JLabel();
    private JLabel SorryImage = new javax.swing.JLabel();
    private JLabel BlueBackGround = new javax.swing.JLabel();
    private JLabel StartRed = new javax.swing.JLabel();
    private JLabel HomeRed = new javax.swing.JLabel();
    private JLabel StartYellow = new javax.swing.JLabel();
    private JLabel HomeYellow = new javax.swing.JLabel();
    private JLabel TL1 = new javax.swing.JLabel();
    private JLabel TL2 = new javax.swing.JLabel();
    private JLabel SL1 = new javax.swing.JLabel();
    private JLabel SL2 = new javax.swing.JLabel();
    private JLabel SL3 = new javax.swing.JLabel();
    private JLabel SL4 = new javax.swing.JLabel();
    private JLabel SL5 = new javax.swing.JLabel();
    private JLabel SL6 = new javax.swing.JLabel();
    private JLabel SL7 = new javax.swing.JLabel();
    private JLabel SL8 = new javax.swing.JLabel();
    private JLabel SL9 = new javax.swing.JLabel();
    private JLabel SL10 = new javax.swing.JLabel();
    private JLabel SL11 = new javax.swing.JLabel();
    private JLabel SL12 = new javax.swing.JLabel();
    private JLabel SL13 = new javax.swing.JLabel();
    private JLabel SL14 = new javax.swing.JLabel();
    private JLabel SL15 = new javax.swing.JLabel();
    private JLabel SL16 = new javax.swing.JLabel();
    private JLabel SL17 = new javax.swing.JLabel();
    private JLabel SL18 = new javax.swing.JLabel();
    private JLabel SL19 = new javax.swing.JLabel();
    private JLabel SL20 = new javax.swing.JLabel();
    private JLabel SL21 = new javax.swing.JLabel();
    private JLabel SL22 = new javax.swing.JLabel();
    private JLabel SL23 = new javax.swing.JLabel();
    private JLabel SL24 = new javax.swing.JLabel();
    private JLabel SL25 = new javax.swing.JLabel();
    private JLabel SL26 = new javax.swing.JLabel();
    private JLabel SL27 = new javax.swing.JLabel();
    private JLabel SL28 = new javax.swing.JLabel();
    private JLabel SL29 = new javax.swing.JLabel();
    private JLabel SL30 = new javax.swing.JLabel();
    private JLabel SL31 = new javax.swing.JLabel();
    private JLabel SL32 = new javax.swing.JLabel();
    private JLabel SL33 = new javax.swing.JLabel();
    private JLabel SL34 = new javax.swing.JLabel();
    private JLabel SL35 = new javax.swing.JLabel();
    private JLabel SL36 = new javax.swing.JLabel();
    private JLabel SL37 = new javax.swing.JLabel();
    private JLabel SL38 = new javax.swing.JLabel();
    private JLabel SL39 = new javax.swing.JLabel();
    private JLabel SL40 = new javax.swing.JLabel();
    private JLabel SL41 = new javax.swing.JLabel();
    private JLabel SL42 = new javax.swing.JLabel();
    private JLabel SL43 = new javax.swing.JLabel();
    private JLabel SL44 = new javax.swing.JLabel();
    private JLabel SL45 = new javax.swing.JLabel();
    private JLabel SL46 = new javax.swing.JLabel();
    private JLabel SL47 = new javax.swing.JLabel();
    private JLabel SL48 = new javax.swing.JLabel();
    private JLabel SL49 = new javax.swing.JLabel();
    private JLabel SL50 = new javax.swing.JLabel();
    private JLabel SL51 = new javax.swing.JLabel();
    private JLabel SL52 = new javax.swing.JLabel();
    private JLabel SL53 = new javax.swing.JLabel();
    private JLabel SL54 = new javax.swing.JLabel();
    private JLabel SL55 = new javax.swing.JLabel();
    private JLabel SL56 = new javax.swing.JLabel();
    private JLabel SL57 = new javax.swing.JLabel();
    private JLabel SL58 = new javax.swing.JLabel();
    private JLabel SL59 = new javax.swing.JLabel();
    private JLabel SL60 = new javax.swing.JLabel();
    private JLabel SL61 = new javax.swing.JLabel();
    private JLabel SL62 = new javax.swing.JLabel();
    private JLabel SL63 = new javax.swing.JLabel();
    private JLabel SL64 = new javax.swing.JLabel();
    private JLabel SL65 = new javax.swing.JLabel();
    private JLabel SL66 = new javax.swing.JLabel();
    private JLabel SL67 = new javax.swing.JLabel();
    private JLabel SL68 = new javax.swing.JLabel();
    private JLabel SL69 = new javax.swing.JLabel();
    private JLabel SL70 = new javax.swing.JLabel();
    private JLabel SL71 = new javax.swing.JLabel();
    private JLabel SL72 = new javax.swing.JLabel();
    private JLabel SL73 = new javax.swing.JLabel();
    
       
    
     Deck deck = new Deck(); //construct a new instance of the deck
     Controller control = new Controller(); //constructs a new instance of the controller
     
     //constructs the pawns
     Pawn R1 = new Pawn("RED",0, 150, 70, 40, 40 );
     Pawn R2 = new Pawn("RED",0, 200, 70, 40, 40 );
       
      Pawn Y1 = new Pawn("YELLOW",29, 390, 570, 40, 40 );
      Pawn Y2 = new Pawn("YELLOW",29, 390, 570, 40, 40 );
     
      //constructs the players
        Player RedPlayer = new Player("Kir alekos","RED", 0);
        Player YellowPlayer = new Player("Paraskeuas","YELLOW", 1);
     
     
    
    /**
     * <b>constructor</b>: Creates a new Window and initializes some buttons and panels 
     * <b>postconditions</b>: Creates a new Window and initializes some buttons and panels
     * 
     */
    public GraphicsUI() throws IOException{
        
        
       
       init_Buttons();
       initComponets();
                           
    }
    
    
    /**
     * <b>transformer(mutative)</b>:sets some buttons and labels for a new deal
     * <p><b>Postcondition:</b> sets some buttons and labels for a new deal </p>
     * @throws java.io.IOException
     */
    public void init_Buttons() throws IOException{
        
        jPanel1.add(CurrentCardButton);
        CurrentCardButton.setBounds(820, 190, 130, 200);
                                 
        FoldButton.setIcon(new javax.swing.ImageIcon("src\\view\\FOLDBUTTON.png"));       
       jPanel1.add(FoldButton);   
        FoldButton.setBounds(720, 430, 180, 70);
        FoldButton.addActionListener(new Fold());
        
      
       
       BackCardButton.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\cards\\backCard.png")); 
       jPanel1.add(BackCardButton);
       BackCardButton.setBounds(680, 190, 130, 200);
       BackCardButton.addActionListener(new BackCardButton());
       
        RP1.setIcon(new javax.swing.ImageIcon("src\\view\\redPawn11.png"));
        RP1.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        jPanel1.add(RP1);
        RP1.setBounds(150, 70, 40, 40);
        
        RP2.setIcon(new javax.swing.ImageIcon("src\\view\\redPawn22.png"));
        RP2.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        jPanel1.add(RP2);
        RP2.setBounds(200, 70, 40, 40);
       
        YP1.setIcon(new javax.swing.ImageIcon("src\\view\\yellowPawn11.png")); 
        YP1.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        jPanel1.add(YP1);
        YP1.setBounds(400, 570, 40, 40);
        
        YP2.setIcon(new javax.swing.ImageIcon("src\\view\\yellowPawn22.png"));
        YP2.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        jPanel1.add(YP2);
        YP2.setBounds(450, 570, 40, 40);
        
    }
    
    /**
     * <b>transformer(mutative)</b>:initializes some buttons and labels 
     * <p><b>Postcondition:</b> initializes some buttons and labels 
     */
    private void initComponets() throws IOException{
       
       /**
        * make the board with labels 
        */
        setTitle("Cretan Sorry Game"); 
        setResizable(false);  
                      
        crete.setIcon(new javax.swing.ImageIcon("src\\view\\Screenshot_2.png"));
        jPanel1.add(crete);
        crete.setBounds(700, 30, 210, 116);
             
       
        InfoBox.setBackground(Color.white);
        InfoBox.setColumns(20);
        InfoBox.setFont(new java.awt.Font("Arial Black", 1, 12));      
        InfoBox.setRows(7);
        InfoBox.setText("Info Box");
        
        jScrollPane1.setViewportView(InfoBox);
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(680, 510, 270, 160);
        
        StartYellow.setBackground(Color.white);
        StartYellow.setFont(new java.awt.Font("Arial Black", 1, 12));   
        StartYellow.setText("START");
        StartYellow.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        StartYellow.setBorder(new javax.swing.border.LineBorder(Color.yellow, 5, true));
        StartYellow.setOpaque(true);
        jPanel1.add(StartYellow);
        StartYellow.setBounds(390, 540, 120, 80);
        
        SL73.setIcon(new javax.swing.ImageIcon("src\\view\\mantinada.png"));         
        jPanel1.add(SL73);
        SL73.setBounds(50, 470, 320, 150);
        
        SL72.setIcon(new javax.swing.ImageIcon("src\\view\\organa.png")); 
        jPanel1.add(SL72);
        SL72.setBounds(420, 70, 160, 130);
        
        SL71.setBackground(Color.white);
        SL71.setFont(new java.awt.Font("Arial Black", 1, 12));   
        SL71.setText("ΗΟΜΕ");
        SL71.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SL71.setBorder(new javax.swing.border.LineBorder(Color.yellow, 5, true));
        SL71.setOpaque(true);
        jPanel1.add(SL71);
        SL71.setBounds(470, 340, 110, 80);
        
        SL70.setBackground(Color.yellow);
        SL70.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL70.setOpaque(true);
        jPanel1.add(SL70);
        SL70.setBounds(520, 420, 40, 40);
        
        SL69.setBackground(Color.yellow);
        SL69.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL69.setOpaque(true);
        jPanel1.add(SL69);
        SL69.setBounds(520, 460, 40, 40);
        
        SL68.setBackground(Color.yellow);     
        SL68.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL68.setOpaque(true);
        jPanel1.add(SL68);
        SL68.setBounds(520, 500, 40, 40);
        
        SL67.setBackground(Color.yellow);
        SL67.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL67.setOpaque(true);
        jPanel1.add(SL67);
        SL67.setBounds(520, 540, 40, 40);
        
        SL66.setBackground(Color.yellow);
        SL66.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL66.setOpaque(true);
        jPanel1.add(SL66);
        SL66.setBounds(520, 580, 40, 40);
        
        HomeRed.setBackground(Color.white);
        HomeRed.setFont(new java.awt.Font("Arial Black", 1, 12));         
        HomeRed.setText("HOME");
        HomeRed.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        HomeRed.setBorder(new javax.swing.border.LineBorder(Color.red, 5, true));
        HomeRed.setOpaque(true);
        jPanel1.add(HomeRed);
        HomeRed.setBounds(60, 260, 110, 80);
        
        SL65.setBackground(Color.red);
        SL65.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL65.setOpaque(true);
        jPanel1.add(SL65);
        SL65.setBounds(80, 220, 40, 40);
        
        SL64.setBackground(Color.red);
        SL64.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL64.setOpaque(true);
        jPanel1.add(SL64);
        SL64.setBounds(80, 180, 40, 40);
        
        SL63.setBackground(Color.red);
        SL63.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL63.setOpaque(true);
        jPanel1.add(SL63);
        SL63.setBounds(80, 140, 40, 40);
        
        SL62.setBackground(Color.red);       
        SL62.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL62.setOpaque(true);
        jPanel1.add(SL62);
        SL62.setBounds(80, 100, 40, 40);
        
        SL61.setBackground(Color.red);
        SL61.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL61.setOpaque(true);
        jPanel1.add(SL61);
        SL61.setBounds(80, 60, 40, 40);
        
        
        SL60.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideMedium.png")); 
        SL60.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));      
        jPanel1.add(SL60);
        SL60.setBounds(120, 20, 40, 40);
        
        
        SL59.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideMedium.png"));      
        SL59.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));    
        jPanel1.add(SL59);
        SL59.setBounds(80, 20, 40, 40);
        
       
        SL58.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideStart.png"));       
        SL58.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL58);
        SL58.setBounds(40, 20, 40, 40);
        
        
        SL57.setBackground(Color.white);
        SL57.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL57.setOpaque(true);
        jPanel1.add(SL57);
        SL57.setBounds(0, 20, 40, 40);
               
        
        SL56.setBackground(Color.white);
        SL56.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL56.setOpaque(true);
        jPanel1.add(SL56);
        SL56.setBounds(0, 60, 40, 40);
        
        
        SL55.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideEnd.png"));
        SL55.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));      
        jPanel1.add(SL55);
        SL55.setBounds(0, 100, 40, 40);
        
        
        SL54.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideMedium.png")); 
        SL54.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));      
        jPanel1.add(SL54);
        SL54.setBounds(0, 140, 40, 40);
        
       
        SL53.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideMedium.png"));
        SL53.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));        
        jPanel1.add(SL53);
        SL53.setBounds(0, 180, 40, 40);
        
        
        SL52.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideMedium.png"));
        SL52.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL52);
        SL52.setBounds(0, 220, 40, 40);
        
        
        SL51.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideStart.png")); 
        SL51.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL51);
        SL51.setBounds(0, 260, 40, 40);
        
        SL50.setBackground(Color.white);
        SL50.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL50.setOpaque(true);
        jPanel1.add(SL50);
        SL50.setBounds(0, 300, 40, 40);
        
        SL49.setBackground(Color.white);
        SL49.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL49.setOpaque(true);
        jPanel1.add(SL49);
        SL49.setBounds(0, 340, 40, 40);
        
        SL48.setBackground(Color.white);
        SL48.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL48.setOpaque(true);
        jPanel1.add(SL48);
        SL48.setBounds(0, 380, 40, 40);
        
        SL47.setBackground(Color.white);
        SL47.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL47.setOpaque(true);
        jPanel1.add(SL47);
        SL47.setBounds(0, 420, 40, 40);
        
        
        SL46.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideEnd.png")); 
        SL46.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL46);
        SL46.setBounds(0, 460, 40, 40);
        
        
        SL45.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideMedium.png")); 
        SL45.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));        
        jPanel1.add(SL45);
        SL45.setBounds(0, 500, 40, 40);       
        
       
        SL44.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideMedium.png")); 
        SL44.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));     
        jPanel1.add(SL44);
        SL44.setBounds(0, 540, 40, 40);
        
        
        SL43.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\greenSlideStart.png")); 
        SL43.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL43);
        SL43.setBounds(0, 580, 40, 40);
        
        
        SL42.setBackground(Color.white);        
        SL42.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL42.setOpaque(true);
        jPanel1.add(SL42);
        SL42.setBounds(0, 620, 40, 40);
        
        SL41.setBackground(Color.white);
        SL41.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL41.setOpaque(true);
        jPanel1.add(SL41);
        SL41.setBounds(40, 620, 40, 40);
        
        
        SL40.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideEnd.png"));
        SL40.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL40);
        SL40.setBounds(80, 620, 40, 40);
        
        
        SL39.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideMedium.png")); 
        SL39.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));      
        jPanel1.add(SL39);
        SL39.setBounds(120, 620, 40, 40);
        
        
        SL38.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideMedium.png")); 
        SL38.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));     
        jPanel1.add(SL38);
        SL38.setBounds(160, 620, 40, 40);
        
        
        SL37.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideMedium.png"));
        SL37.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL37);
        SL37.setBounds(200, 620, 40, 40);
        
        
        SL36.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideStart.png")); 
        SL36.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));        
        jPanel1.add(SL36);
        SL36.setBounds(240, 620, 40, 40);
        
        SL35.setBackground(Color.white);        
        SL35.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL35.setOpaque(true);
        jPanel1.add(SL35);
        SL35.setBounds(280, 620, 40, 40);
        
        SL34.setBackground(Color.white);
        SL34.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL34.setOpaque(true);
        jPanel1.add(SL34);
        SL34.setBounds(320, 620, 40, 40);
        
        SL33.setBackground(Color.white);
        SL33.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL33.setOpaque(true);
        jPanel1.add(SL33);
        SL33.setBounds(360, 620, 40, 40);
        
        SL32.setBackground(Color.white);
        SL32.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL32.setOpaque(true);
        jPanel1.add(SL32);
        SL32.setBounds(400, 620, 40, 40);
        
        
        SL31.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideEnd.png"));
        SL31.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL31);
        SL31.setBounds(440, 620, 40, 40);
        
       
        SL30.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideMedium.png")); 
        SL30.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));        
        jPanel1.add(SL30);
        SL30.setBounds(480, 620, 40, 40);
        
        
        SL29.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideMedium.png")); 
        SL29.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL29);
        SL29.setBounds(520, 620, 40, 40);
        
       
        SL28.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\yellowSlideStart.png")); 
        SL28.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));        
        jPanel1.add(SL28);
        SL28.setBounds(560, 620, 40, 40);
        
        SL27.setBackground(Color.white);      
        SL27.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL27.setOpaque(true);
        jPanel1.add(SL27);
        SL27.setBounds(600, 620, 40, 40);
        
        SL26.setBackground(Color.white);
        SL26.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL26.setOpaque(true);
        jPanel1.add(SL26);
        SL26.setBounds(600, 580, 40, 40);
        
        
        SL25.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideEnd.png")); 
        SL25.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL25);
        SL25.setBounds(600, 540, 40, 40);
        
       
        SL24.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideMedium.png")); 
        SL24.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));     
        jPanel1.add(SL24);
        SL24.setBounds(600, 500, 40, 40);
        
       
        SL23.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideMedium.png")); 
        SL23.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));      
        jPanel1.add(SL23);
        SL23.setBounds(600, 460, 40, 40);
        
        SL22.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideMedium.png")); 
        SL22.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));     
        jPanel1.add(SL22);
        SL22.setBounds(600, 420, 40, 40);
               
        SL21.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideStart.png")); 
        SL21.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL21);
        SL21.setBounds(600, 380, 40, 40);
        
        SL20.setBackground(Color.white);
        SL20.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL20.setOpaque(true);
        jPanel1.add(SL20);
        SL20.setBounds(600, 340, 40, 40);
        
        SL19.setBackground(Color.white);
        SL19.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL19.setOpaque(true);
        jPanel1.add(SL19);
        SL19.setBounds(600, 300, 40, 40);
        
        SL18.setBackground(Color.white);
        SL18.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL18.setOpaque(true);
        jPanel1.add(SL18);
        SL18.setBounds(600, 260, 40, 40);
        
        
        SL17.setBackground(Color.white);
        SL17.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL17.setOpaque(true);
        jPanel1.add(SL17);
        SL17.setBounds(600, 220, 40, 40);
        
        
        SL16.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideEnd.png")); 
        SL16.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));    
        jPanel1.add(SL16);
        SL16.setBounds(600, 180, 40, 40);
        
                
        SL15.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideMedium.png")); 
        SL15.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));    
        jPanel1.add(SL15);
        SL15.setBounds(600, 140, 40, 40);
        
        
        SL14.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideMedium.png")); 
        SL14.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL14);
        SL14.setBounds(600, 100, 40, 40);
        
        
        SL13.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\blueSlideStart.png")); 
        SL13.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));      
        jPanel1.add(SL13);
        SL13.setBounds(600, 60, 40, 40);
        
        SL12.setBackground(Color.white);
        SL12.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL12.setOpaque(true);
        jPanel1.add(SL12);
        SL12.setBounds(600, 20, 40, 40);
        
        SL11.setBackground(Color.white);
        SL11.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL11.setOpaque(true);
        jPanel1.add(SL11);
        SL11.setBounds(560, 20, 40, 40);
        
        
        SL10.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideEnd.png")); 
        SL10.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL10);
        SL10.setBounds(520, 20, 40, 40);
        
             
        SL9.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideMedium.png")); 
        SL9.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));       
        jPanel1.add(SL9);
        SL9.setBounds(480, 20, 40, 40);
        
        
        SL8.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideMedium.png")); 
        SL8.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));        
        jPanel1.add(SL8);
        SL8.setBounds(440, 20, 40, 40);
        
        
        SL7.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideMedium.png")); 
        SL7.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));     
        jPanel1.add(SL7);
        SL7.setBounds(400, 20, 40, 40);
        
               
        SL6.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideStart.png")); 
        SL6.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));      
        jPanel1.add(SL6);
        SL6.setBounds(360, 20, 40, 40);
        
        
        SL5.setBackground(Color.white);
        SL5.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL5.setOpaque(true);
        jPanel1.add(SL5);
        SL5.setBounds(320, 20, 40, 40);
        
        
        SL4.setBackground(Color.white);
        SL4.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL4.setOpaque(true);
        jPanel1.add(SL4);
        SL4.setBounds(280, 20, 40, 40);
        
        
        SL3.setBackground(Color.white);
        SL3.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL3.setOpaque(true);
        jPanel1.add(SL3);
        SL3.setBounds(240, 20, 40, 40);
        
         
        SL2.setBackground(Color.white);
        SL2.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));
        SL2.setOpaque(true);
        jPanel1.add(SL2);
        SL2.setBounds(200, 20, 40, 40);
        
        
        SL1.setIcon(new javax.swing.ImageIcon("src\\view\\images\\images\\slides\\redSlideEnd.png")); 
        SL1.setBorder(new javax.swing.border.LineBorder(Color.black, 1, true));     
        jPanel1.add(SL1);
        SL1.setBounds(160, 20, 40, 40);
        
        TL2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18));
        TL2.setForeground(Color.black);
        TL2.setText("Current Card");
        jPanel1.add(TL2);
        TL2.setBounds(830, 400, 120, 20);
        
        TL1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18));
        TL1.setForeground(Color.black);
        TL1.setText("Receive Card");
        jPanel1.add(TL1);
        TL1.setBounds(690, 400, 120, 20);
      
        StartRed.setBackground(new java.awt.Color(255, 255, 255));
        StartRed.setFont(new java.awt.Font("Arial Black", 1, 12)); 
        StartRed.setForeground(new java.awt.Color(0, 0, 0));
        StartRed.setText("START");
        StartRed.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        StartRed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 5));
        StartRed.setOpaque(true);
        jPanel1.add(StartRed);
        StartRed.setBounds(140, 60, 110, 80);              
        
        SorryImage.setIcon(new javax.swing.ImageIcon("src\\view\\sorryImage.png")); 
        jPanel1.add(SorryImage);
        SorryImage.setBounds(190, 310, 250, 73);     
        
        BlueBackGround.setBackground(new java.awt.Color(153, 204, 255));    
        BlueBackGround.setOpaque(true);
        jPanel1.add(BlueBackGround);
        BlueBackGround.setBounds(0, 20, 640, 640);
        
        jPanel1.setLayout(null);
        jLabel1.setIcon(new javax.swing.ImageIcon("src\\view\\background.png"));
        jLabel1.setBounds(0, -20, 1024, 720);
      
       
        jPanel1.add(jLabel1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       
     

         getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
    }
    
    
 
  
  
  /* a class which is used for doing some action after a Fold button has been pushed */ 
   private class Fold implements ActionListener{
        String message;
       Fold(){
           
       }
       
        @Override
        public void actionPerformed(ActionEvent e) {
            
           control.set_Turn();
                                       
           updateInfobox();
        }
       
   }
   
   /*
   public static void music(){
       
           InputStream music1;
                     
           try {
               music1 = new FileInputStream(new File("src\\view\\lemonia.mp3"));
               AudioStream audio1 = new AudioStream(music1);
               AudioPlayer.player.start(audio1);
              
               System.out.println("ok");
           }
           catch(Exception e){
               System.out.println(e);
           }
           
          
       } */
   
   public void updateInfobox() {
            
           if (control.seeTurn() == 0){
               InfoBox.setText( "InfoBox \n\n Cards Left:" + deck.CardsSize() + "\n Turn:Player 1(Red)");              
            }else  {
               InfoBox.setText( "InfoBox \n\n Cards Left:" + deck.CardsSize() + "\n Turn:Player 2(Yellow)");
            }              
            
    }
   
   /* a class which is used for doing some action after a card button has been pushed */  
     class BackCardButton implements ActionListener {
        ImageIcon[] image = new ImageIcon[11];
        int i = 0, temp, temp2;
        Card card;
        String message;
        int choice = 0;      
        Pawn pawn;
        int lol;
        Square s[] = deck.getSquares();
        
        /**
         * make the stack with the cards
         * @throws IOException 
         */
        BackCardButton() throws IOException { 
            //music();
            image[0] = new ImageIcon(ImageIO.read(new File("src\\view\\card11.png")));
            image[1] = new ImageIcon(ImageIO.read(new File("src\\view\\card22.png")));
            image[2] = new ImageIcon(ImageIO.read(new File("src\\view\\card33.png")));
            image[3] = new ImageIcon(ImageIO.read(new File("src\\view\\card44.png")));
            image[4] = new ImageIcon(ImageIO.read(new File("src\\view\\card55.png")));
            image[5] = new ImageIcon(ImageIO.read(new File("src\\view\\card77.png")));
            image[6] = new ImageIcon(ImageIO.read(new File("src\\view\\card88.png")));
            image[7] = new ImageIcon(ImageIO.read(new File("src\\view\\card1010.png")));
            image[8] = new ImageIcon(ImageIO.read(new File("src\\view\\card1111.png")));
            image[9] = new ImageIcon(ImageIO.read(new File("src\\view\\card1212.png")));
            image[10] = new ImageIcon(ImageIO.read(new File("src\\view\\cardSorrysorry.png")));
            
            
        }

        
       
      
         /**
          * what the BackCardButton do when is pressed
          * @param e 
          */
        @Override
        public void actionPerformed(ActionEvent e) {
                                
            /**
             * change the turn
             * pre-condition: see who player is playing now
             * post-condition: the turn has changed
             */
            control.set_Turn();
                     /**
                      * get the picked card
                      * pre-condition: get the number of the card in the list
                      * post-condition: the card is now selected
                      */             
             card = deck.getCard(0);
             /**
              * remove the selected card from the list
              * pre-condition: take the number of the card in the list
              * post-condition the card is removed
              */
             deck.removeCard(0);
                        
             /**
              * update info box
              * pre-condition: call the updateInfobox
              * post-condition: the message is now in the infoBox
              */
             updateInfobox();          
              /**
               * check is the list is empty to init again the list and shuffle the cards
               * pre-condition:check if the list is empty
               * post-condition: the list is full again and the list is shuffled
               */
             if (deck.isEmpty() == true){
                 deck.init_Cards();
                 deck.shuffleCards();
                 i = 0;
             }
             /**
              * choose pawn for the player who is playing now
              */
              if (control.seeTurn() == 0){
                 
                      while (choice != 1 && choice != 2){
                          
                       choice = Integer.parseInt(JOptionPane.showInputDialog("Give pawn 1 or 2 "));
                       
                       if (choice != 1 && choice != 2){
                           JOptionPane.showMessageDialog(null, "Wrong Pawns"
                          ,"Error Message",JOptionPane.INFORMATION_MESSAGE);
                       }
                      }
                      
             }
             else {
                 
                 choice = Integer.parseInt(JOptionPane.showInputDialog("Give pawn 3 or 4 "));
                 
                 while (choice != 3 && choice != 4){
                     
                       choice = Integer.parseInt(JOptionPane.showInputDialog("Give pawn 3 or 4 "));
                       
                       if (choice != 3 && choice != 4){
                           JOptionPane.showMessageDialog(null, "Wrong Pawns"
                          ,"Error Message",JOptionPane.INFORMATION_MESSAGE);
                       }
                      }
             } 
              /**
               * get the choice of the player
               * pre-condition: ask the current player for his choice
               * post-condition: the pawn has selected
               */
              if (choice == 1){
                  pawn = R1;
                  
              }
              else if (choice == 2){
                  pawn = R2;
                  
              }
              else if (choice == 3){
                  pawn = Y1;
                  
              }else {
                  pawn = Y2;
                  
              }
             
            /**
             * if the card is instanceof NumberOneCard show card number one  
             * pre-condition: check if the card is instanceof NumberOneCard
             * post-condition: the right card is now on the board
             *
             */
            if (card instanceof NumberOneCard){
                CurrentCardButton.setIcon(image[0]);
                  lol =  card.movePawn(pawn, deck.getSquares());
                   temp2 = lol;          
               
                               if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                          /**
                           * slide the pawn if is in a StartSlideSquare with different color
                           * pre-condition: move the pawn with the moves of the card and check if this 
                           * square is instanceof StartSlideSquare
                           * post-condition: if is instanceof StartSlideSquare move the pawn to the end of the slide
                           */     
                      if (s[lol] instanceof StartSlideSquare ){ 
                        if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare )){
                                temp++;
                            }
                        }
                        
                         if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                         
                       
                        /**
                         * press ok to go to the EndSlideSquare
                         * pre-condition: show a window to press ok to see the player how is slide se pawn
                         * post-condition: the pawn is now on the end of the slide
                         */
                        JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        /**
                         * sets the new bounds for the selected pawn
                         * pre-condition: call the functions to take the new bounds
                         * post-condition : the pawn is now in the new square
                         */
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
                                                                                                                                      
                                             
            }
            /**
             * if the card is instance of twocard show the two card in the stack
             * pre-condition: check if the picked card is instanceof NumberTwoCard
             * post-condition: if is instanceof NumberTwoCard show the card2
             */
            else if (card instanceof NumberTwoCard){
                CurrentCardButton.setIcon(image[1]);
                 lol =  card.movePawn(pawn, deck.getSquares());
                 temp2 = lol; 
                
                        /**
                         * set the new bounds for the selected pawn
                         * pre-condition: find the selected pawn
                         * post-condition: the selected pawn is now on the new square
                         * 
                         */
                               if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                               
                      /**
                       * check if the current square is instanceof StartSlideSquare
                       * pre-condition: check if is instanceof StartSlideSquare
                       * post-condition: if is instanceof StartslideSquare move to the end of the slide
                       */         
                    if (s[lol] instanceof StartSlideSquare){
                       if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                        }
                       
                       if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        /**
                         * press ok to go to the end of the slide
                         * pre_condition: show the message to press ok
                         * post-condition: pawn is now on the end of the slide
                         */
                        JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
              control.set_Turn();  
            }
            else if (card instanceof NumberFourCard){
                
                CurrentCardButton.setIcon(image[3]);
                 lol =  card.movePawn(pawn, deck.getSquares());
                 temp2 = lol;
                
                       if (choice == 1){
                           RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                       }
                       else if (choice == 2){
                          RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                       }
                       else if (choice == 3){
                          YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                      }
                      else{
                          YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                      }
                       
                       if (s[lol] instanceof StartSlideSquare){
                       if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                        }
                       if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        
                       JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
               
            }
            
            else if (card instanceof NumberTenCard){            
                CurrentCardButton.setIcon(image[7]);
                 lol =  card.movePawn(pawn, deck.getSquares());
                 temp2 = lol;
                
               
                               if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                               
                    if (s[lol] instanceof StartSlideSquare){
                       if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                        }
                       
                        if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        
                       JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
                               
            }
            else if (card instanceof NumberSevenCard){
                CurrentCardButton.setIcon(image[5]);
                 lol =  card.movePawn(pawn, deck.getSquares());
                 
                 
               
                           if (choice == 1){
                               RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                           }
                           else if (choice == 2){
                              RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                          else if (choice == 3){
                              YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                          else{
                              YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                           
                           if (s[lol] instanceof StartSlideSquare){
                        if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                        }
                        
                        if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        
                        JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
            }
            else if (card instanceof NumberElevenCard){
                CurrentCardButton.setIcon(image[8]);
                
                lol =  card.movePawn(pawn, deck.getSquares());
                         temp2 = lol;                   
               
                           if (choice == 1){
                               RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                           }
                           else if (choice == 2){
                              RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                          else if (choice == 3){
                              YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                          else{
                              YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                           
                           if (s[lol] instanceof StartSlideSquare){
                       if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                        }
                       
                      if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        
                        JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
            }
            else if (card instanceof SorryCard){
                CurrentCardButton.setIcon(image[10]);
            }          
            else if (card instanceof SimpleNumberCard){
                
                    if (card.getMoves() == 3){
                        CurrentCardButton.setIcon(image[2]);
                         lol =  card.movePawn(pawn, deck.getSquares());
                         temp2 = lol;                   
               
                           if (choice == 1){
                               RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                           }
                           else if (choice == 2){
                              RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                          else if (choice == 3){
                              YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                          else{
                              YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                          }
                           
                           if (s[lol] instanceof StartSlideSquare){
                       if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                        }
                       
                      if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        
                        JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
                    }
                    
                    else if (card.getMoves() == 5) {
                        
                         CurrentCardButton.setIcon(image[4]);
                         lol =  card.movePawn(pawn, deck.getSquares());
                         temp2 = lol;
                                                                                           
               
                               if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                               
                               if (s[lol] instanceof StartSlideSquare){
                        if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                        }
                        
                      if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        
                        JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
                    }
                    
                    else if (card.getMoves() == 8){
                        CurrentCardButton.setIcon(image[6]);
                         lol =  card.movePawn(pawn, deck.getSquares());
                         temp2 = lol;
                         
               
                                   if (choice == 1){
                                       RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                                   }
                                   else if (choice == 2){
                                      RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                                  }
                                  else if (choice == 3){
                                      YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                                  }
                                  else{
                                      YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                                  }
                                   
                      if (s[lol] instanceof StartSlideSquare){
                        if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                        }
                        
                        if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        
                       JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
                                   
                    }
                    
                    else if (card.getMoves() == 12){
                        CurrentCardButton.setIcon(image[9]);
                         lol =  card.movePawn(pawn, deck.getSquares());
                         temp2 = lol;
                                                                     

                               if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                               
                               if (s[lol] instanceof StartSlideSquare){
                       if(!pawn.getColor().equals(s[lol].getColor())){
                            temp = lol;
                            while (!(s[temp] instanceof EndSlideSquare)){
                                temp++;
                            }
                       }
                       if (s[temp].get_has_Pawn() == false ){
                               lol = temp;
                        }
                       
                       if (pawn.getColor().equals(s[temp2].getColor())){
                            lol = temp2;
                        }
                        
                        JOptionPane.showMessageDialog(null, "Press Ok to Sllliiiddeeee wooohoooo"
                          ,"Start Slide",JOptionPane.INFORMATION_MESSAGE);
                        
                        if (choice == 1){
                                   RP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                               }
                               else if (choice == 2){
                                  RP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else if (choice == 3){
                                  YP1.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                              else{
                                  YP2.setBounds(s[lol].getX1(), s[lol].getX2(), s[lol].getY1(), s[lol].getY2());
                              }
                  }
                    }
            
            }
            
           
                                                         
        }
        
        
       
    }
   
   
   
   /* a class which is used for doing some action after a Settings button has been pushed */
  private class SettingsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
      
      
  }
  /**
   * the main to start the game
   * 
   * @param lala
   * @throws IOException 
   */
  public static void main(String[] lala) throws IOException{ 
      
      
     
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GraphicsUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GraphicsUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });               
      
  }
   
   
   
}