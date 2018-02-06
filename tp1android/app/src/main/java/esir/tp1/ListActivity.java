package esir.tp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    }
    public void onClick(View v) {
            Intent intent = new Intent(this,CreateActivity.class);
            startActivityForResult(intent,1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.i("create", "résultat récupéré");
        Log.i("create", "titre du livre;"+ data.getStringExtra("author"));
    }
}
