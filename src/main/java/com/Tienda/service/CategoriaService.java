package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    
   // retorna una lista de categorias (activas o todas)
    public List<Categoria> getCategorias(boolean activos);
    
    // retorna una categoria por id
    public Categoria getCategoria(Categoria categoria);
    
    //Se inserta un nuevo registro si el id de la categoria está vacío
    //Se actualiza el registro si el id de la categoria NO está vacío
    public void save (Categoria categoria);
    
    public void delete(Categoria categoria);
    
    
    
}
