package com.aplikasipahlawankuprimaputraagusantara;

public class ModelPahlawan
{
    private String nama;
    private String tentang;
    private  String foto;

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return nama;
    }

    public void setTentang(String tentang) {
        this.tentang = tentang;
    }

    public String getTentang()
    {
        return tentang;
    }

    public void setFoto(String foto)
    {
        this.foto = foto;
    }

    public String getFoto()
    {
        return foto;
    }
}
