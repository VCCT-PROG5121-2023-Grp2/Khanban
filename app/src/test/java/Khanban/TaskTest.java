package Khanban;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest
{
    Task[] tasks;
    public TaskTest()
    {
        //testData
        tasks = new Task[2];
        tasks[0] = new Task("Login Feature", App.getTotalTasks() + 0, "Create Login to authenticate users", "Robyn Harrison",8, "To Do" );
        tasks[1] = new Task("Add Task Feature", App.getTotalTasks() + 1, "Create Add Task feature to add task users", "Mike Smith", 10, "Doing");
    }
    @Test
    void checkTaskDescription()
    {
        for (int i = 0; i < tasks.length; i++)
        {
            System.out.println("checkTaskDescription loop iteration: " + i);
            boolean expResult = true;
            boolean result = Task.checkTaskDescription(tasks[i].description);
            assertEquals(expResult, result);
        }
    }
    @Test
    void createTaskID()
    {
        String[] results = new String[2];

        for (int i = 0; i < tasks.length; i++)
        {
            System.out.println("createTaskID loop iteration: " + i);
            results[i] = Task.createTaskID(tasks[i].getName(), tasks[i].getNumber(),tasks[i].getDeveloperDetails());
        }

        String[] expResults = {"LO:0:BYN", "AD:1:IKE"};
        assertEquals(Arrays.toString(expResults), Arrays.toString(results));
    }
    @Test
    void returnTotalHours()
    {
        System.out.println("Test data for task 1 & 2");
        int result = Task.returnTotalHours(tasks);
        int expResult = 18;
        assertEquals(expResult, result);

        System.out.println("Additional test data");
        ArrayList<Task> additionalDataTasks = new ArrayList<Task>();
        additionalDataTasks.add(0, new Task("test",0,"test","test test",10,""));
        additionalDataTasks.add(1, new Task("test",1,"test","test test",12,""));
        additionalDataTasks.add(2, new Task("test",2,"test","test test",55,""));
        additionalDataTasks.add(3, new Task("test",3,"test","test test",11,""));
        additionalDataTasks.add(4, new Task("test",4,"test","test test",1,""));

        int additionalDataResult = Task.returnTotalHours(additionalDataTasks.toArray(new Task[5]));
        int additionalDataExpResult = 89;
        assertEquals(additionalDataExpResult, additionalDataResult);
    }
}