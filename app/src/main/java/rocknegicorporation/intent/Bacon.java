package rocknegicorporation.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle ApplesData = getIntent().getExtras();
        if (ApplesData==null)
            return;

        String ApplesMessage = ApplesData.getString("ApplesMessage");
        final TextView BaconText = (TextView) findViewById(R.id.BaconText);
        BaconText.setText(ApplesMessage);
    }



    public void onClick(View view) {
        Intent i = new Intent(this, Apples.class);

        startActivity(i);
    }
}