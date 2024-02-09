package duke.tasks;

/**
 * This class represents a task without a deadline.
 */
public class ToDo extends Task {
    public ToDo(String description) {
        super(description, "[T]");
    }

    @Override
    public String getTimeData() {
        return "";
    }

    @Override
    public String getLogRepresentation() {
        String completeStatus = "F";
        if (this.isDone) {
            completeStatus = "T";
        }
        return "T" + "," + completeStatus + "," + this.description;
    }

    @Override
    public String getFullStatus() {
        return this.getStatusIcon() + " " + this.getDescription();
    }
}
