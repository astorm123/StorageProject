package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DeleteSup extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_sup);

        button = (Button) findViewById(R.id.DeleteSup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(DeleteSup.this,"Supplier Deleted",Toast.LENGTH_LONG).show();
            }
        });
        
        button = findViewById(R.id.Cancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(DeleteSup.this, "Operation Canceled", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
