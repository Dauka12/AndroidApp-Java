package codewithcal.au.calendarappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Activity_3 extends AppCompatActivity {
    public TextView tv;
    public ProgressBar pb;
    public Button btnStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        tv = findViewById(R.id.tv);
        pb = findViewById(R.id.pb);
        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(1440000, 1000) {
                    @Override
                    public void onTick(long l) {
                        tv.setText(""+l/1000);
                        pb.setProgress((int) (l/1000));
                    }

                    @Override
                    public void onFinish() {
                        tv.setText("-");

                    }
                }.start();

            }
        });


        Button btnDeadline = (Button) findViewById(R.id.btnDeadline);
        View.OnClickListener oclBtnDeadline = new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity_3.this, MainActivity.class);
                startActivity(intent);

            }
        };
        btnDeadline.setOnClickListener(oclBtnDeadline);

        Button btnPomodoroTech = (Button) findViewById(R.id.btnPomodoroTech);
        View.OnClickListener oclBtnPomodoroTech = new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity_3.this, Activity_2.class);
                startActivity(intent);

            }
        };
        btnPomodoroTech.setOnClickListener(oclBtnPomodoroTech);
    }
}