package com.example.administrator.test.Model.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

;


public class QT_Helper extends SQLiteOpenHelper {


    public QT_Helper(Context context){
        super(context, DbSchema.DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE "+ DbSchema.QT_Table.QT_TABLE_NAME
                + "( _id integer primary key autoincrement, "
                + DbSchema.QT_Table.QT_Cols.QT_UUID + ", "
                + DbSchema.QT_Table.QT_Cols.QT_DATE + ", "
                + DbSchema.QT_Table.QT_Cols.WEEK + ", "
                + DbSchema.QT_Table.QT_Cols.QT + ", "
                + DbSchema.QT_Table.QT_Cols.THANKS + ", "
                + DbSchema.QT_Table.QT_Cols.PRAYER + ", "
                + DbSchema.QT_Table.QT_Cols.JOURNAL + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }


}
