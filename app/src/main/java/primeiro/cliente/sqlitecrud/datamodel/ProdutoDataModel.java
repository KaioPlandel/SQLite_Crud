package primeiro.cliente.sqlitecrud.datamodel;

public class ProdutoDataModel {

    //atributo nome da tabela
    public static String NOME_TABLE = "produto";

    //atributo com nome dos campos
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String FORNECEDOR = "fornecedor";

    //query para criar a tabela no banco de dados
    public static String queryCriarTabela = "";

    //método para gerar o script e criar a tabela
    public static String criarTabela() {

        queryCriarTabela += "CREATE TABLE " + NOME_TABLE + " (";
        queryCriarTabela += ID + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += NOME + " TEXT, ";
        queryCriarTabela += FORNECEDOR + " TEXT )";

        return queryCriarTabela;

    }


}
