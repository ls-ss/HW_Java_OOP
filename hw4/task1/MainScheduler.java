package hw4.task1;

import com.google.gson.reflect.TypeToken;
import hw4.task1.model.Author;
import hw4.task1.model.enums.Priority;
import hw4.task1.model.Task;
import hw4.task1.model.enums.Position;
import hw4.task1.service.FileOperation;
import hw4.task1.service.FileService;
import hw4.task1.service.TaskOperation;
import hw4.task1.service.TaskService;

import java.util.Date;
import java.util.List;

/**
 * Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
 * Файлы хранятся в пакете storage
 */
public class MainScheduler {
    public static void main(String[] args) {
        String path = "hw4/task1/storage/";
        FileService fileOperation = new FileOperation();
        TaskService taskService = new TaskOperation();

        Author alla = new Author("Алла", "Алова", Position.БУХГАЛТЕР);
        Author tolya = new Author("Толя", "Толин", Position.ДИРЕКТОР);
        Author mike = new Author("Миша", "Мишин", Position.ИНЖЕНЕР);
        Author ket = new Author("Катя", "Катина", Position.СЕКРЕТАРЬ);
        Author masha = new Author("Маша", "Машова", Position.ИНЖЕНЕР);

        Task task1 = new Task(1, "Приоритет Integer", 4, "2023-02-01", "08:00", tolya);
        Task task2 = new Task(2, "Приоритет String", "низкий", "2023-02-23", "11:15", alla);
        Task task3 = new Task(3, "Приоритет Double", 0.2, "2023-02-11", "16:45", mike);
        Task task4 = new Task(4, "Приоритет Upper String", "ВВЫСОКИЙ", "2023-01-30", "10:00", ket);
        Task task5 = new Task(5, "Приоритет Priority", Priority.ВЫСОКИЙ, "2023-02-01", "17:00", ket);
        Task task6 = new Task(6, "Приоритет другого типа", new Date(), "2023-02-01", "11:00", masha);
        Task task7 = new Task(7, "Приоритет name", Priority.НИЗКИЙ.name(), "2023-02-04", "08:00", alla);
        Task task8 = new Task(8, "Приоритет empty String", "", "2023-02-03", "77:00", masha);
        Task task9 = new Task(9, "Приоритет String", "НИЗКИЙ", "2023-02-02", "14:25", mike);
        Task task10 = new Task(10, "Приоритет Long", 1L, "2023-02-01", "17:45", tolya);

        List<Task> list = List.of(task1, task2, task3, task4, task5, task6, task7, task8, task9, task10);

        fileOperation.saveToFile(list, path+"list.json");
        fileOperation.saveToFile(task1, path+"task.json");
        fileOperation.saveToFile(alla, path+"author.json");

        Task taskFromFile = fileOperation.readFromFile(path+"task.json", Task.class);
        Author authorFromFile = fileOperation.readFromFile(path+"author.json", Author.class);
        List<Task> listFromFile = fileOperation.readFromFile(path+"list.json", new TypeToken<List<Task>>() {
        }.getType());

        for (Task task : listFromFile) {
            System.out.println(task);
        }

        System.out.println();
        taskService.printTasksList(listFromFile);
    }
}
