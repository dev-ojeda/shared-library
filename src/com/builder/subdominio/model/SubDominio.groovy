/* groovylint-disable LineLength */
package com.builder.subdominio.model

import com.builder.dominio.model.Dominio;

class SubDominio extends Dominio {

    SubDominio getSubDominio() {
        return subDominio
    }

    void setSubDominio(SubDominio subDominio) {
        this.subDominio = subDominio
    }

    List<SubDominio> getListaSubDominio() {
        return listaSubDominio
    }

    void setListaSubDominio(List<SubDominio> listaSubDominio) {
        this.listaSubDominio = listaSubDominio
    }

    SubDominio(Dominio dominio, String nombreDominio, List<Dominio> listaDominio, SubDominio subDominio, List<SubDominio> listaSubDominio) {
        super(dominio, nombreDominio, listaDominio)
        this.subDominio = subDominio
        this.listaSubDominio = listaSubDominio
    }

    SubDominio(SubDominio subDominio, List<SubDominio> listaSubDominio) {
        this.subDominio = subDominio
        this.listaSubDominio = listaSubDominio
    }
    SubDominio subDominio
    List<SubDominio> listaSubDominio

}
