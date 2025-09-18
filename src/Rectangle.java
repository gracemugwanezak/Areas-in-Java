class Rectangle extends Shape{

    double length=2;
    double width=3;
    @Override
    public void calculateArea() {
        try {
            super.calculateArea();
            System.out.println("The area of a rectangle is ");
            System.out.println(length * width);
        }
        catch(Exception e){
            System.out.println("couldn't calculate Area of a rectangle");

        }


    }
}