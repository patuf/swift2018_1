package hmw07.shapeexersicelesson.exersice2_shape_drawable;

 class Circle extends Shape {
    private final static double PI = 3.141592654;
    private double r;

    Circle( double r,String shapeName) {
        super(shapeName);// enter name
        this.r = r;
    }



    public double getRadius() {
        return this.r;
    }


    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }

     @Override
     protected String getName() {
         return this.nameShape;
     }

     @Override
     public void setCoordinate(double x, double y) {
         String.format(" My coordinate are %f,%f %n .", x,y);
     }

     @Override
     public void fillShape(int isfill) {
        boolean fill=isfill==1;
         String.format("I am fill whit" +(fill ?"collor":"transperancy"));
     }

     @Override
     protected String describeMe() {
         return super.describeMe();
     }

     @Override
     public void setColor(int color) {
        String.format("My colour is "+color);

     }

 }
