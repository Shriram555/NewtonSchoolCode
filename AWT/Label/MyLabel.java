import java.awt.*;
class MyLabel {
	public static void main(String args[]){
		Frame f=new Frame();
	     Label lab1,lab2;
		 lab1=new Label("Welcome");
		 lab1.setBounds(50,50,200,30);
		 lab2=new Label("happy HAnuman jaYENTI");
		 lab2.setBounds(50,100,200,30);
		 f.add(lab1);
		 f.add(lab2);
		 f.setSize(300,300);
		 f.setBackground(Color.red);
		 f.setLayout(null);
		 f.setVisible(true);
		
		}

}