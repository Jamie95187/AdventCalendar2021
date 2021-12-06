
public class Main {

    public static void main(String[] args) {
        dayTwoSolver();
    }

    private static void dayOneSolver() {
        DayOne dayOne = new DayOne();
        dayOne.readFile();
//        dayOne.solver();
        dayOne.solverTwo();
    }

    private static void dayTwoSolver() {
        DayTwo dayTwo = new DayTwo();
        dayTwo.readFile();
        dayTwo.solver();
        dayTwo.solverTwo();
    }

}
