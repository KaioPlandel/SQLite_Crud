package primeiro.cliente.sqlitecrud.controller;


import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import primeiro.cliente.sqlitecrud.api.AppUtil;
import primeiro.cliente.sqlitecrud.datamodel.ClienteDataModel;
import primeiro.cliente.sqlitecrud.datasource.AppDataBase;
import primeiro.cliente.sqlitecrud.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues contentValues;

    public ClienteController(@Nullable Context context) {
        super(context);

        Log.i(AppUtil.TAG, "Conectado");
    }

    @Override
    public boolean incluir(Cliente obj) {
        contentValues = new ContentValues();

        contentValues.put(ClienteDataModel.NOME,obj.getNome());
        contentValues.put(ClienteDataModel.EMAIL,obj.getEmail());

        return insert(ClienteDataModel.Nome_Table,contentValues);
    }

    @Override
    public boolean alterar(Cliente obj) {

        contentValues = new ContentValues();

        contentValues.put(ClienteDataModel.ID,obj.getId());
        contentValues.put(ClienteDataModel.NOME,obj.getNome());
        contentValues.put(ClienteDataModel.EMAIL,obj.getEmail());

        return true;
    }

    @Override
    public boolean deletar(Cliente obj) {

        contentValues = new ContentValues();

        contentValues.put(ClienteDataModel.ID,obj.getId());

        return true;
    }

    @Override
    public List<Cliente>  listar() {

        List<Cliente> listaClientes = new ArrayList<>();

        return listaClientes;
    }
}
