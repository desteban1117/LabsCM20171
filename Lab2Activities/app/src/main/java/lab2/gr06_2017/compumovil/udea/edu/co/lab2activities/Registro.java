package lab2.gr06_2017.compumovil.udea.edu.co.lab2activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.data.Lab2DbHelper;
import lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.data.User;

public class Registro extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText email;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        btn = (Button) findViewById(R.id.button);
        final Lab2DbHelper dbHelper = new Lab2DbHelper(this);
        //User user= new User(username.getText().toString(),password.getText().toString(),email.getText().toString());
        //User user= new User("david","123","fdsjfhdsjf");
        //dbHelper.insterUsr(user);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user= new User(username.getText().toString(),password.getText().toString(),email.getText().toString());
                dbHelper.insterUsr(user);
                email.setText("Se ha creado");
            }
        });
    }
}
