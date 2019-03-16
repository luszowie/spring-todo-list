package pl.edu.wszib.todolist.springtodolist.Service;

import pl.edu.wszib.todolist.springtodolist.dto.TodoDTO;
import pl.edu.wszib.todolist.springtodolist.model.Status;
import pl.edu.wszib.todolist.springtodolist.model.Todo;

import java.util.List;

public interface TodoService {

    List<TodoDTO> findAll();
    TodoDTO find (Integer id);
    TodoDTO add(TodoDTO dto);
    TodoDTO update (TodoDTO dto);
    TodoDTO remove (Integer id);

    List<TodoDTO> upcoming();
    int count(Status status);
    List<TodoDTO> search(Status status);


}
