package primeiro.cliente.sqlitecrud.controller;

import android.content.ContentValues;
import android.content.Context;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import primeiro.cliente.sqlitecrud.datamodel.ProdutoDataModel;
import primeiro.cliente.sqlitecrud.datasource.AppDataBase;
import primeiro.cliente.sqlitecrud.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues contentValues;

    public ProdutoController(@Nullable Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {

        contentValues = new ContentValues();

        contentValues.put(ProdutoDataModel.NOME, obj.getNome());
        contentValues.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());

        return insert(ProdutoDataModel.NOME_TABLE,contentValues);
    }

    @Override
    public boolean alterar(Produto obj) {

        contentValues = new ContentValues();

        contentValues.put(ProdutoDataModel.ID,obj.getId());
        contentValues.put(ProdutoDataModel.NOME,obj.getNome());
        contentValues.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());


        return true;
    }

    @Override
    public boolean deletar(Produto obj) {

        contentValues = new ContentValues();

        contentValues.put(ProdutoDataModel.ID, obj.getId());

        return true;
    }

    @Override
    public List<Produto> listar() {

        List<Produto> listaProdutos = new ArrayList<>();

        return listaProdutos;
    }
}
