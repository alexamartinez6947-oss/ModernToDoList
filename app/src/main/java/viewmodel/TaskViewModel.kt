package com.example.moderntodolist.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.moderntodolist.data.Task
import com.example.moderntodolist.data.TaskDatabase
import com.example.moderntodolist.data.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class TaskViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: TaskRepository

    val allTasks: Flow<List<Task>>

    init {
        val database = TaskDatabase.getDatabase(application)
        repository = TaskRepository(database.taskDao())
        allTasks = repository.allTasks
    }

    fun addTask(title: String) {
        if (title.isNotBlank()) {
            viewModelScope.launch {
                repository.insertTask(
                    Task(title = title.trim())
                )
            }
        }
    }

    fun deleteTask(task: Task) {
        viewModelScope.launch {
            repository.deleteTask(task)
        }
    }

    fun toggleTask(task: Task) {
        viewModelScope.launch {
            repository.updateTask(
                task.copy(isCompleted = !task.isCompleted)
            )
        }
    }
}