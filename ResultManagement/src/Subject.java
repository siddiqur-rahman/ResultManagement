
public class Subject {
    private String name;
    private int totalMarks;
    private int passMarks;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    public int getPassMarks() {
        return passMarks;
    }
    public void setPassMarks(int passMarks) {
        this.passMarks = passMarks;
    }
    @Override
    public String toString() {
        return "Subject [name=" + name + ", totalMarks=" + totalMarks
                + ", passMarks=" + passMarks + "]";
    }
}
