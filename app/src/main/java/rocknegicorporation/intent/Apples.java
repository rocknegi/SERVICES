package rocknegicorporation.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
        Intent intent = new Intent(this,RohitsIntentService.class);
        startService(intent);
    }


    public void onClick(View view){
        Intent i = new Intent(this,Bacon.class);
        final EditText ApplesInput = (EditText) findViewById(R.id.ApplesInput);
        String userMessage = ApplesInput.getText().toString();
        i.putExtra("AppleMessage",userMessage);
        startActivity(i);
    }




}
