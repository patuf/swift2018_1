package Shapes;

public class Square extends Rectangle{
    String name = "square";
    public Square(double a,int x,int y, int fill, int color){
        super(a,a,x,y,fill,color);
    }

    @Override
    public String getName() {
        return name;
    }
}
