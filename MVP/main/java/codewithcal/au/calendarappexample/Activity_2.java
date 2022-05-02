package codewithcal.au.calendarappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button btnDeadline = (Button) findViewById(R.id.btnDeadline);
        View.OnClickListener oclBtnDeadline = new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity_2.this, MainActivity.class);
                startActivity(intent);

            }
        };
        btnDeadline.setOnClickListener(oclBtnDeadline);

        Button btnTimer = (Button) findViewById(R.id.btnTimer);
        View.OnClickListener oclBtnTimer = new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity_2.this, Activity_3.class);
                startActivity(intent);

            }
        };
        btnTimer.setOnClickListener(oclBtnTimer);


    }
}