package barryalan.nim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class confirmationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_page);
    }
    public void gotoPlayActivity(View view){
        Intent transition4 = new Intent(this, playActivity.class);
        startActivity(transition4);
    }
}
