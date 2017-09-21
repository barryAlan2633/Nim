package barryalan.nim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class whoGoesFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_goes_first);
    }
    public void gotoConfirmationPage(View view){
        Intent Transition3 = new Intent(this, confirmationPage.class);
        startActivity(Transition3);
    }
}
