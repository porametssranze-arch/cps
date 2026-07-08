void main() {
    IO.print("Enter (kg) : ");
    double weight = Double.parseDouble(IO.readln());
    IO.print("Enter (km : ");
    double height = Double.parseDouble(IO.readln());
    double bmi = weight / (height * height);

    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, bmi));
}
