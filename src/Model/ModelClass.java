package Model;

import java.util.List;
import Controller.Interfaces.*;
import Model.Domain.*;

public class ModelClass implements iGetModel {
    private List<Student> students;

    public ModelClass(List<Student> students) {
        this.students = students;
    } // Конструктор

    public List<Student> getAllStudent() {
        return students;
    } // Получение списка

}
