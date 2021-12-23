package com.example.reto2.util;

import android.database.Cursor;

import com.example.reto2.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class PruductsRepository {
    public List<Producto> listProduct(Cursor cursor){
        List<Producto> products = new ArrayList<>();
        if(cursor.getCount()==0){
            return products;
        }else{
            while (cursor.moveToNext()){
                Producto producto  = new Producto(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getBlob(4)

                );

                System.out.printf("EL CURSOR VALE"+cursor.getString(3));
                products.add(producto);
            }
            return products;
        }
    }
}
