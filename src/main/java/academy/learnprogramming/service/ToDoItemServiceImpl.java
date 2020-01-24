package academy.learnprogramming.service;

import academy.learnprogramming.model.ToDoData;
import academy.learnprogramming.model.ToDoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {

    // == fields ==
    @Getter
    private final ToDoData data = new ToDoData();

    // == public methods ==
    @Override
    public void addItem(ToDoItem item) {
        data.addItem(item);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(ToDoItem item) {
        data.updateItem(item);
    }

}
