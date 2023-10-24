package homework_week3;
/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * * Method named getWidth without any parameters, it needs to return the value of width field.
 * * Method named getHeight without any parameters, it needs to return the value of height field.
 * * Method named setWidth with one parameter of type double, it needs to set the value of the width
 * field. If the parameter is less than 0 it needs to set the width field value to 0.
 * * Method named setHeight with one parameter of type double, it needs to set the value of the
 * height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * * Method named getArea without any parameters, it needs to return the area of the wall.
 */
public class Wall {
    double width;//instance variable
    double height;//instance variable
    public Wall() //no arg constructor
    {
    }
    public Wall(double width, double height)// parameterized constructor
    {
        setWidth(width);
        setHeight(height);
    }
    public double getWidth() //method returing width
    {
        return width;
    }
    public double getHeight()//method returing height
    {
        return height;
    }
    public void setWidth(double width) //setting width
    {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height)//setting height
    {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getArea() //calculating width and height
    {
        return this.getWidth() * this.getHeight();
    }
    public static void main(String[] args) // main method
    {
        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
    }

}
