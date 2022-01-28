package primeiro.cliente.sqlitecrud.controller;

import java.util.List;

public interface ICrud<T> {

    //Incluir
    public boolean incluir(T obj);

    //alterar
    public boolean alterar(T obj);

    //deletar
    public boolean deletar(T obj);

    //listar
    public List<T> listar();
}
