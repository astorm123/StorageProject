package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fornecedores extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fornecedores);

        button = findViewById(R.id.AddSup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreatSup();
            }
        });

        button = findViewById(R.id.EditSup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditSup();
            }
        });

        button =findViewById(R.id.DeleteSup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeleteSup();
            }
        });
    }

    public void openCreatSup(){
        Intent intent = new Intent(this,CreatNewSup.class);
        startActivity(intent);
    }

    public void openEditSup(){
        Intent intent = new Intent(this,EditSup.class);
        startActivity(intent);
    }

    public void openDeleteSup(){
        Intent intent = new Intent(this,DeleteSup.class);
        startActivity(intent);
    }
}
