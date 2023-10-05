package com.builder.dominio.model

class Dominio {

    Dominio(Dominio dominio, String nombreDominio, List<Dominio> listaDominio) {
        this.dominio = dominio
        this.nombreDominio = nombreDominio
        this.listaDominio  = listaDominio
    }

    Dominio() {
    }

    Dominio getDominio() {
        return dominio
    }

    void setDominio(Dominio dominio) {
        this.dominio = dominio
    }

    String getNombreDominio() {
        return nombreDominio
    }

    void setNombreDominio(String nombreDominio) {
        this.nombreDominio = nombreDominio
    }

    List<Dominio> getListaDominio() {
        return listaDominio
    }

    void setListaDominio(List<Dominio> listaDominio) {
        this.listaDominio = listaDominio
    }
    Dominio dominio
    String nombreDominio
    List<Dominio> listaDominio

}
