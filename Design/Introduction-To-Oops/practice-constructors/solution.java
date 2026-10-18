class Rectangle
{
    private double length;
    private double width;
    private double area;

    public Rectangle()
    {
        this.length=1.0;
        this.width=1.0;
    }
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }

    public void calculateArea()
    {
        this.area = this.length * this.width;
    }
    public void displayDetails() {
        System.out.printf("Length : %.2f\n", this.length);
        System.out.printf("Width : %.2f\n", this.width);
        System.out.printf("Area : %.2f\n", this.area);
    }

}