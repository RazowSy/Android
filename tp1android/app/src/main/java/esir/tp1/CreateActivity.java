package esir.tp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        Log.i("create", "coucou");
        setResult(Activity.RESULT_OK);

    }
    public void onClick(View v){
        Log.i("create", "bouton cliqué");
        Toast toast= Toast.makeText(getApplicationContext(),"livre ajouté",Toast.LENGTH_LONG);
        toast.show();
        Intent data = new Intent(this, ListActivity.class);
        EditText titre=findViewById(R.id.editname);
        data.putExtra("author",titre.getText().toString());
        setResult(RESULT_OK,data);
        finish();
    }

}
