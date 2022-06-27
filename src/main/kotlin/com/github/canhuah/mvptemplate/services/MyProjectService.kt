package com.github.canhuah.mvptemplate.services

import com.intellij.openapi.project.Project
import com.github.canhuah.mvptemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
