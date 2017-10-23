package singletonDataBase;

import java.time.LocalDateTime;

public class StatisticsKeeper {
    private static StatisticsKeeper ourInstance = new StatisticsKeeper();

    public static StatisticsKeeper getInstance() {
        return ourInstance;
    }


    private StatisticsKeeper() {
        System.out.println("inic");
    }

    public  void writer (String messege){

        LocalDateTime timeDate = LocalDateTime.now();
        System.out.println(timeDate+" "+messege);

    }


}
