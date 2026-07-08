void main() {
    IO.print("Enter initial saving :");
    double inital = Double.parseDouble(IO.readln());
    IO.print("Enter monthly saving :");
    double monthly = Double.parseDouble(IO.readln());
    IO.print("Enter number of monthls :");
    double number = Double.parseDouble(IO.readln());
    IO.print("Enter interest percent :");
    double interestpercent = Double.parseDouble(IO.readln());
    double totalSaving = inital + (monthly * number);
    double interest = totalSaving * interestpercent / 100;
    double finalSaving = totalSaving + interest;

    IO.println("Total saving before interest =  %.2f bath".formatted(totalSaving));
    IO.println("Interest =  %.2f bath".formatted(interest));
    IO.println("Final saving =  %.2f bath".formatted(finalSaving));
}