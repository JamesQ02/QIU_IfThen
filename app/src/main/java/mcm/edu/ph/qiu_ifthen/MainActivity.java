package mcm.edu.ph.qiu_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView story = findViewById(R.id.txtstory);
        TextView result = findViewById(R.id.txtresult);

        Button decision1 = findViewById(R.id.btndec1);
        Button decision2 = findViewById(R.id.btndec2);
        decision1.setOnClickListener((View.OnClickListener) this);
        decision2.setOnClickListener((View.OnClickListener) this);

        story.setText(
                "You were awaken in your deep slumber. You don't why but you felt you are being watched."
        );

        result.setText(
                "You hear a growling sound on the foot of your bed. Should you close your eyes? \n \n" +
                        "Decision 1: Close your eyes. \n" +
                        "Decision 2: Call out."
        );


    }

    public void onClick(View view){

        TextView result = findViewById(R.id.txtresult);
        TextView story = findViewById(R.id.txtstory);

        if(view.getId() == R.id.btndec1){
            story.setText("You close your eyes and slowly drift off to sleep");
            result.setText("You never knew what or who made the growling noise last night");
        }
        else if (view.getId() == R.id.btndec2){
            story.setText("Who's there");
            result.setText("Nothing happen, so you went back to sleep but next day, You felt like you're being watched.");

        }
    }


}