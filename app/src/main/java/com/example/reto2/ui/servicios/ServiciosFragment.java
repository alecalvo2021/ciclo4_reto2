package com.example.reto2.ui.servicios;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reto2.FormActivity;
import com.example.reto2.R;
import com.example.reto2.adaptadores.ProductosAdapter;
import com.example.reto2.adaptadores.ServiciosAdapter;
import com.example.reto2.databinding.FragmentServiciosBinding;
import com.example.reto2.datos.DBHelper;
import com.example.reto2.modelo.Producto;
import com.example.reto2.modelo.Servicio;
import com.example.reto2.util.PruductsRepository;
import com.example.reto2.util.ServiceRepository;

import java.util.ArrayList;
import java.util.List;

public class ServiciosFragment extends Fragment {
    RecyclerView reciclerView;
    List<Servicio> servicios;
    FragmentServiciosBinding binding;
    private DBHelper dbHelper;
    private  List<Producto> productos;
    private String TABLE_NAME="SERVICES";
    private ServiceRepository serviceRepository;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_servicios, container, false);
        try{
            dbHelper = new DBHelper(getContext());
            Cursor cursor = dbHelper.getData(TABLE_NAME);
            serviceRepository = new ServiceRepository();

            servicios = serviceRepository.listService(cursor);

            reciclerView = view.findViewById(R.id.recicler_servicios);
            reciclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            ServiciosAdapter adapter = new ServiciosAdapter(servicios, getContext());
            reciclerView.setAdapter(adapter);


        }catch (Exception e){
            System.out.println("Esto es lo que psas =>"+ e.toString());
            Toast.makeText(getContext(),e.toString(),Toast.LENGTH_SHORT).show();
        }
        return view;

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
                intent.putExtra("name",TABLE_NAME);
                getActivity().startActivity(intent);
                return true;
            case R.id.action_update:
                intent = new Intent(getContext(), FormActivity.class);
                intent.putExtra("name",TABLE_NAME);
                getActivity().startActivity(intent);
                return true;
            case R.id.action_delete:
                intent = new Intent(getContext(), FormActivity.class);
                intent.putExtra("name",TABLE_NAME);
                getActivity().startActivity(intent);
                return true;


            default:return super.onOptionsItemSelected(item);
        }

    }

}