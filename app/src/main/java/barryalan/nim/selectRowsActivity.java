package barryalan.nim;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static barryalan.nim.R.id.button4;

public class selectRowsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_rows);
    }

    //sends the view to the next activity and sets the string for the confirmation page
    public void gotoWhoGoesFirstActivity(View view){
        Intent Transition2 = new Intent(this, whoGoesFirst.class);
        startActivity(Transition2);
    }
}
