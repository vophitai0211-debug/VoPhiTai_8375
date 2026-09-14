package Lec09_Inheritance.Aggregation.Example;

public class Author {
    private String name;
    private String authorID;

    public Author(String authorID, String name) {
        this.authorID = authorID;
        this.name = name;
    }

    public Author() {
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" + "authorID='" + authorID + '\'' + ", name='" + name + '\'' + '}';
    }
}
