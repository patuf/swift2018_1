package Shapes;

   public abstract class Shape {
        String name;
        protected double perimeter;
        protected double area;
        String getName(){
            return name;
        }
        void describeMe(){
            System.out.format("The %s, has a perimeter of %.2f and area of %.2f",getName(),perimeter,area);
        }
}
