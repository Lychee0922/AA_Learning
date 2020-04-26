package mvc.model;

import java.util.ArrayList;
import java.util.List;

public class ManageSystem {

    // CRUD
    // create / read / update / delete
    // 增       查      改       删
    private List<Student> studentList;

    public ManageSystem() {

        studentList = new ArrayList<>();

        insert(1, "A", true);
        insert(2, "B", false);
        insert(3, "C", true);
        insert(4, "D", false);
        insert(5, "E", false);

    }

    private void test() {
        Object object = new Object();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void insert(int id, String name, boolean attended) { // create / 增

        studentList.add(new Student(id, name, attended));
    }

    public Student find(int id) { // read / 查
        int index = indexOfStu(id);
        if (index == -1) {
            return null;
        }
        return studentList.get(index);
    }

    public void delete(int id) { // delete / 删
        int index = indexOfStu(id);
        if (index != -1) {
            studentList.remove(index);
        }
    }

    public void updateName(int id, String name, boolean attended) { // update / 改
        int index = indexOfStu(id);
        if (index != -1) {
            studentList.get(index).setName(name);
            studentList.get(index).setAttendedClass(attended);
        }
    }

    private int id_index(int id) {
        int index = -1;
        for (Student s : studentList) {
            if (s.getId() == id) {
                index = studentList.indexOf(s);
            }
        }
        return index;
    }

    private int indexOfStu(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public String allStudents() {
        String info = "";
        for (Student s : studentList) {
            info += s.toString() + "\r\n";
        }
        return info;
    }

    // student 1 , if student 1's id == given id , return true;
    // student 2 , if student 2's id == given id , return true;
    // student 3 , if student 3's id == given id , return true;
    // student 4 , if student 4's id == given id , return true;
    // ...
    // student n , if student n's id == given id , return true;

}
