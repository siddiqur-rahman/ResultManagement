
public class App {
    private Student[] student;
    int totalStudent;
    public App(){
    	totalStudent=30;
    	student=new Student[this.totalStudent];
    }
    
    public App(int totalStudent){
    	this.totalStudent=totalStudent;
    	student=new Student[this.totalStudent];
    }
    
    public void displayAllStudent(){
    	for(Student s:this.student){
    		System.out.println(s);
    	}
    }
	public static void main(String[] args) {
		System.out.println("Hello world");
	}

}
