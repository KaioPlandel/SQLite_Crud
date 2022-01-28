package primeiro.cliente.sqlitecrud.datamodel;

public class ClienteDataModel {

    //Toda classe dataModel tem esta estrutura

    // 1- Atributo nome da tabela
    public static String Nome_Table = "cliente";

    // 2- atributos com os nomes dos campos
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";

    //3 - Query para criar a tabela no banco de dados
    public static String queryCriarTabela = "";

    //4- método para gerar o Script para criar a tabela
    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE "+Nome_Table+" (";
        queryCriarTabela += ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += NOME+ " TEXT, ";
        queryCriarTabela += EMAIL+ " TEXT )";

        return queryCriarTabela;
    }

}
