package barryalan.nim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class Main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    // ALLOWS THE TRANSITION BETWEEN TWO ACTIVITIES(PAGES) ON THE APP, + ONE LINE ON THE BUTTON RESPONSIBLE
    public void gotoSelectRowsActivity(View view){
        Intent transition1 = new Intent(this, selectRowsActivity.class);
        startActivity(transition1);
    }
}
