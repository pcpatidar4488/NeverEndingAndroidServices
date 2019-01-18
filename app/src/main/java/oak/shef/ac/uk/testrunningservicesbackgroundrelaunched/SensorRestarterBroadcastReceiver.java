package oak.shef.ac.uk.testrunningservicesbackgroundrelaunched;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SensorRestarterBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            Log.i(SensorRestarterBroadcastReceiver.class.getSimpleName(), "Sensor ResStater BroadcastReceiver");
            context.startService(new Intent(context, SensorService.class));
        }catch (Exception e){
            Log.i("Exeption", e.getMessage());
        }

    }

}
