package lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.data;

import android.provider.BaseColumns;

/**
 * Created by lis on 18/03/17.
 */

public class UserContract {

    public static abstract class UserEntry implements BaseColumns{
        public static final String TABLE_NAME = "users";

        public static final String ID = "id";
        public static final String USERNAME = "username";
        public static final String PASSWORD = "password";
        public static final String EMAIL = "email";
    }
}
