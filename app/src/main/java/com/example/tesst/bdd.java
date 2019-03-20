package com.example.tesst;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class bdd extends SQLiteOpenHelper {
    public bdd( Context context) {
        super(context,"tesst", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String creationtable=" create table exx ( id integer primary key, name text, number text);";
        db.execSQL(creationtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String delete ="DROP Table  IF EXISTS contact;";
        db.execSQL(delete);
        onCreate(db);
    }
    public void ajouter (exx exx){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name", exx.getAchat());
        contentValues.put("number",exx.getPrix());
        db.insert("exx", null, contentValues );
    }

    public ArrayList<exx> affichernv(){
        SQLiteDatabase db=getReadableDatabase();
        String selectall="SELECT * FROM exx ";
        Cursor cursor=db.rawQuery(selectall,null);
        ArrayList<exx> nv=new ArrayList<>();
        if (cursor.moveToFirst()){
            do{
                exx ex=new exx(cursor.getString(1),cursor.getString(2));
                 exx.setId(cursor.getInt(0));
                //  exx.setAchat(cursor.getString(2));
                //  exx.setPrix(cursor.getString(1));
                nv.add(ex);
            }while(cursor.moveToNext());
        }
        return nv;
    }
    public void del(int id){
        SQLiteDatabase db=getWritableDatabase();
        db.delete("exx","id="+Integer.toString(id),null);}

    public Float total()
    {   Float s =0f ;

        SQLiteDatabase db=getReadableDatabase();
        String selectall="SELECT * FROM exx";
        Cursor cursor= db.rawQuery(selectall,null);
        ArrayList<exx> exx=new ArrayList<>();
        if (cursor.moveToFirst()){
            do{
                s+=cursor.getFloat(2);
            }
            while(cursor.moveToNext());
        }

        return s ;}
}