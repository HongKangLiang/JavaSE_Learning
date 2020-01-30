package Exam_Test_2018_B1;

import java.util.ArrayList;

public class Log {
    private String name;
    private ArrayList<Activity> activities;

    public Log(String name){
        this.name = name;
        this.activities = new ArrayList<Activity>();
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }
    public Activity bestSpeed(){
        Activity topAct = new Activity();
        double topSpeed = 0;
        for(Activity activity : activities){
            if(activity.averageSpeed() > topSpeed){
                topSpeed = topAct.averageSpeed();
                topAct = activity;
            }
        }
        //测试输出
        System.out.println(topAct.averageSpeed()+"\n" +topAct.getComment());
        return topAct;
    }

}
