package lab2.gr06_2017.compumovil.udea.edu.co.lab2activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.data.Lab2DbHelper;
import lab2.gr06_2017.compumovil.udea.edu.co.lab2activities.data.User;

public class Logueo extends AppCompatActivity {

    TextView registro;
    EditText username;
    EditText password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo);

        registro = (TextView) findViewById(R.id.registro);
        username  = (EditText) findViewById(R.id.username);
        password  = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.button2);
        final Lab2DbHelper db = new Lab2DbHelper(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = db.getUser(username.getText().toString());
                //String name = username.getText().toString();
                //registro.setText(name);
                if(user == null){
                    registro.setText(user);
                }else {
                    registro.setText(user);
                }
            }
        });
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClass(Logueo.this, Registro.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
