package com.tpourjalali.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.tpourjalali.android.todolist.database.TaskEntry;
import com.tpourjalali.android.todolist.database.TodoDatabase;

/**
 * Created by mary on 6/30/2018.
 */

public class AddTaskViewModel extends ViewModel {
    private LiveData<TaskEntry> mTask;

    public  AddTaskViewModel(TodoDatabase database, int taskId){
        mTask = database.taskDao().loadTaskById(taskId);
    }
    public LiveData<TaskEntry> getTask(){
        return mTask;
    }
}
