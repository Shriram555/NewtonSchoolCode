import java.awt.*;
class MayFrame extends Frame{
	public void My(){
		setTitle("java");
	setBackground(Color.green);
	setSize(1500,700);
	setLayout(null);
	setVisible(true);
	}
	public static void main(String args[]){
		MayFrame frame=new MayFrame();
		frame.My();
		
		//frame.setBackground (Color.yellow);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		//frame.setVisible(true);
	}

}