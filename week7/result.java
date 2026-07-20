void main() {
    IO.print("Enter number 1 :");
    int number1 = Integer.parseInt(IO.readln());

    IO.print("Enter number 2 :");
    int number2 = Integer.parseInt(IO.readln());

    int result;

    if (number1 > number2) {
        result = number1 - number2;
    } else {

        result = number1 + number2;
    }
    IO.println("Result = " + result);
}