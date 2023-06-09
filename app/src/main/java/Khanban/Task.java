package Khanban;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

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
    String createTaskID(String name, int number, String developerDetails)
    {
        return (name.substring(0,2) + ":"  + number + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();
    }
    public String printTaskDetails() 
    {
        return "Task status: \t" + taskStatus +
                "\n Developer details: \t" + developerDetails +
                "\n Task number: \t" + number +
                "\n Task name: \t" + name +
                "\n Task description: \t" + description +
                "\n Task ID: \t" + taskId +
                "\n Duration: " + duration + " hours";
    }
    int returnDuration(LocalDateTime dateCreated)
    {
        return Math.toIntExact((Duration.between(dateCreated, LocalDateTime.now()).toHours()));
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

    public long getduration()
    {
        return duration;
    }

    public void setduration(int duration)
    {
        this.duration = duration;
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
