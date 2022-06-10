package com.company.untitled1.screen.project;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}