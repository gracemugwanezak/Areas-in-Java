class Triangle extends Shape{
    double height=3;
    double base=2;
    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("Area of a triangle is ");
        System.out.println((height*base)/2);
    }
}