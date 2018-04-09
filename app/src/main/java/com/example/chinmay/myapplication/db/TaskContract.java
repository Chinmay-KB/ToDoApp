package com.example.chinmay.myapplication.db;
import android.provider.BaseColumns;
/**
 * Created by Chinmay on 07-03-2018.
 */


public class TaskContract {
    public static final String DB_NAME = "com.example.chinmay.myapplication.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public  static final String COL_TASK_DATE="date";
        public static final String COL_TASK_TIME="time";
        public static final String COL_TASK_TITLE = "title";
    }
}