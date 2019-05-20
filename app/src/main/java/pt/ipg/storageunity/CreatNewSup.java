package pt.ipg.storageunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreatNewSup extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_new_sup);

        button = (Button) findViewById(R.id.Cancel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(CreatNewSup.this,getString(R.string.CancelOperation),Toast.LENGTH_LONG).show();
            }
        });

        button = (Button) findViewById(R.id.Save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Company = findViewById(R.id.Company);
                String SaveCompany = Company.getText().toString();
                if (SaveCompany.trim().length()==0){
                    Company.setError(getString(R.string.Error_Message));
                    Company.requestFocus();
                    return;

                }
                EditText Email = findViewById(R.id.Email)   ;
                String SaveName = Email.getText().toString();
                if (SaveName.trim().length()==0){
                    Email.setError(getString(R.string.Error_Message));
                    Email.requestFocus();
                    return;
                }
                EditText Contact = findViewById(R.id.Contact);
                String SaveForcenedor = Contact.getText().toString();
                if (SaveForcenedor.trim().length()==0){
                    Contact.setError(getString(R.string.Error_Message));
                    Contact.requestFocus();
                    return;
                }

                finish();
                Toast.makeText(CreatNewSup.this,"New Supplier Created",Toast.LENGTH_LONG).show();
            }
        });

    }
    }

