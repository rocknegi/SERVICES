package rocknegicorporation.intent;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class RohitsIntentService extends IntentService {

    private static final String TAG = "rocknegicorporation.intent";

    public RohitsIntentService() {
        super("RohitsIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //thi what the service does

       Log.i(TAG,"The service has started");
    }
}
