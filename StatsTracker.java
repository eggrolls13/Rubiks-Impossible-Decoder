import java.util.ArrayList;

public class StatsTracker {
    private int counter;
    private int numSolutions;
    private ArrayList<String> solutions = new ArrayList<>();

    public StatsTracker(int c) {
        counter = c;
    }

    public void increment() {
        counter++;
    }

    public void incrementNumSolutions() {
        numSolutions++;
    }

    public int getCounter() {
        return counter;
    }

    public int getNumSolutions() { return numSolutions; }

    public void addSolution(String s) {
        solutions.add(s);
    }

    public void printSolutions() {
        for (String s : solutions) {
            System.out.println(s);
        }
    }
}
