void main() {
    IO.print("Enter (THB) : ");
    double selerd = Double.parseDouble(IO.readln());

    double tex = selerd * 0.10;

    IO.println("tex = %.2f ".formatted(tex));
}