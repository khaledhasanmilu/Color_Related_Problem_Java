package Assignment_01;

public class Circle {
    double x;
    double y;
    double radius;
    double PI=3.1416;
    Color z = new Color();
    Circle(double X, double Y, double radius, double R, double G, double B){
        this.x=X;
        this.y=Y;
        this.radius=radius;
        z.setColor(R,G,B);
    }
    public double getRadius() {
        return radius;
    }
    public double[] getCenter(){
        double [] arr = new double[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }
    public double calculateArea(){
        return  PI*radius*radius;
    }
    public void calculateCircumference(){
        double Circumference=2*PI*radius;
        System.out.println("The circumference after calculation:"+" "+Circumference);
    }
}
