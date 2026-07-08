void main() {
    IO.print("Enter the base of the triangle :");
    double base = Double.parseDouble(IO.readln());
    IO.print("Enter the heigth of the triangle :");
    double height = Double.parseDouble(IO.readln());

    double triangleArea = 0.5 * base * height;
    IO.println("Area of  the triangle =  %.2f square units".formatted(triangleArea));

    IO.println("----Pre-increment----");

    IO.print("Enter the length of the rectangle :");
    double length = Double.parseDouble(IO.readln());
    IO.print("Enter the width of the rectangle :");
    double width = Double.parseDouble(IO.readln());

    double rectangleArea = length * width;

    IO.println("Area of  the rectangle =  %.2f square units".formatted(rectangleArea));

}