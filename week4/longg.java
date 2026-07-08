void main() {
    IO.print("Enter (w) : ");
    double wide = Double.parseDouble(IO.readln());
    IO.print("Enter (l) : ");
    double longg = Double.parseDouble(IO.readln());
    double bsa = (wide * longg) / 360;

    IO.println("body surface area = %.2f ".formatted(bsa));
}    
