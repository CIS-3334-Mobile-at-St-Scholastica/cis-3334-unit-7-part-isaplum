package css.cis3334.heartratetracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by krixniemann on 3/3/2017.
 */

public class OtherActivity extends AppCompatActivity {

    TextView textViewDescription;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heart_rate_row);

        textViewDescription = (TextView) findViewById(R.id.textViewPulse);

        Bundle pulses = getIntent().getExtras();
        HeartRate pulse = (HeartRate) pulses.getSerializable("pulses");
        textViewDescription.setText(pulse.toString());
        textViewDescription.setText(pulse.toString());
    }
}
