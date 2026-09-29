# Modern To-Do List

## Description

A Kotlin Android application that allows users to create, complete, and delete tasks. The application uses Jetpack Compose for the user interface and Room Database for persistent data storage.

## Technologies
- Kotlin
- Jetpack Compose
- Material 3
- Room Database
- Kotlin Coroutines
- Flow
- MVVM Architecture
- Repository Pattern

## Features
- Add tasks
- Mark tasks as completed
- Delete tasks
- Save tasks using Room Database
- Tasks remain saved after closing and reopening the application

## Architecture

This application uses the MVVM (Model-View-ViewModel) architecture along with the Repository pattern. Room Database is used for data persistence, while Kotlin Coroutines and Flow are used for asynchronous database operations and observing task changes.

## Project Structure

- `data/Task.kt` - Defines the task data model.
- `data/TaskDao.kt` - Handles Room database operations.
- `data/TaskDatabase.kt` - Creates and manages the Room database.
- `data/TaskRepository.kt` - Provides a layer between the database and ViewModel.
- `viewmodel/TaskViewModel.kt` - Manages application data and user actions.
- `MainActivity.kt` - Contains the Jetpack Compose user interface.

## How to Run

- Clone the repository.
- Open the project in Android Studio.
- Allow Gradle to sync.
- Connect an Android device or start an emulator.
- Run the `app` configuration.

