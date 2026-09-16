package Lec10_AbstractAndInterface.Assignment8.PrintableInterface;

public class Report implements Printable {

    private String title;

    public Report() {
    }

    public Report(String t) {
        this.title = t;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Printing report: " + getTitle());
    }
}
