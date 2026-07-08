void main() {

    IO.print("Enter price of one dress: ");
    double price = Double.parseDouble(IO.readln());

    IO.print("Enter number of dresses to buy: ");
    int quantity = Integer.parseInt(IO.readln());

    IO.print("Enter discount rate: ");
    double discountRate = Double.parseDouble(IO.readln());

    double totalCost = price * quantity;
    double discountAmount = totalCost * discountRate / 100;
    double netPay = totalCost - discountAmount;

    IO.println("----------------------------------------");
    IO.println("Total cost = %.1f Baht".formatted(totalCost));
    IO.println("discountAmount = %.1f Baht".formatted(discountAmount));
    IO.println("Net Pay = %.1f Baht".formatted(netPay));

}