class Rectangle extends Shape{

    double length=2;
    double width=3;
    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("The area of a rectangle is ");
        System.out.println(length*width);

    }
}