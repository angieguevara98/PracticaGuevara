package pe.com.angie.practica.practicaguevara;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.RingtoneManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class DelaitActivity extends AppCompatActivity {

    private Spinner spinner1;
    private String datos;
    private CheckBox checkBox2;
    private CheckBox checkBox;
    private String A = "Americana";
    private String B = "Peperoni";
    private String C = "Hawaiana";
    private String D = "Meat Lover";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delait);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                datos = (String) spinner1.getSelectedItem();


                if( datos.equals(A)){
                    Toast.makeText(DelaitActivity.this, "El costo es de $38.00", Toast.LENGTH_SHORT).show();
                    return;

                }else{
                    if(datos.equals(B)){
                        Toast.makeText(DelaitActivity.this, "El costo es de $42.00", Toast.LENGTH_SHORT).show();
                        return;

                    }else{
                        if (datos.equals(C)){
                            Toast.makeText(DelaitActivity.this, "El costo es de $36.00", Toast.LENGTH_SHORT).show();
                            return;
                        }else{
                            Toast.makeText(DelaitActivity.this, "El costo es de $56.00", Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg) {

            }

        });

    }


     public void simple(View view) {

         checkBox = (CheckBox) findViewById(R.id.checkBox);
         checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

         if (datos.equals(A) && checkBox.isChecked()) {
             int result = 38 + 4;
             AlertDialog alertDialog = new AlertDialog.Builder(this).create();
             alertDialog.setTitle("La venta es: ");
             alertDialog.setMessage("El Tipo de pizza es: " + A + "/n" + "El precio es:  " + result);

             alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                     new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog, int which) {
                             // Alert dialog action goes here
                             dialog.dismiss();// use dismiss to cancel alert dialog
                         }
                     });
             alertDialog.show();

         } else {
             if (datos.equals(A) && checkBox2.isChecked()) {
                 int result = 38 + 8;
                 AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                 alertDialog.setTitle("La venta es: ");
                 alertDialog.setMessage("El Tipo de pizza es: " + A + "/n" + "El precio es:  " + result);

                 alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                         new DialogInterface.OnClickListener() {
                             public void onClick(DialogInterface dialog, int which) {
                                 // Alert dialog action goes here
                                 dialog.dismiss();// use dismiss to cancel alert dialog
                             }
                         });
                 alertDialog.show();
             } else {
                 if (datos.equals(B) && checkBox.isChecked()) {
                     int result = 42 + 4;
                     AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                     alertDialog.setTitle("La venta es: ");
                     alertDialog.setMessage("El Tipo de pizza es: " + B + "/n" + "El precio es:  " + result);

                     alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                             new DialogInterface.OnClickListener() {
                                 public void onClick(DialogInterface dialog, int which) {
                                     // Alert dialog action goes here
                                     dialog.dismiss();// use dismiss to cancel alert dialog
                                 }
                             });
                     alertDialog.show();

                 } else {
                     if (datos.equals(B) && checkBox2.isChecked()) {
                         int result = 42 + 8;
                         AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                         alertDialog.setTitle("La venta es: ");
                         alertDialog.setMessage("El Tipo de pizza es: " + B + "/n" + "El precio es:  " + result);

                         alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                 new DialogInterface.OnClickListener() {
                                     public void onClick(DialogInterface dialog, int which) {
                                         // Alert dialog action goes here
                                         dialog.dismiss();// use dismiss to cancel alert dialog
                                     }
                                 });
                         alertDialog.show();
                     } else {
                         if (datos.equals(C) && checkBox.isChecked()) {
                             int result = 36 + 4;
                             AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                             alertDialog.setTitle("La venta es: ");
                             alertDialog.setMessage("El Tipo de pizza es: " + C + "/n" + "El precio es:  " + result);

                             alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                     new DialogInterface.OnClickListener() {
                                         public void onClick(DialogInterface dialog, int which) {
                                             // Alert dialog action goes here
                                             dialog.dismiss();// use dismiss to cancel alert dialog
                                         }
                                     });
                             alertDialog.show();
                         } else {
                             if (datos.equals(C) && checkBox2.isChecked()) {
                                 int result = 36 + 8;
                                 AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                                 alertDialog.setTitle("La venta es: ");
                                 alertDialog.setMessage("El Tipo de pizza es: " + C + "/n" + "El precio es:  " + result);

                                 alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                         new DialogInterface.OnClickListener() {
                                             public void onClick(DialogInterface dialog, int which) {
                                                 // Alert dialog action goes here
                                                 dialog.dismiss();// use dismiss to cancel alert dialog
                                             }
                                         });
                                 alertDialog.show();
                             } else {
                                 if (datos.equals(D) && checkBox.isChecked()) {
                                     int result = 56 + 4;
                                     AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                                     alertDialog.setTitle("La venta es: ");
                                     alertDialog.setMessage("El Tipo de pizza es: " + D + "/n" + "El precio es:  " + result);

                                     alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                             new DialogInterface.OnClickListener() {
                                                 public void onClick(DialogInterface dialog, int which) {
                                                     // Alert dialog action goes here
                                                     dialog.dismiss();// use dismiss to cancel alert dialog
                                                 }
                                             });
                                     alertDialog.show();
                                 } else {
                                     if (datos.equals(D) && checkBox2.isChecked()) {
                                         int result = 56 + 8;
                                         AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                                         alertDialog.setTitle("La venta es: ");
                                         alertDialog.setMessage("El Tipo de pizza es: " + D + "/n" + "El precio es:  " + result);

                                         alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                                 new DialogInterface.OnClickListener() {
                                                     public void onClick(DialogInterface dialog, int which) {
                                                         // Alert dialog action goes here
                                                         dialog.dismiss();// use dismiss to cancel alert dialog
                                                     }
                                                 });
                                         alertDialog.show();

                                     }
                                 }
                             }
                         }
                     }
                 }
             }
         }


        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);

        // Notification
        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle("Mensaje de Envio")
                .setContentText("Tu pedido está en camino")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setColor(ContextCompat.getColor(this, R.color.colorPrimary))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();

        // Notification manager
        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);

    }

}






