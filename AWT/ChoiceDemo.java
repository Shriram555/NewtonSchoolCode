import java.awt.*;
class ChoiceDemo extends Frame {
	ChoiceDemo(){
		 setLayout(new FlowLayout());
		 Label lab_course=new Label("course");
		 Label lab_day=new Label("day");
		 Choice course=new Choice();
		 course.add("mech");
		 course.add("comp");
		 course.add("civil");
		 String [] day={"Mon","tue","wed","fri"};
		 Choice wk_days=new Choice();
		 for(int i=0;i<day.length;i++){
			 wk_days.add(day[i]);
		 }
		 add(lab_course);
		 add(course);
		 add(lab_day);
		 add(wk_days);
	}
	
	public static void main(String args[]){
		ChoiceDemo s=new ChoiceDemo();
		s.setTitle("choice Demo");
		s.setSize(250,100);
		s.setResizable(false);
		s.setVisible(true);
		}

}