package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Produtos extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        button = (Button) findViewById(R.id.AddProd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProdutos();
            }
        });
        button = (Button) findViewById(R.id.EditProd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEdit();
            }
        });

        button = findViewById(R.id.DeleteProd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeleteP();
            }
        });

    }

    public void openProdutos() {

        Intent intent = new Intent(this, CreateNewProd.class);
        startActivity(intent);

    }

    public void openEdit(){

        Intent intent = new Intent(this, EditProduct.class);
        startActivity(intent);
    }

    public void openDeleteP(){

        Intent intent = new Intent(this,DeleteProduct.class);
        startActivity(intent);
    }

}
