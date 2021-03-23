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
		import_imgs();
		init();
		initAdd();
		def_eventos();
	}

	public void import_imgs() {
		//img
			imgBG = new ImageIcon("C:\\Images_croniquiz\\BG.png");
			imgLogo = new ImageIcon("C:\\Images_croniquiz\\Logo.png");
			imgBt = new ImageIcon("C:\\Images_croniquiz\\Button.png");
			imgPontos = new ImageIcon("C:\\Images_croniquiz\\Pontos.png");
			imgRodada = new ImageIcon("C:\\Images_croniquiz\\Rodada.png");
			//imgOp = new ImageIcon("C:\\Images_croniquiz\\Options.png");
			imgInicial = new ImageIcon("C:\\Images_croniquiz\\CroniquizInicial.png");
			imgFinal = new ImageIcon("C:\\Images_croniquiz\\CroniquizFinal.png");
			//Questions
			imgQuest = new ImageIcon("C:\\Images_croniquiz\\Question.png");
			imgQ1 = new ImageIcon("C:\\Images_croniquiz\\Quest1.png");
			imgQ2 = new ImageIcon("C:\\Images_croniquiz\\Quest2.png");
			imgQ3 = new ImageIcon("C:\\Images_croniquiz\\Quest3.png");
			imgQ4 = new ImageIcon("C:\\Images_croniquiz\\Quest4.png");
			imgQ5 = new ImageIcon("C:\\Images_croniquiz\\Quest5.png");
	}	
	public void init() {
		//lb
		lbBG = new JLabel(imgBG);
		lbLogo = new JLabel(imgLogo);
		lbPontos = new JLabel(imgPontos);
		lbRodadas = new JLabel(imgRodada);
		lbBt = new JLabel(imgBt);
		lbOp = new JLabel(imgOp);
		lbInicial = new JLabel(imgInicial);
		lbFinal = new JLabel(imgFinal);
		lbpontos = new JLabel();
		lbrodada = new JLabel();
		//Questions
		lbQuest = new JLabel(imgQuest);
		lbQ1 = new JLabel(imgQ1);
		lbQ2 = new JLabel(imgQ2);
		lbQ3 = new JLabel(imgQ3);
		lbQ4 = new JLabel(imgQ4);
		lbQ5 = new JLabel(imgQ5);
		//bt
		bt1 = new JButton();
		
		//CheckBox
		rb1 = new JRadioButton("");
		rb2 = new JRadioButton("");
		rb3 = new JRadioButton("");
		rb4 = new JRadioButton("");
		rb5 = new JRadioButton("");
		
		initBounds(lbBG,lbPontos,lbRodadas,lbBt,lbOp,lbInicial,lbFinal,lbQuest,lbQ1,lbQ2,lbQ3,lbQ4,lbQ5,lbLogo);
	} 
	public void initAdd() {
		setLayout(null);
		
		//bt
		add(lbpontos);
		add(bt1);
		bt1.setOpaque(true);
		bt1.setBounds(154,513,50,50);
        bt1.setContentAreaFilled(false);
        bt1.setBorderPainted(false);
        
        add(lbInicial);
        lbFinal.setVisible(false);
		add(lbFinal);
		
		//lb
        
        add(lbrodada);
        lbrodada.setFont((new Font("arial", Font.CENTER_BASELINE, 24)));
        lbrodada.setBounds(173, 17, 80, 20);
        lbrodada.setForeground(Color.white);
        lbpontos.setFont((new Font("arial", Font.CENTER_BASELINE, 30)));
        lbpontos.setBounds(153, 597, 80, 20);
        lbpontos.setForeground(Color.white);
        add(lbOp);		
		// -Alternativas do Quiz - botões e checkbox
   
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(rb5);
        JRadioButton[] vetorderb = new JRadioButton[] {rb1,rb2,rb3,rb4,rb5};
		for(JRadioButton a:vetorderb) {
			a.setBackground(new Color(29,7,57));
	        a.setForeground(Color.white);
		}
        rb1.setBounds(20, 309, 322, 42);
        rb2.setBounds(20, 359, 322, 42);
        rb3.setBounds(20, 409, 322, 42);
        rb4.setBounds(20, 459, 322, 42);
        rb5.setBounds(20, 509, 322, 42);
        
        
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
		lbQ2.setVisible(true);
		lbQ3.setVisible(true);
		lbQ4.setVisible(true);
		lbQ5.setVisible(true);

		//
		add(lbBt);
		add(lbLogo);
		add(lbPontos);
		add(lbRodadas);
		add(lbBG);
		
		
		
	}
	public void def_eventos() {
		String[] Layer1 = new String[] {"","Provar para a igreja que a terra não é plana",
				"Deodoro da Fonseca",
				"Peregrino Santo",
				"Fuzileiros navais, João Candido",
				"Direito ao voto feminino e voto secreto; direitos trabalhistas; industrialização brasileira",""};
		String[] Layer2 = new String[] {"","Uma rota diferente para comércio de escravos",
				"Prudente de Moraes",
				"Indígenas locais",
				"Escravos recém libertos, Zumbi dos Palmares",
				"Abolição dos direitos trabalhistas; Ditadura do estado novo; políticas contra imigrantes",""};
		String[] Layer3 = new String[] {"","Buscar novos escravos",
				"Deodoro Peixoto",
				"Machado de Assis",
				"Índios escravizados, líder Yanomami Davi Kopenawa",
				"Fim do voto secreto; privatização de empresas estatais; criação de direitos trabalhistas",""};
		String[] Layer4 = new String[] {"","Ajudar os Espanhóis no combate aos índios",
				"Washington Luís",
				"Lampião e Maria Bonita",
				"Exército brasileiro, Marechal Deodoro da Fonseca",
				"Controle de revoltas comunistas; plano real; industrialização do Brasil",""};
		String[] Layer5 = new String[] {"","Buscar uma nova rota comercial às índias orientais",
				"Floriano Peixoto",
				"Fazendeiros que queriam isenção de impostos",
				"Produtores de café, Getúlio Vargas",
				"Implantação das repúblicas oligárquicas; direitos trabalhistas; direito ao voto feminino",""};
		
		//vetor supremo::::
		
		int[] respostas_certas = new int[]{4,1,0,0,0};
		
		//respostas certas//
		JRadioButton[] vetorderb = new JRadioButton[] {rb1,rb2,rb3,rb4,rb5};	
		for(JRadioButton a:vetorderb){a.setVisible(false);};
		bt1.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent arg0) {	
				rodada++;
				if(rodada<5) {
					rb1.setText(Layer1[rodada]);
					rb2.setText(Layer2[rodada]);
					rb3.setText(Layer3[rodada]);
					rb4.setText(Layer4[rodada]);
					rb5.setText(Layer5[rodada]);
				}
				
				
				for(JRadioButton a:vetorderb) {
					a.setEnabled(true);
				}
				for(JRadioButton a:vetorderb) {
					a.setBackground(new Color(29,7,57));
				}
				if(pontos==0) {
					lbpontos.setText("");
				}else {
					lbpontos.setText(""+pontos);
				}
				lbrodada.setText(""+(rodada));
				switch (rodada) {
				case 1:lbInicial.setVisible(false);for(JRadioButton a:vetorderb){a.setVisible(true);};bt1.setBounds(300,580,50,50);break;
				case 2:lbQ1.setVisible(false);break;
				case 3:lbQ2.setVisible(false);break;
				case 4:lbQ3.setVisible(false);break;
				case 5:lbQ4.setVisible(false);break;
				case 6:lbQ5.setVisible(false);lbFinal.setVisible(true);for(JRadioButton a:vetorderb){a.setVisible(false);};lbpontos.setBounds(115,432,400,75);lbpontos.setFont(new Font("arial", Font.BOLD,80));break;
				case 7:System.exit(0);
				}
			}
		});
		for(JRadioButton a:vetorderb) {
			a.addActionListener(new ActionListener(){	
				public void actionPerformed(ActionEvent arg0) {
					int valorB = -1;
					if(rb1.isSelected()) {
						valorB=0;
					}if(rb2.isSelected()) {
						valorB=1;
					}if(rb3.isSelected()) {
						valorB=2;
					}if(rb4.isSelected()) {
						valorB=3;
					}if(rb5.isSelected()) {
						valorB=4;
					}
					for(JRadioButton a:vetorderb) {
						a.setEnabled(false);
					}
					Auto_vermelho();
					Auto_cores(respostas_certas[rodada-1],valorB);
				}
			});
		}
		
	}
	public void Auto_vermelho() {
		rb1.setBackground(new Color(201,54,58));
		rb2.setBackground(new Color(201,54,58));
		rb3.setBackground(new Color(201,54,58));
		rb4.setBackground(new Color(201,54,58));
		rb5.setBackground(new Color(201,54,58));
	}
	public void Auto_cores(int resp_certa,int selected) {
		switch (resp_certa) {
		case 0:rb1.setBackground(new Color(47,39,136));break;
		case 1:rb2.setBackground(new Color(47,39,136));break;
		case 2:rb3.setBackground(new Color(47,39,136));break;
		case 3:rb4.setBackground(new Color(47,39,136));break;
		case 4:rb5.setBackground(new Color(47,39,136));break;
		}
		if(resp_certa==selected) {
			pontos+=100;
		}
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
