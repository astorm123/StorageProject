package pt.ipg.storageunity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonLista;
    private Button buttonSupplier;
    private Button buttonSector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        buttonLista = (Button) findViewById(R.id.buttonLista);
        buttonLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProdutos();
            }
        });


        buttonSector = (Button) findViewById(R.id.buttonSector);
        buttonSector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSector();
            }
        });

      /*  buttonSupplier = findViewById(R.id.buttonFornecedor);
        buttonSupplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFornecedores();
            }
        });

*/

    }

    public void openProdutos(){

        Intent intent = new Intent(this,Produtos.class);
        startActivity(intent);
    }




    public void openSector(){
        Intent intent = new Intent(this,Sector.class);
        startActivity(intent);
    }

    /*public void openFornecedores(){
        Intent intent = new Intent(this,Fornecedores.class);
        startActivity(intent);
    }
*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void toast1(View view) {
        Toast.makeText(MainActivity.this,"Campo nao preenchido",Toast.LENGTH_LONG).show();
    }
}
