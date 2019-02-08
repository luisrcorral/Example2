package mx.tec.example2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnNewAct;
    EditText myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewAct = findViewById(R.id.my_button);
        myName = findViewById(R.id.my_Text);

        btnNewAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, TargetActivity.class);

                String nameToSend = myName.getText().toString();
                myIntent.putExtra("stringToSend", nameToSend);
                myIntent.putExtra("myInteger", 2);



                startActivity(myIntent);



            }
        });

    }
}