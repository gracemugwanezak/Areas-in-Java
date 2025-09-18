class Triangle extends Shape{

    double height=3;
    double base=2;
    @Override
    public void calculateArea() {
        try{
            super.calculateArea();
            System.out.println("Area of a triangle is ");
            System.out.println((height * base) / 2);
        }
        catch(Exception e){
            System.out.println("Something is wrong");
        }
        finally{
            System.out.println("The code has to be reviewed");
        }
    }
}