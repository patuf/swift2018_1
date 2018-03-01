package hmw07.shapeexersicelesson.exercise1_shape;

 class Square extends Rectangle {



    Square(double a){
        super(a,a);
    }

    @Override
    public double getPerimeter() {
        return (2+a);
    }

    @Override
    public double getArea() {
        return (a*a);
    }
}
