package com.tpourjalali.android.todolist.database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by mary on 6/30/2018.
 */

public class DateConverter {
    @TypeConverter
    public Long toLong(Date date){
        if(date == null)
            return null;
        return date.getTime();
    }
    @TypeConverter
    public Date toDate (Long timestamp){
        if(timestamp == null)
            return null;
        return new Date(timestamp);
    }
}
