package Assignment_01;

public class Color {
    double R, G, B;

    Color(double R, double G, double B) {
        this.R = R;
        this.G = G;
        this.B = B;
    }

    Color() {

    }

    public Color getColor() {
        Color n;
        n = new Color();
        n.R = this.R;
        n.G = this.G;
        n.B = this.B;
        return n;
    }

    public void setColor(double R, double G , double B){
        this.R = R;
        this.G = G;
        this.B = B;
    }

}
