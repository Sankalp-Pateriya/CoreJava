package p1;

public class Box {

		double width;
		double depth;
		double height;
		
		public Box(){
			
		}
		
		public Box(double w,double d,double h){
			width=w;
			depth=d;
			height=h;
		}
		
		public void display() {
			System.out.println("Width:"+width);
			System.out.println("Depth:"+depth);
			System.out.println("Height:"+height);
			
		}
		
		public void newBox(Box earlier_box,double w,double d,double h) {
			this.width=earlier_box.width+w;
			this.depth=earlier_box.depth+d;
			this.height=earlier_box.height+h;
			
		}

}
