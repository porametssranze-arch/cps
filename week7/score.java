void main() {
    IO.print("Enter your midtem score : ");

    int score = Integer.parseInt(IO.readln());

    IO.print("Enter your final score : ");

    int finalscore = Integer.parseInt(IO.readln());

    double Total = score + finalscore;

    if (Total >= 50) {
        IO.println("Your total score is " + Total + ". The result is Pass");
    } else {
        IO.println("Your total score is " + Total + ". The result is Faill");
    }

}