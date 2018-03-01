package Shapes;

   public abstract class Shape implements Drawable{
       private int x;
       private int y;
       private int fill;
       private int color;
       protected double perimeter;
       protected double area ;
       abstract String getName();

       Shape(int x, int y,int fill, int color){
           this.x = x;
           this.y = y;
           this.fill = fill;
           this.color = color;
       }

       public void describeMe(){
           System.out.format("The %s, has a perimeter of %.2f and area of %.2f %n",getName(),getPerimeter(),getArea());
       }

       @Override
       public int getX(){ return x; }

       @Override
       public int getY() { return y; }

       @Override
       public int getFill(){
        return fill;
       }

       @Override
       public int getColor(){
        return color;
       }

       public double getPerimeter() {
           return perimeter;
       }

       public double getArea() {
           return area;
       }

   }
