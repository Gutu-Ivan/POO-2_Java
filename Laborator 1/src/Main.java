import tasks.*;

public class Main {
    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        firstTask.solve();

        SecondTask secondTask = new SecondTask();
        secondTask.solve();

        ThirdTask thirdTask = new ThirdTask();
        thirdTask.solveStringVersion();

        FourthTask fourthTask = new FourthTask();
        fourthTask.solve();

        FifthTask fifthTask = new FifthTask();
        fifthTask.solve();

    }
}