package onlyoffice.com.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Task {
    public String taskName;
    public String taskDescription;
    public String startDate;
    public String endDate;

    public Task testDataTask(){
        Date date = new Date();
        SimpleDateFormat formatForTextFields = new SimpleDateFormat("yyyy.MM.dd'-'hh:mm:ss");
        SimpleDateFormat formatForDateInputs = new SimpleDateFormat("dd.MM.yyyy");

        this.taskName = "test name " + formatForTextFields.format(date).toString();
        this.taskDescription = "test description for task " + formatForTextFields.format(date).toString();
        this.startDate = formatForDateInputs.format(date);
        this.endDate = formatForDateInputs.format(date);

        return this;
    }

    public String getTaskName(){
        return this.taskName;
    }
}
