package mvc.model;

public class Student {
    private int id;
    private String name;
    private boolean attendedClass;

    public Student(int id, String name, boolean attendedClass) {
        this.id = id;
        this.name = name;
        this.attendedClass = attendedClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAttendedClass() {
        return attendedClass;
    }

    public void setAttendedClass(boolean attendedClass) {
        this.attendedClass = attendedClass;
    }

    @Override // annotation
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attendedClass=" + attendedClass +
                '}';
    }

    // following are examples of overloading
    // with parameter like integer
    public String toString(int h){
        return ""+h;
    }
    // with parameter like String
    public int toString(String huge){
        return 0;
    }

}
