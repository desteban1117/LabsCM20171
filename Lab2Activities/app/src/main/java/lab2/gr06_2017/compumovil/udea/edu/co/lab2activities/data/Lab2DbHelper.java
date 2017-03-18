package lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lis on 18/03/17.
 */

public class Lab2DbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "lab2.db";

    public Lab2DbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE" + UserContract.UserEntry.TABLE_NAME + "("
        + UserContract.UserEntry.ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
        + UserContract.UserEntry.ID + "TEXT NOT NULL,"
        + UserContract.UserEntry.USERNAME + "TEXT NOT NULL"
        + UserContract.UserEntry.PASSWORD + "TEXT NOT NULL,"
        + UserContract.UserEntry.EMAIL + "TEXT NOT NULL,"
        +"UNIQUE ("+ UserContract.UserEntry.ID + "))S");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}


