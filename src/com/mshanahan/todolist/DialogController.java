package com.mshanahan.todolist;

import com.mshanahan.todolist.datamodel.TodoData;
import com.mshanahan.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

/**
 * Created by Matt on 7/1/2017.
 */
public class DialogController {

    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadLinePicker;

    public TodoItem processResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadLinePicker.getValue();

        TodoItem item = new TodoItem(shortDescription,
                details, deadlineValue);
        TodoData.getInstance().addTodoItem(item);
        return item;
    }
}
