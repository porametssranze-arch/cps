void main() {
    IO.print("Enter hours : ");
    double hours = Double.parseDouble(IO.readln());
    IO.print("Enter minutes : ");
    double minutes = Double.parseDouble(IO.readln());
    double Total  = (hours * 60) + minutes;

    IO.println("Total minutes  = %.2f ".formatted(Total));
}
