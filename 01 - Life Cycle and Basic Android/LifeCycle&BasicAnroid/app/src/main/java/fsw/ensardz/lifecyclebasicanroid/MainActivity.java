package fsw.ensardz.lifecyclebasicanroid;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendNotif("onCreate", "La aplicacion se crea");
    }
    @Override
    protected void onStart() {
        super.onStart();
        sendNotif("onStart", "La aplicacion inicia");
    }

    @Override
    protected void onResume() {
        super.onResume();
        sendNotif("onResume", "La aplicacion se resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        sendNotif("onPause", "La aplicacion en pausa");
    }

    @Override
    protected void onStop() {
        super.onStop();
        sendNotif("onStop", "La aplicacion se detiene");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        sendNotif("onRestart", "La aplicacion se reinicia");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sendNotif("onDestroy", "La aplicacion se destruye");
    }

    public void sendNotif(String estado, String mensaje){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
        builder.setSmallIcon(R.mipmap.ic_launcher_round);
        builder.setContentTitle(estado);
        builder.setContentText(mensaje);

        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        manager.notify(1, builder.build());
    }
}
