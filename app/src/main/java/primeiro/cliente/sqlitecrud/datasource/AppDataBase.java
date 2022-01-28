package primeiro.cliente.sqlitecrud.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import androidx.annotation.Nullable;

import primeiro.cliente.sqlitecrud.api.AppUtil;
import primeiro.cliente.sqlitecrud.datamodel.ClienteDataModel;
import primeiro.cliente.sqlitecrud.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_Nome = "AppMinhaIdeia.sqlite";
    public static final int Version = 1;

    SQLiteDatabase db;

    public AppDataBase(@Nullable Context context) {
        super(context, DB_Nome, null, Version);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela());
        Log.i(AppUtil.TAG, "Tabela cliente criada");

        db.execSQL(ProdutoDataModel.criarTabela());
        Log.i(AppUtil.TAG, "Tabela produto criada");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insert(String tabela, ContentValues dados){
        
        boolean retorno = false;



        return false;

    }

}
