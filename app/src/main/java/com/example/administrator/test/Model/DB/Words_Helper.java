package com.example.administrator.test.Model.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017-06-03.
 */

public class Words_Helper extends SQLiteOpenHelper{

    public Words_Helper(Context context){
        super(context, DbSchema.DATABASE_NAME2, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE "+ DbSchema.Words_Table.WORDS_TABLE_NAME
                + "( _id integer primary key autoincrement, "
                + DbSchema.Words_Table.Words_Cols.WORDS_UUID + ", "
                + DbSchema.Words_Table.Words_Cols.WORDS_DATE + ", "
                + DbSchema.Words_Table.Words_Cols.TITLE + ", "
                + DbSchema.Words_Table.Words_Cols.BOOK + ", "
//                + DbSchema.Words_Table.Words_Cols.CHAP + ", "
//                + DbSchema.Words_Table.Words_Cols.PHRASE + ", "
                + DbSchema.Words_Table.Words_Cols.WORDS + ", "
                + DbSchema.Words_Table.Words_Cols.SUMMARY + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }


}
