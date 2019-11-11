package es.alejandra.findyourdream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class activityListOfDreams extends FragmentActivity implements FragmentList.Callbacks{

    private boolean dosFragmentos;

    ArrayList<Contenido.Lista_entrada> lista = Contenido.ENT_LISTA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_dreams);

        if(findViewById(R.id.frame_contenedor) != null){
            dosFragmentos = true;
        }

        final TextView author = findViewById(R.id.textViewAuthor);
        author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Made by "+ author.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final TextView year = findViewById(R.id.textViewCurso);
        year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), year.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public void onEntradaSeleccionada(String id) {

        if(dosFragmentos){

            Bundle argumentos = new Bundle();
            argumentos.putString(FragmentDetail.ARG_ID_ENTRADA_SELECCIONADA, id);
            FragmentDetail fragment = new FragmentDetail();
            fragment.setArguments(argumentos);
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_contenedor, fragment)
                    .commit();

        } else {
            Toast.makeText(getBaseContext(), "TOCADO EL " + id, Toast.LENGTH_SHORT).show();
            Intent detalleIntent = new Intent(this, Fragment2.class);
            detalleIntent.putExtra(FragmentDetail.ARG_ID_ENTRADA_SELECCIONADA, id);
            startActivity(detalleIntent);
        }

    }
}
