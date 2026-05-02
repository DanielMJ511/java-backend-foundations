package CompositionCompany;

public class Task {
    private String title;
    private String description;
    private int hoursEstimate;

    public Task(String title, String description, int hoursEstimate) {
        this.title = title;
        this.description = description;
        this.hoursEstimate = hoursEstimate;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getHoursEstimate() { return hoursEstimate; }

    @Override
    public String toString() {
        return title + " (" + hoursEstimate + "h)";
    }
}