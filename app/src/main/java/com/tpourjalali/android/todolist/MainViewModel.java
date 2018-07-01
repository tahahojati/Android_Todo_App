package com.tpourjalali.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.tpourjalali.android.todolist.database.TaskEntry;
import com.tpourjalali.android.todolist.database.TodoDatabase;

import java.util.List;

/**
 * Created by mary on 6/30/2018.
 */

public class MainViewModel extends AndroidViewModel {
    private LiveData<List<TaskEntry>> tasks;
    public MainViewModel(@NonNull Application application) {
        super(application);
        tasks = TodoDatabase.getInstance(getApplication()).taskDao().loadAllTasks();
    }

    public LiveData<List<TaskEntry>> getTasks() {
        return tasks;
    }
}
