package Khanban;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {
    String name;
    int number;
    String description;
    String developerDetails;
    int duration;
    String taskId;
    String taskStatus;
    public Task(String name, int number, String description, String developerDetails, int duration, String taskStatus)
    {
        this.name = name;
        this.number = number;
        this.description = description;
        this.developerDetails = developerDetails;
        this.duration = duration;
        this.taskId = createTaskID(name, number, developerDetails);
        this.taskStatus = taskStatus;
    }

    public String getTaskStatus()
    {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus)
    {
        this.taskStatus = taskStatus;
    }

    public String printTaskDetails()
    {
        return "Task status: \t" + taskStatus +
                "\n Developer details: \t" + developerDetails +
                "\n Task number: \t" + number +
                "\n Task name: \t" + name +
                "\n Task description: \t" + description +
                "\n Task ID: \t" + taskId +
                "\n totalHours: " + duration + " hours";
    }
    public static String createTaskID(String name, int number, String developerDetails)
    {
        String developerName = developerDetails.substring(0,developerDetails.indexOf(" "));
        return (name.substring(0,2) + ":"  + number + ":" + developerName.substring(developerName.length()-3)).toUpperCase();
    }

    public static int returnTotalHours(Task[] tasks)
    {
        int totalHours = 0;

        for (var task : tasks)
        {
            totalHours = totalHours + task.duration;
        }
        return totalHours;
    }
    public static boolean checkTaskDescription(String description)
    {
        if (description.length() < 50) return true;
        else return false;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDeveloperDetails()
    {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails)
    {
        this.developerDetails = developerDetails;
    }

    public long getDuration()
    {
        return duration;
    }

    public void setDuration(int totalHours)
    {
        this.duration = totalHours;
    }

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }


}
