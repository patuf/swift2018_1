package Shapes;

public interface Drawable {
    void setCoordinates(int x, int y);
    int getX();
    int getY();
    void  fill(int a);
    boolean isFill();
    void color(int a);
    int getColor();
}
