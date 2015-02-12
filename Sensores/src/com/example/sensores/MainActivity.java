package com.example.sensores;

import java.util.List;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView salida;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        salida = (TextView) findViewById(R.id.salida);
        SensorManager sensorManager = (SensorManager) 
                                                        getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores = sensorManager. 
                                                        getSensorList(Sensor.TYPE_ALL);
        for(Sensor sensor: listaSensores) {
             log(sensor.getName());
        }
    }
   private void log(String string) {
          salida.append(string + "\n");
   }
}
