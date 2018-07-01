package com.tpourjalali.android.todolist.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by mary on 6/30/2018.
 */

@Dao
public interface TaskDao {
    @Query(value="SELECT * FROM tasks ORDER BY priority")
    LiveData<List<TaskEntry>> loadAllTasks();

    @Query(value="SELECT * FROM tasks WHERE id = :id")
    LiveData<TaskEntry> loadTaskById(long id);

    @Insert
    long insertTasks(TaskEntry... tasks);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    int updateTasks(TaskEntry... tasks);

    @Delete
    int deleteTasks(TaskEntry... tasks);

}
