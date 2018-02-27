package Shapes;

   public abstract class Shape {
        protected double perimeter;
        protected double area;
        abstract String getName();
        void describeMe(){
            System.out.format("The %s, has a perimeter of %.2f and area of %.2f",getName(),perimeter,area);
        }
}
