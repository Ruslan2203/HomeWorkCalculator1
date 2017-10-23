package singletonDataBase;

public class StatisticsKeeper {
    private static StatisticsKeeper ourInstance = new StatisticsKeeper();

    public static StatisticsKeeper getInstance() {
        return ourInstance;
    }

    private StatisticsKeeper() {
    }
}
