package resources;

import javax.swing.JPanel;

public class ReportCard extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private int math;
	private int science;
	private int socialstudies;
	private int reading;
	private int writing;

	
	public ReportCard(){
		math = (int)(Math.random()*13);
		science = (int)(Math.random()*13);
		socialstudies = (int)(Math.random()*13);
		reading = (int)(Math.random()*13);
		writing = (int)(Math.random()*13);
	}
	
	public String getLetterGrade(String subject){
		if(subject.equals("math")){
			if(math % 2 >= 5){
				return "A";
			}else{
				return "F";
			}
		}
		if(subject.equals("science")){
			if(science % 2 >= 5){
				return "A";
			}else{
				return "F";
			}
		}
		if(subject.equals("socialstudies")){
			if(socialstudies % 2 >= 5){
				return "A";
			}else{
				return "F";
			}
		}
		if(subject.equals("reading")){
			if(reading % 2 >= 5){
				return "A";
			}else{
				return "F";
			}
		}
		if(subject.equals("writing")){
			if(writing % 2 >= 5){
				return "A";
			}else{
				return "F";
			}
		}
		return "null";
	}
}
