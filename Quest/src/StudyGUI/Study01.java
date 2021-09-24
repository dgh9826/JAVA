package StudyGUI;

import java.awt.Font;
import java.util.Enumeration;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Study01 {
	
	static JLabel lbl,lbl2;
	static JButton btn1,btn2;
	static JFrame frm;
	
	static BlueSlime bs1;
	static RedSlime rs1;
	static Human h;
	
	public static void main(String[] args) {
				
				
		//모든 글꼴 통일
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while(keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if(value instanceof FontUIResource)
				UIManager.put(key, new FontUIResource("굴림",Font.PLAIN,14));
		}
		h = new Human("알렉스");
		
		//프레임 생성
		frm = new JFrame();
		frm.setTitle("슬라임 퇴치하기");
		//프레임 크기 설정
		frm.setSize(350,350);
		//프레임을 화면 가운데에 배치
		frm.setLocationRelativeTo(null);
		//프레임을 닫았을 때 메모리에서 제거되도록 설정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 설정
		frm.getContentPane().setLayout(null);
		
		//라벨 설정
		lbl = new JLabel();
		lbl.setBounds(30,210,274,50);
		lbl.setText("게임을 시작합니다.");
		lbl.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(lbl);
		
		lbl2 = new JLabel();
		lbl2.setBounds(30,240,274,50);
		lbl2.setText(h.name+"의 체력은 "+h.hp+"입니다.");
		lbl2.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(lbl2);
		
		
		//라벨생성
		bs1=new BlueSlime("슬라삐");
		//라벨에 넣을 아이콘 생성
		//라벨에 아이콘 설정
		bs1.setIcon(new ImageIcon(Study01.class.getResource("/StudyGUI/img/slime(blue).png")));
		//기타 설정
		bs1.setBounds(30,30,122,130);
		bs1.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(bs1);
		
		rs1 = new RedSlime("슬라디");
		rs1.setIcon(new ImageIcon(Study01.class.getResource("/StudyGUI/img/slime(red).png")));
		rs1.setBounds(182,30,122,130);
		rs1.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(rs1);
		
		//버튼 생성
		btn1 = new JButton(bs1.name);
		btn2 = new JButton(rs1.name);
		//버튼 위치와 크기 설정
		btn1.setBounds(30, 170, 122, 30);
		btn2.setBounds(182, 170, 122, 30);
		//프레임에다가 버튼 추가
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		
		//프레임이 보이도록 설정
		frm.setVisible(true);
		
		//버튼이 눌렸을때
		btn1.addActionListener(event -> {
			battle(bs1);
		});
		btn2.addActionListener(event -> {
			battle(rs1);
		});		
		

	}
	public static void battle(Slime s) {
		
		int randomNum = (int)(Math.random()*3);
		
		if(randomNum==0) {
			lbl.setText(h.name+"의 공격은 빗나갔다.");
			
			s.setBounds(s.getX()+20,30,122,130);
			
			new Timer().schedule(new TimerTask() {

				@Override
				public void run() {
					s.setBounds(s.getX()-20,30,122,130);
				}
				
			}, 500);
		}else {
			h.attack(s);
		}
		if(s instanceof BlueSlime) {
			randomNum = (int)(Math.random()*3);
			if(randomNum==0) {
			((BlueSlime) s).heal(s);
			} else {
				s.attack(h);
			}
		}else {
			randomNum = (int)(Math.random()*3);
			if(randomNum ==0) {
				((RedSlime)s).attack2(h);
			}else {
				s.attack(h);
			}
		}
		if(bs1.hp < 1 && rs1.hp <1) {
			JOptionPane.showMessageDialog(lbl2, "Game Clear!");
			System.exit(0);
		}
	}

}
