class ShapeCalculator {

   
    public void area(int radius) {
        double ans = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + (int) ans);
    }

    public void area(int length, int width) {
        int ans = length * width;
        System.out.println("Area of Rectangle : " + (int) ans);
    }

 
    public void area(int base1, int base2, int height) {
        double ans = 0.5 * (base1 + base2) * height;
        System.out.println("Area of Trapezoid : " + (int) ans);
    }
}