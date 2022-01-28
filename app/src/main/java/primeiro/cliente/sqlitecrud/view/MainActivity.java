package primeiro.cliente.sqlitecrud.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import primeiro.cliente.sqlitecrud.R;
import primeiro.cliente.sqlitecrud.controller.ClienteController;
import primeiro.cliente.sqlitecrud.controller.ProdutoController;

public class MainActivity extends AppCompatActivity {

    ClienteController controllerCliente;
    ProdutoController produtoController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controllerCliente = new ClienteController(getApplicationContext());
        produtoController = new ProdutoController(getApplicationContext());



    }
}