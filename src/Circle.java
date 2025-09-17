class Circle extends Shape{

    double  r= 3;
    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("Area of a circle is :");
        System.out.println(Math.PI*Math.pow(r,2));
    }
}