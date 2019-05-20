package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                EditText Categoria = findViewById(R.id.ButtonCategory);
                String SaveCategoria = Categoria.getText().toString();
                if (SaveCategoria.trim().length()==0){
                    Categoria.setError(getString(R.string.Error_Message));
                    Categoria.requestFocus();
                    return;

                }
                EditText NameProd = findViewById(R.id.buttonProd)   ;
                String SaveName = NameProd.getText().toString();
                if (SaveName.trim().length()==0){
                    NameProd.setError(getString(R.string.Error_Message));
                    NameProd.requestFocus();
                    return;
                }
                EditText Fornecedor = findViewById(R.id.buttonSup);
                String SaveForcenedor = Fornecedor.getText().toString();
                if (SaveForcenedor.trim().length()==0){
                    Fornecedor.setError(getString(R.string.Error_Message));
                    Fornecedor.requestFocus();
                    return;
                }
                EditText Sector = findViewById(R.id.buttonSector);
                String SaveSector = Sector.getText().toString();
                if (SaveSector.trim().length()==0){
                    Sector.setError(getString(R.string.Error_Message));
                    Sector.requestFocus();
                    return;
                }
                finish();
                Toast.makeText(EditProduct.this,getString(R.string.ProductSave),Toast.LENGTH_LONG).show();
            }
        });
    }




}
