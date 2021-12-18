package com.example.reto2.ui.productos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reto2.FormActivity;
import com.example.reto2.R;
import com.example.reto2.adaptadores.ProductosAdapter;
import com.example.reto2.databinding.FragmentProductoBinding;
import com.example.reto2.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductosFragment extends Fragment {

    FragmentProductoBinding binding;
    RecyclerView reciclerView;
    List<Producto> productos;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_producto, container, false);
        productos = new ArrayList<>();
        reciclerView = view.findViewById(R.id.recicle_productos);
        reciclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();
        ProductosAdapter adapter = new ProductosAdapter(productos, getContext());
        reciclerView.setAdapter(adapter);
        return view;

    }

    private void llenarLista() {

        productos.add(new Producto("AREQUIPE DE CAFÉ", "Elaborado con altos estándares " +
                "de calidad y materias primas cuidadosamente seleccionadas.", 17600, R.drawable.arequipe));
        productos.add(new Producto("CAFECITAS", "Deliciosas galletas con café para acompañar momentos con amigos o en familia", 14400, R.drawable.cafecitas));
        productos.add(new Producto("MERMELADA", "Una delicia de sabor y originalidad, " +
                "elaborada con pulpa de fruta 100% natural.", 7200, R.drawable.mermelada));
        productos.add(new Producto("CAFÉ", "Un café afrutado y suave, sin químicos ni pesticidas amigable con el medio ambiente.\n" +
                "\n", 26900, R.drawable.cafe_salento));

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.action_add:
                    intent = new Intent(getContext(), FormActivity.class);
                    intent.putExtra("name","Agregar Productos");
                getActivity().startActivity(intent);
                return true;
            case R.id.action_update:
                    intent = new Intent(getContext(), FormActivity.class);
                    intent.putExtra("name","Actualizar Producto");
                getActivity().startActivity(intent);
                return true;
            case R.id.action_delete:
                    intent = new Intent(getContext(), FormActivity.class);
                    intent.putExtra("name","eliminar Producto");
                getActivity().startActivity(intent);
                return true;

            default:return super.onOptionsItemSelected(item);
        }

    }
}