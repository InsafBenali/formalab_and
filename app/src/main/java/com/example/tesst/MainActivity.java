package com.example.tesst;


import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.DataSetObserver;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    public ListView lst;
    public static bdd bd;
    public static adapter array ;
    public static ArrayList<exx> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bd= new bdd(this);
        list=new ArrayList<exx>();
        list= bd.affichernv();
        lst=findViewById(R.id.list);
        array=new adapter(this,R.layout.exempl,list);
        lst.setAdapter(array);
        Toast.makeText(this,list.get(0).getAchat(), Toast.LENGTH_SHORT).show();

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.add, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        if ( item.getItemId()==R.id.ajt){
            Intent intent= new Intent(MainActivity.this, accueil.class );
            startActivity(intent); }
        else  {
            Intent intent= new Intent(MainActivity.this, total.class );
            startActivity(intent); }
        return  true;
    }

    @Override
    public void onResume(){
        super.onResume();
        list=bd.affichernv();
        array=new adapter(this,R.layout.exempl,list);

        lst.setAdapter(array);;

    }


}