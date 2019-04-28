package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                    EditText Categoria = findViewById(R.id.Categoria);
                    String SaveCategoria = Categoria.getText().toString();
                    if (SaveCategoria.trim().length()==0){
                        Categoria.setError(getString(R.string.Error_Message));
                        Categoria.requestFocus();
                        return;

                    }
                    EditText NameProd = findViewById(R.id.NameProd)   ;
                    String SaveName = NameProd.getText().toString();
                    if (SaveName.trim().length()==0){
                        NameProd.setError(getString(R.string.Error_Message));
                        NameProd.requestFocus();
                        return;
                    }
                    EditText Fornecedor = findViewById(R.id.Fornecedor);
                    String SaveForcenedor = Fornecedor.getText().toString();
                    if (SaveForcenedor.trim().length()==0){
                        Fornecedor.setError(getString(R.string.Error_Message));
                        Fornecedor.requestFocus();
                        return;
                    }
                    EditText Sector = findViewById(R.id.Sector);
                    String SaveSector = Sector.getText().toString();
                    if (SaveSector.trim().length()==0){
                        Sector.setError(getString(R.string.Error_Message));
                        Sector.requestFocus();
                        return;
                    }
                finish();
                Toast.makeText(DeleteProduct.this,"Product Deleted",Toast.LENGTH_LONG).show();
            }
        });
    }
}
