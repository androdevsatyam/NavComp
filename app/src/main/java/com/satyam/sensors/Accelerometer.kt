package com.satyam.sensors

import android.graphics.Color
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import android.widget.ToggleButton
import com.satyam.navcomp.R

class Accelerometer : AppCompatActivity(), SensorEventListener {

    private val TAG = "Accelerometer"
    lateinit var sensor: SensorManager
    lateinit var square: TextView
    lateinit var toggle: ToggleButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accelerometer)


        square = findViewById(R.id.square)
        toggle = findViewById(R.id.toggle)


        toggle.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
                window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            else
                window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }

        //todo Sensor 1st Step
        sensor = getSystemService(SENSOR_SERVICE) as SensorManager
        sensor.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)?.also {
            sensor.registerListener(
                this,
                it,
                SensorManager.SENSOR_DELAY_FASTEST,
                SensorManager.SENSOR_DELAY_FASTEST
            )
        }
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event?.sensor?.type == Sensor.TYPE_ACCELEROMETER) {
            val side = event.values[0]
            val updown = event.values[1]

            square.apply {
                rotationX = updown * 3f
                rotationY = side * 3f
                rotation = -side
                translationX = side * -10
                translationY = updown * 10
            }

            val color = if (updown.toInt() == 0 && side.toInt() == 0) {
                square.text = "Flat Surface. Great!"
                Color.GREEN
            } else {
                square.text = "x=${updown.toInt()}\ny=${side.toInt()}"
                resources.getColor(R.color.purple_500)
            }
            square.setBackgroundColor(color)
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        Log.d(TAG, "onAccuracyChanged: ")
    }

    override fun onDestroy() {
        sensor.unregisterListener(this)
        super.onDestroy()
    }
}
