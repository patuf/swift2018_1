package Shapes;

   public abstract class Shape implements Drawable{
       protected int x;
       protected int y;
       protected int f;
       protected int c;
       protected double perimeter;
       protected double area;
       abstract String getName();

       Shape(int x, int y,int fill, int color){
           this.x = x;
           this.y = y;
           f = fill;
           c = color;
       }

       public void describeMe(){
           System.out.format("The %s, has a perimeter of %.2f and area of %.2f %n",getName(),perimeter,area);
       }

       @Override
       public int getX(){ return x; }

       @Override
       public int getY() { return y; }

       @Override
       public int getFill(){
        return f;
       }

       @Override
       public int getColor(){
        return c;
       }

       public double getPerimeter() {
           return perimeter;
       }

       public double getArea() {
           return area;
       }
   }
