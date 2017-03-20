package lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lis on 18/03/17.
 */

public class Lab2DbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "lab2.db";
    public static final String TABLE_NAME = "users";
    public static final String ID = "id";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String EMAIL = "email";
    private SQLiteDatabase db;

    public Lab2DbHelper(Context context){

        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " ("
        + ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
        + USERNAME + " TEXT,"
        + PASSWORD + " TEXT,"
        + EMAIL + " TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void mockData(SQLiteDatabase sqLiteDatabase){
        mockUser(sqLiteDatabase, new User("desteban1117","123","desteban1117@gmail.com"));
        mockUser(sqLiteDatabase, new User("tati","123","tatiana@gmail.com"));
        mockUser(sqLiteDatabase, new User("james","123","james@gmail.com"));
    }
    public long mockUser(SQLiteDatabase db, User user){
        return  db.insert(TABLE_NAME,null,user.toContentValues());
    }

    public void insterUsr(User user){
        db.insert(TABLE_NAME, null,user.toContentValues());
    }

    public String getUser(String username){
        mockData(db);
        Cursor c = db.rawQuery(" SELECT * FROM users WHERE username = 'desteban1117'", null);
        //Cursor c = db.rawQuery(" SELECT * FROM "+TABLE_NAME+" WHERE username = '" + username+"'", null);
        User user = null;
        String a = "vacio";

        if (c.moveToFirst()) {
            //Recorremos el cursor hasta que no haya más registros
            a = "hay registro";
            do {
                String id = c.getString(c.getColumnIndex(ID));
                String username2 = c.getString(c.getColumnIndex(USERNAME));
                String password = c.getString(c.getColumnIndex(PASSWORD));
                String email = c.getString(c.getColumnIndex(EMAIL));
                user = new User(username2,password,email);
                user.setId(id);

            } while (c.moveToNext());
        }
        return a;
    }
}


