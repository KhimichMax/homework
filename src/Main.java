import Manager.*;
import TodoList.Epic;
import TodoList.Subtask;
import TodoList.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Task task1 = new Task("Задание1", Status.NEW, "Описание");
        Task task2 = new Task("Задание2", Status.IN_PROGRESS, "Описание");
        Epic epic1 = new Epic("Эпик1", Status.NEW);
        Epic epic2 = new Epic("Эпик2", Status.NEW);
        Subtask subtask1 = new Subtask("Подзадача1", epic1);
        Subtask subtask1_2 = new Subtask("Подзадача2", epic1);
        Subtask subtask2 = new Subtask("Подзадача3", epic2);

        manager.addMainTask(task1);
        manager.addMainTask(task2);
        manager.addMainTask(epic1);
        manager.addMainTask(epic2);
        manager.addSubtask(epic1, subtask1);
        manager.addSubtask(epic1,subtask1_2);
        manager.addSubtask(epic2,subtask2);


        for (Map.Entry<Integer, Task> entry : manager.getAllTask().entrySet()) {
            System.out.println(entry.getValue().getName() + " " + entry.getValue().getStatus());
            if (entry.getValue() instanceof Epic) {
                System.out.println(manager.getSubtask((Epic) entry.getValue(), 6));
            }
        }
    }

}
