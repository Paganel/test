package com.company.untitled1.screen.project;

import io.jmix.ui.screen.*;
import com.company.untitled1.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}