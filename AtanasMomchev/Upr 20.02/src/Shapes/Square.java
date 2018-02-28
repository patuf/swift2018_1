package Shapes;

public class Square extends Rectangle{
    String name = "square";
    public Square(double a,int x,int y, int fill, int color){
        super(a,a,x,y,fill,color);
    }
    public void describeMe(){
        System.out.format("The %s, has a perimeter of %.2f and area of %.2f %n",getName(),getPerimeter(),getArea());
    }

    @Override
    public String getName() {
        return name;
    }
}
