void main() {
    IO.print("Enter salary : ");
    double salary = Double.parseDouble(IO.readln());
    IO.print("Enter deduction percent : ");
    double percent = Double.parseDouble(IO.readln());
    double deduction = salary * percent /100;
    double netsalary = salary - deduction;

    IO.println("Deduction = %.2f ".formatted(deduction));
    IO.println("Net salary  = %.2f ".formatted(netsalary));
}
