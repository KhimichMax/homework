package Manager;

import TodoList.Epic;
import TodoList.Subtask;
import TodoList.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Manager {

    private static int count;

    private HashMap<Integer, Task> collectMainTask = new HashMap<Integer, Task>();


    public HashMap<Integer, Task> getAllTask() {
        return collectMainTask;
    }

    public HashMap<Integer, Task> getAllEpic() {
        HashMap<Integer, Task> collectEpic = new HashMap<>();
        for (Map.Entry<Integer, Task> entryTask : collectMainTask.entrySet()) {
            if (entryTask instanceof Epic) {
                collectEpic.put(entryTask.getKey(), entryTask.getValue());
            }
        }
        return collectEpic;
    }

    public ArrayList<Subtask> getAllSubtask(Epic epic) {
        return epic.getSubtasksList();
    }

    public void removeIndexTask(Integer id) {
        collectMainTask.remove(id);
    }

    public void removeIndexSubtask(Epic epic, Integer id) {
        ArrayList<Subtask> subtasksList = epic.getSubtasksList();

        for (Subtask subtask  : subtasksList) {
            if (subtask.getId() == id) {
                subtasksList.remove(subtask);
            }
        }
    }

    public void removeTask() {
        collectMainTask.clear();
    }

    public void removeSubtask(Epic epic) {
        ArrayList<Subtask> subtasksList = epic.getSubtasksList();
        subtasksList.clear();
    }

    public Task getTask(Integer id) {
        return collectMainTask.get(id);
    }

    public Subtask getSubtask(Epic epic, Integer id) {

        ArrayList<Subtask> subtasksList = epic.getSubtasksList();
        Integer pos = -1;
        for (Subtask sub : subtasksList) {
            if (sub.getId() == id) {
                pos++;
            }
        }
        if (pos > -1) {
            return subtasksList.get(pos);
        }else {
            return null;
        }
    }

    public void addMainTask(Task task) {
        task.setId(count);
        count++;
        collectMainTask.put(task.getId(), task);
    }

    public void addSubtask(Epic epic, Subtask subtask) {
        subtask.setId(count);
        count++;
        epic.setSubtasksList(subtask);
    }

    public void updateTask(Task task) {
        collectMainTask.put(task.getId(), task);
    }

    public void updateSubtask(Epic epic, Subtask subtask) {
        ArrayList<Subtask> subtasksList = epic.getSubtasksList();
        Integer id = subtask.getId();
        Integer pos = 0;
        for (Subtask sub : subtasksList) {
            if (sub.getId() == id) {
                subtasksList.add(pos, subtask);
            }
            pos++;
        }
    }

    public void checkStatus(Epic epic) {
        int mapLength = 0;
        int doneTask = 0;
        ArrayList<Subtask> subtasks = epic.getSubtasksList();

        mapLength =  subtasks.size();

        for (Subtask subT : subtasks) {
            if(subT.getStatus() == Status.DONE) {
                doneTask++;
            }
        }

        if (doneTask == mapLength) {
            epic.setStatus(Status.DONE);
        } else {
            epic.setStatus(Status.IN_PROGRESS);
        }
    }

}
