package ghar.dfw.perm.trials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Reciving extends AppCompatActivity {

    private static final String DEFAULT_MESSAGE = "No Message Received";
    private TextView tvReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciving);


        tvReceive = findViewById(R.id.tvReceive);
        Intent receveIntent = getIntent();

        if(receveIntent != null){
            String stringRcvd = receveIntent.getStringExtra("_send");
            if(stringRcvd != null)
                tvReceive.setText(stringRcvd);
        }else {
            tvReceive.setText(DEFAULT_MESSAGE);
        }

    }
}
