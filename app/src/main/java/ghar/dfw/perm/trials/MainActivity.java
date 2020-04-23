package ghar.dfw.perm.trials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView tvHello;
    private TextView tvBye;

    Bundle bundle;
    Intent intent;


    // TODO 2: Two text fields
    // TODO 3:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = findViewById(R.id.tvHello);
        tvBye = findViewById(R.id.tvBye);
        tvHello.setText(R.string.hello_Text_);

        bundle = new Bundle();

    }

    public void sendData(View view) {

        if(tvHello.getText() != null){

            intent = new Intent(this, Reciving.class);

            String inputFromHello = tvHello.getText().toString();
            bundle.putString("_send", inputFromHello);
            intent.putExtras(bundle);


//            intent.putExtra("toSend", inputFromHello);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "sorry, no oen is saying hello",  Toast.LENGTH_SHORT).show();

        }
    }
}
