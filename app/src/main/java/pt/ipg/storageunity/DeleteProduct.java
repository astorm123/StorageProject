package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DeleteProduct extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_product);

        button = (Button) findViewById(R.id.CancelDel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(DeleteProduct.this,getString(R.string.CancelOperation),Toast.LENGTH_LONG).show();
            }


        });
        button = (Button) findViewById(R.id.DeleteProdu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(DeleteProduct.this,"Product Deleted",Toast.LENGTH_LONG).show();
            }
        });
    }
}
