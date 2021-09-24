package StudyGUI;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.GrayFilter;
import javax.swing.ImageIcon;

public class Human {
	String name;
	int hp=100;
	ImageIcon original;
	
	public Human(String name) {
		this.name=name;
	}
	public void attack(Slime s) {
		original = (ImageIcon)s.getIcon();
		
		ImageIcon bsImg_fire = new ImageIcon(Study01.class.getResource("/StudyGUI/img/slime2(blue).png"));
		ImageIcon rsImg_fire = new ImageIcon(Study01.class.getResource("/StudyGUI/img/slime2(red).png"));
		
		if (s==Study01.bs1) {
			s.setIcon(bsImg_fire);
		}else {
			s.setIcon(rsImg_fire);
		}
		
		Timer timer1 = new Timer();
		TimerTask task1 = new TimerTask() {
			
			@Override
			public void run() {
				s.setIcon(original);
			}
		};
		
		timer1.schedule(task1,500);
		
		s.hp=s.hp-30;
		
		if(s.hp <1) {
			Image colorImage = original.getImage();
			timer1.cancel();
			
			if(s==Study01.bs1) {
				Study01.btn1.setEnabled(false);
			}else {
				Study01.btn2.setEnabled(false);
			}
			ImageFilter filter = new GrayFilter(true,50);
			ImageProducer producer = new FilteredImageSource(colorImage.getSource(), filter);
			Image gImage = Toolkit.getDefaultToolkit().createImage(producer);
			
			s.setIcon(new ImageIcon(gImage));
			
			Study01.lbl.setText(s.name+"를 처치했습니다.");
			Study01.lbl2.setText("");
		}else {
		Study01.lbl.setText(name+"의 공격. "+s.name+"의 체력은 "+s.hp+".");
		}
	}
}
