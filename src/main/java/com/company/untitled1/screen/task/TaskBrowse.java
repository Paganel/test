package com.company.untitled1.screen.task;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Task;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}