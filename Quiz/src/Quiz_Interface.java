import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz_Interface extends JPanel{
	JLabel lbBG,lbLogo,lbBt,lbPontos,lbRodadas,lbOp;
	JLabel lbQuest,lbQ1,lbQ2,lbQ3,lbQ4,lbQ5;
	ImageIcon imgBG,imgLogo,imgBt,imgPontos,imgRodada,imgOp;
	ImageIcon imgQuest,imgQ1,imgQ2,imgQ3,imgQ4,imgQ5;
	JButton bt1;
	
	public Quiz_Interface(){
		init();
		initBounds();
		initAdd();
		def_eventos();
	}
	
	public void init() {
		//img
		imgBG = new ImageIcon("C:\\Images_croniquiz\\BG.png");
		imgLogo = new ImageIcon("C:\\Images_croniquiz\\Logo.png");
		imgBt = new ImageIcon("C:\\Images_croniquiz\\Button.png");
		imgPontos = new ImageIcon("C:\\Users\\kauac\\Downloads\\Ceap\\Cronica\\Images\\Pontos.png");
		imgRodada = new ImageIcon("C:\\Users\\kauac\\Downloads\\Ceap\\Cronica\\Images\\Rodada.png");
		imgOp = new ImageIcon("C:\\Images_croniquiz\\Options.png");
		//Questions
		imgQuest = new ImageIcon("C:\\Users\\kauac\\Downloads\\Ceap\\Cronica\\Images\\Question.png");
		imgQ1 = new ImageIcon("C:\\Users\\kauac\\Downloads\\Ceap\\Cronica\\Images\\Quest1.png");
		imgQ2 = new ImageIcon("C:\\Users\\kauac\\Downloads\\Ceap\\Cronica\\Images\\Quest2.png");
		imgQ3 = new ImageIcon("C:\\Users\\kauac\\Downloads\\Ceap\\Cronica\\Images\\Quest3.png");
		imgQ4 = new ImageIcon("C:\\Users\\kauac\\Downloads\\Ceap\\Cronica\\Images\\Quest4.png");
		imgQ5 = new ImageIcon("C:\\Users\\kauac\\Downloads\\Ceap\\Cronica\\Images\\Quest5.png");
		//lb
		lbBG = new JLabel(imgBG);
		lbLogo = new JLabel(imgLogo);
		lbPontos = new JLabel(imgPontos);
		lbRodadas = new JLabel(imgRodada);
		lbBt = new JLabel(imgBt);
		lbOp = new JLabel(imgOp);
		//Questions
		lbQuest = new JLabel(imgQuest);
		lbQ1 = new JLabel(imgQ1);
		lbQ2 = new JLabel(imgQ2);
		lbQ3 = new JLabel(imgQ3);
		lbQ4 = new JLabel(imgQ4);
		lbQ5 = new JLabel(imgQ5);
		//bt
		bt1 = new JButton();
	}
	public void initBounds() {
		//lb
		lbBG.setBounds(0,0,360,640);
		lbLogo.setBounds(0,0,360,640);
		lbPontos.setBounds(0,0,360,640);
		lbRodadas.setBounds(0,0,360,640);
		lbBt.setBounds(0,0,360,640);
		lbOp.setBounds(0,0,360,640);
		//Questions
		lbQuest.setBounds(0,0,360,640);
		lbQ1.setBounds(0,0,360,640);
		lbQ2.setBounds(0,0,360,640);
		lbQ3.setBounds(0,0,360,640);
		lbQ4.setBounds(0,0,360,640);
		lbQ5.setBounds(0,0,360,640);
		//bt
		bt1.setBounds(300,575,50,50);
	}
	public void initAdd() {
		setLayout(null);
		//bt
		add(bt1);
		bt1.setOpaque(true);
        bt1.setContentAreaFilled(false);
        bt1.setBorderPainted(false);
		//lb
        
        add(lbOp);		
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
		
	}
	public void def_eventos() {
		//lb

		//img
				
		//bt
		
	}
	
	public static void main (String args[]){
		JFrame frameReferencia = new JFrame("Frame Ref");
		frameReferencia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameReferencia.getContentPane().add(new Quiz_Interface());
		frameReferencia.setVisible(true);
		frameReferencia.setBounds(450,100,375,675);
		
		
	}
}
