package com.tpourjalali.android.todolist;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.tpourjalali.android.todolist.database.TodoDatabase;

/**
 * Created by mary on 6/30/2018.
 */

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final TodoDatabase mDb;
    private final int mTaskId;

    public AddTaskViewModelFactory(TodoDatabase database, int taskId){
        mDb = database;
        mTaskId = taskId;

    }
    public <T extends ViewModel> T create(Class<T> modelClass){
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }
}
