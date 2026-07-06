void main() {
    IO.print("Enter (f) : ");
    double fahrenheit = Double.parseDouble(IO.readln());

    double celsius = (5.0 / 9) * (fahrenheit - 32);

    IO.println("Celsius = %.2f ".formatted(celsius));
}