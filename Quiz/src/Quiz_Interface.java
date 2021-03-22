import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz_Interface extends JPanel{
	JLabel lbBG,lbLogo,lbBt,lbPontos,lbRodadas,lbOp,lbInicial,lbFinal;
	JLabel lbQuest,lbQ1,lbQ2,lbQ3,lbQ4,lbQ5;
	JLabel lbpontos, lbrodada; 
	ImageIcon imgBG,imgLogo,imgBt,imgPontos,imgRodada,imgOp,imgFinal,imgInicial;
	ImageIcon imgQuest,imgQ1,imgQ2,imgQ3,imgQ4,imgQ5;
	JButton bt1;
	JRadioButton rb1,rb2,rb3,rb4,rb5;
	ButtonGroup btGroup;
	int pontos = 0;
	int rodada = 0;
	public Quiz_Interface(){
		init();
		initAdd();
		def_eventos();
	}
	
	public void init() {
		//img
		imgBG = new ImageIcon("C:\\Images_croniquiz\\BG.png");
		imgLogo = new ImageIcon("C:\\Images_croniquiz\\Logo.png");
		imgBt = new ImageIcon("C:\\Images_croniquiz\\Button.png");
		imgPontos = new ImageIcon("C:\\Images_croniquiz\\Pontos.png");
		imgRodada = new ImageIcon("C:\\Images_croniquiz\\Rodada.png");
		//imgOp = new ImageIcon("C:\\Images_croniquiz\\Options.png");
		imgInicial = new ImageIcon("CroniquizInicial");
		imgFinal = new ImageIcon("CronicalFinal");
		//Questions
		imgQuest = new ImageIcon("C:\\Images_croniquiz\\Question.png");
		imgQ1 = new ImageIcon("C:\\Images_croniquiz\\Quest1.png");
		imgQ2 = new ImageIcon("C:\\Images_croniquiz\\Quest2.png");
		imgQ3 = new ImageIcon("C:\\Images_croniquiz\\Quest3.png");
		imgQ4 = new ImageIcon("C:\\Images_croniquiz\\Quest4.png");
		imgQ5 = new ImageIcon("C:\\Images_croniquiz\\Quest5.png");
		//lb
		lbBG = new JLabel(imgBG);
		lbLogo = new JLabel(imgLogo);
		lbPontos = new JLabel(imgPontos);
		lbRodadas = new JLabel(imgRodada);
		lbBt = new JLabel(imgBt);
		lbOp = new JLabel(imgOp);
		lbInicial = new JLabel(imgInicial);
		lbFinal = new JLabel(imgFinal);
		lbpontos = new JLabel("Pontuação: "+ pontos);
		lbrodada = new JLabel("Rodada: " + rodada);
		//Questions
		lbQuest = new JLabel(imgQuest);
		lbQ1 = new JLabel(imgQ1);
		lbQ2 = new JLabel(imgQ2);
		lbQ3 = new JLabel(imgQ3);
		lbQ4 = new JLabel(imgQ4);
		lbQ5 = new JLabel(imgQ5);
		//bt
		bt1 = new JButton();
		
		//kaio nossa putinha//
		//
		
		//CheckBox
		rb1 = new JRadioButton("1 - arroz e feijão");
		rb2 = new JRadioButton("2 - arros e feijão");
		rb3 = new JRadioButton("3 - arroz e feijo");
		rb4 = new JRadioButton("4 - arroz e gejão");
		rb5 = new JRadioButton("5 - aroz e feijão");
		
		initBounds(lbBG,lbPontos,lbRodadas,lbBt,lbOp,lbInicial,lbFinal,lbQuest,lbQ1,lbQ2,lbQ3,lbQ4,lbQ5,lbLogo);
	}
	
	public void initAdd() {
		setLayout(null);
		//bt
		add(bt1);
		bt1.setOpaque(true);
        bt1.setContentAreaFilled(false);
        bt1.setBorderPainted(false);
		//lb
        add(lbpontos);
        add(lbrodada);
        lbrodada.setFont((new Font("arial", Font.CENTER_BASELINE, 12)));
        lbrodada.setBounds(160, 19, 80, 20);
        lbrodada.setForeground(Color.white);
        lbpontos.setFont((new Font("arial", Font.CENTER_BASELINE, 12)));
        lbpontos.setBounds(140, 597, 80, 20);
        lbpontos.setForeground(Color.white);
        add(lbOp);		
		// -Alternativas do Quiz - botões e checkbox
   
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(rb5);
		
        rb1.setBounds(20, 309, 322, 42);
        rb1.setBackground(new Color(29,7,57));
        rb1.setForeground(Color.white);
       
        rb2.setBounds(20, 359, 322, 42);
        rb2.setBackground(new Color(29,7,57));
        rb2.setForeground(Color.white);
        
        rb3.setBounds(20, 409, 322, 42);
        rb3.setBackground(new Color(29,7,57));
        rb3.setForeground(Color.white);
        
        rb4.setBounds(20, 459, 322, 42);
        rb4.setBackground(new Color(29,7,57));
        rb4.setForeground(Color.white);
        
        rb5.setBounds(20, 509, 322, 42);
        rb5.setBackground(new Color(29,7,57));
        rb5.setForeground(Color.white);
        
        btGroup = new ButtonGroup();
		btGroup.add(rb1);
		btGroup.add(rb2);
		btGroup.add(rb3);
		btGroup.add(rb4);
		btGroup.add(rb5);
        
        // - Perguntas do Quiz em imagens
        //add(lbQuest);
        
		
		add(lbQ1);
		add(lbQ2);
		add(lbQ3);
		add(lbQ4);
		add(lbQ5);
		lbQ1.setVisible(true);
		lbQ2.setVisible(false);
		lbQ3.setVisible(false);
		lbQ4.setVisible(false);
		lbQ5.setVisible(false);
		//
		add(lbBt);
		add(lbLogo);
		add(lbPontos);
		add(lbRodadas);
		add(lbBG);
		add(lbInicial);
		add(lbFinal);
		
	}
	public void def_eventos() {			
		//bt1
		bt1.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent arg0) {

			}
		});
	}
	
	public static void initBounds(JLabel a, JLabel b,JLabel c,JLabel d,JLabel e,JLabel f,JLabel g,JLabel h,JLabel i,JLabel j,JLabel k,JLabel l,JLabel m,JLabel n) {
		JLabel[] vetorJLabel = new JLabel[]{a,b,c,d,e,f,g,h,i,j,k,l,m,n};
		for(JLabel a2: vetorJLabel) {
			a2.setBounds(0,0,360,640);
			}
		}
	public static void main (String args[]){
		JFrame frameReferencia = new JFrame("Croniquiz");
		frameReferencia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameReferencia.getContentPane().add(new Quiz_Interface());
		frameReferencia.setVisible(true);
		frameReferencia.setBounds(450,100,375,675);
		frameReferencia.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Images_croniquiz\\LogoNB.png"));
		
		
	}
}
