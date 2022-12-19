package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        for (int j = 1; j <= 10; j++) {
            System.out.println(j + " x " + numberTableToPrint + " = " + j * numberTableToPrint);
        }
    }
}
