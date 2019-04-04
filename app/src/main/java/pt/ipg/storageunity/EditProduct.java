package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EditProduct extends AppCompatActivity {


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_product);

        button = (Button) findViewById(R.id.deleteProd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(EditProduct.this,getString(R.string.CancelOperation),Toast.LENGTH_LONG).show();
            }


        });
        button = (Button) findViewById(R.id.SaveNew);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(EditProduct.this,getString(R.string.ProductSave),Toast.LENGTH_LONG).show();
            }
        });
    }




}