package com.fsconsultoria.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.fsconsultoria.cardview.R;
import com.fsconsultoria.cardview.adapter.PostagemAdapter;
import com.fsconsultoria.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    //adiciona objetos tipo postagem dentro da lista
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //exibe tela - não posso esquecer
        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //define layout

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        //metodo que cria as postagens
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter(adapter);

    }
    //método que configura as minhas postagens
    public void prepararPostagens() {

        Postagem p;

        p = new Postagem("Fá Sousa", "#tbt Viagem legal!", R.drawable.imagem1);
        this.postagens.add( p );

        p = new Postagem("Ada Lovelace", "#tbt Meu primeiro algoritmo", R.drawable.imagem2);
        //adiciono a postagem no meu array
        this.postagens.add( p );

        p = new Postagem("Meredith Gray", "#tbt Sonhando outra vez!!!", R.drawable.imagem3);
        this.postagens.add( p );

        p = new Postagem("Cristina Yang", "#tbt Montanhas", R.drawable.imagem4);
        this.postagens.add( p );

    }
}
