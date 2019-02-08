package mx.tec.example2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    TextView myTextView;
    Intent currentIntent;
    String myIntentVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        currentIntent = getIntent();

        myIntentVar = currentIntent.getStringExtra("valueToSend");
        int myIntExtra = currentIntent.getIntExtra("myInteger", 0);


        myTextView = findViewById(R.id.my_text);
        myTextView.setText(myIntentVar);

    }
}
