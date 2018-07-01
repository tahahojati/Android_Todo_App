package com.tpourjalali.android.todolist.database;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by mary on 6/30/2018.
 */

@Database(version = 1, entities = {TaskEntry.class}, exportSchema = false)
public abstract class TodoDatabase extends RoomDatabase{
    private static final String TAG = "TodoDatabase";
    private static TodoDatabase sInstance = null;
    private static final String DB_NAME = "todo_database";

    synchronized public static TodoDatabase getInstance(Context context){
        if (sInstance == null)
            sInstance = Room.databaseBuilder(context.getApplicationContext(), TodoDatabase.class, DB_NAME)
                    .build();
        return sInstance;
    }

    public abstract TaskDao taskDao();
}
