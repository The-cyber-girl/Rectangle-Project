package chatGpt_questions;


public class rectangle {
	
	double width;
	double height;
	
	rectangle(double width,double height){
		this.width =width;
		this.height = height;
	}
	rectangle(){
		this.width =1;
		this.height =1;
	
	}
	
	double area() {
	return width*height;}

}
