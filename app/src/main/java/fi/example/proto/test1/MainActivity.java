package fi.example.proto.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSe = (Button)findViewById(R.id.buttonSecond);
        buttonSe.setOnClickListener(this);
        Button buttonTh = (Button)findViewById(R.id.buttonThird);
        buttonTh.setOnClickListener(this);
        tvMsg=(TextView)findViewById(R.id.tvFirst);
    }

    // Implement the OnClickListener callback
    public void onClick(View v) {
        Button button;
        // do something when the button is clicked
        if (v instanceof Button) {
            button = (Button) v;
            if (button.getId()==R.id.buttonSecond) {
                tvMsg.setText("You press second button!");
            }
            if (button.getId()==R.id.buttonThird) {
                tvMsg.setText("You press third button!");            }
        }
    }
}