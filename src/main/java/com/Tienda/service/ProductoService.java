package com.Tienda.service;

import com.Tienda.domain.Producto;
import com.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    // retorna una lista de productos (activas o todas)
    public List<Producto> getProductos(boolean activos);

    // retorna una producto por id
    public Producto getProductos(Producto producto);

    //Se inserta un nuevo registro si el id de la producto está vacío
    //Se actualiza el registro si el id de la producto NO está vacío
    public void save(Producto producto);

    public void delete(Producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
