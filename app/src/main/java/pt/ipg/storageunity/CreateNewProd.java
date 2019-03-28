package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateNewProd extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_prod);

        button = (Button) findViewById(R.id.Cancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(CreateNewProd.this,"Operacao Cancelada",Toast.LENGTH_LONG).show();
            }
        });

        button = (Button) findViewById(R.id.Save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText IDprod = findViewById(R.id.IDprod);
                String SaveID = IDprod.getText().toString();

                if (SaveID.trim().length()==0){
                    IDprod.setError(getString(R.string.Error_Message));
                    IDprod.requestFocus();

                }
                EditText Categoria = findViewById(R.id.Categoria);
                String SaveCategoria = Categoria.getText().toString();
                if (SaveCategoria.trim().length()==0){
                    Categoria.setError(getString(R.string.Error_Message));
                    Categoria.requestFocus();

                }
                EditText NameProd = findViewById(R.id.NameProd)   ;
                String SaveName = NameProd.getText().toString();
                if (SaveName.trim().length()==0){
                    NameProd.setError(getString(R.string.Error_Message));
                    NameProd.requestFocus();

                }
                EditText Fornecedor = findViewById(R.id.Fornecedor);
                String SaveForcenedor = Fornecedor.getText().toString();
                if (SaveForcenedor.trim().length()==0){
                    Fornecedor.setError(getString(R.string.Error_Message));
                    Fornecedor.requestFocus();

                }
                EditText Sector = findViewById(R.id.Sector);
                String SaveSector = Sector.getText().toString();
                if (SaveSector.trim().length()==0){
                    Sector.setError(getString(R.string.Error_Message));
                    Sector.requestFocus();
                    return;
                }
                finish();
                Toast.makeText(CreateNewProd.this,"Criado novo Produto",Toast.LENGTH_LONG).show();
            }
        });

    }



}
