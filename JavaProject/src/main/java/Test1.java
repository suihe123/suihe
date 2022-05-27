class Triangle1{
      double bottom;
      double height;
      double area;
      double getArea(){
            double area=(bottom*height)/2;
            return area;
       }
}
public class Test1{
    public static void main(String ars[]){
        Triangle1 triangle=new Triangle1();
        triangle.bottom=10;
        triangle.height=2;
        double area=triangle.getArea();
        System.out.println("三角形的面积:"+area);
    }
} 
    
      
      