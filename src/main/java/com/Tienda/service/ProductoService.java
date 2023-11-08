package com.Tienda.service;

import com.Tienda.domain.Producto;
import com.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    // retorna una lista de productos (activas o todas)
    public List<Producto> getProducto(boolean activos);

    // retorna una producto por id
    public Producto getProducto(Producto producto);

    //Se inserta un nuevo registro si el id de la producto está vacío
    //Se actualiza el registro si el id de la producto NO está vacío
    public void save(Producto producto);

    public void delete(Producto producto);


}
