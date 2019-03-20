package com.example.tesst;
public class exx {
    int id;
    private String achat;
    private String prix;

    public exx(String cha, Float ct){}
    public exx( String nom, String montant){
        this.achat=nom;
        this.prix=montant;
    }
    public String getAchat()
    {
        return achat;
    }

    public void setAchat(String achat)
    {
        this.achat = achat;
    }
    public String getPrix()
    {
        return prix;
    }

    public void setPrix(String prix)
    {
        this.prix = prix;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }}

