package Controller.Interfaces;

import Model.Domain.Student;
import java.util.List;

public interface iGetView { // Интерфейс нужен для класса ViewClass
    public void printAllStudent(List<Student> students);
    public String prompt(String msg);
}
