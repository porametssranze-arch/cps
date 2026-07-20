void main() {
    IO.print("Enter choice (1=Triangle, 2=BMI) : ");
    int choice = Integer.parseInt(IO.readln());
    if (choice == 1) {
        IO.print("Enter base : ");
        double base = Double.parseDouble(IO.readln());
        IO.print("Enter height : ");
        double height = Double.parseDouble(IO.readln());
        double area = (base * height) / 2;
        IO.println("Triangle Area = %.2f".formatted(area));
        
    } else if (choice == 2) {
        IO.print("Enter weight (kg) : ");
        double weight = Double.parseDouble(IO.readln());
        IO.print("Enter height (m) : ");
        double height = Double.parseDouble(IO.readln());
        double bmi = weight / (height * height);
        IO.println("BMI = %.2f".formatted(bmi));
    } else {
        IO.println("Invalid Choice");
    }
}
