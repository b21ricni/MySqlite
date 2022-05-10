package com.example.mysqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase database;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(this);
        database = databaseHelper.getWritableDatabase();
        addMountain();

    }

    private void addMountain(){
        ContentValues values = new ContentValues();
        values.put(DatabaseTables.Mountain.COLUMN_NAME_NAME, "Kinnekulle");
        values.put(DatabaseTables.Mountain.COLUMN_NAME_HEIGHT, 352);
        database.insert(DatabaseTables.Mountain.TABLE_NAME, null, values);
    }


}