class Circle extends Shape{

    double  r= 3;
    @Override
    public void calculateArea() {
        try {
            super.calculateArea();
            System.out.println("Area of a circle is :");
            System.out.println(Math.PI * Math.pow(r, 2));
        }
        catch(Exception e){
            System.out.println("Couldn't calculate area of th circle ");
        }
    }
}