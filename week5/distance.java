void main() {
    IO.print("Enter used distance(km) : ");
    double distance = Double.parseDouble(IO.readln());
    IO.print("Enter Fuelefficiency (km/liter)  : ");
    double Fuelefficiency = Double.parseDouble(IO.readln());
    IO.print("Enter Fuelpriceperliter : ");
    double priceperliter = Double.parseDouble(IO.readln());
    double fuel = (distance / Fuelefficiency);
    double cost = (fuel * priceperliter);

    IO.println("Fuel used = %.2f liter".formatted(fuel));
    IO.println("Total cost = %.2f baht".formatted(cost));
}



