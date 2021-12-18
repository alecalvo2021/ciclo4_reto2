package com.example.reto2.adaptadores;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reto2.R;
import com.example.reto2.modelo.Producto;

import java.util.List;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder>{

    private final List<Producto> listaProductos;
    private final LayoutInflater inflater;


    public ProductosAdapter(List<Producto> productos, Context context){
        this.inflater=LayoutInflater.from(context);
        this.listaProductos=productos;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.list_producto, null);
        //View view = LayoutInflater.from (parent.getContext()).inflate(R.layout.list_productos, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ProductosAdapter.ViewHolder holder, final int position) {
        holder.bindData(listaProductos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView nombreProducto, descripcionProducto, valorProducto;
        ViewHolder(View view){
            super(view);
            iconImage=view.findViewById(R.id.imgProducto);
            nombreProducto = view.findViewById(R.id.txtNombreProducto);
            descripcionProducto = view.findViewById(R.id.txtDescripcionProducto);
            valorProducto = view.findViewById(R.id.txtValorProducto);

        }

        @SuppressLint("SetTextI18n")
        void bindData(final Producto producto){
            nombreProducto.setText(producto.getNombre());
            descripcionProducto.setText(producto.getDescripcion());
            valorProducto.setText("$ "+producto.getValor());
            iconImage.setImageResource(producto.getImagenId());

        }


    }

}
