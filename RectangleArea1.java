
public class RectangleArea1 {
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
		}
   void calculateArea1() {
	   System.out.println(length*width); 
	   }
   
 static class TestRectangle1{
	public static void main(String args[]) {
  RectangleArea1 r1=new RectangleArea1();
  RectangleArea1 r2=new RectangleArea1();

  r1.insert(11,5);
  r2.insert(3,15);
  r1.calculateArea1();
  r2.calculateArea1();
	}
 }
}