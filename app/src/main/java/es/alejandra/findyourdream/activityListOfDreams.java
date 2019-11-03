package es.alejandra.findyourdream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class activityListOfDreams extends AppCompatActivity {

    ArrayList<Contenido.Lista_entrada> lista = Contenido.ENT_LISTA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_dreams);

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




}
