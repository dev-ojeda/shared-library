/* groovylint-disable EmptyClass */
package com.builder.dominio.db

import com.builder.dominio.interfaces.IDominio
import com.builder.dominio.model.Dominio
import com.builder.util.Mock

class DbDominio extends Dominio implements IDominio {

    DbDominio(Dominio dominio, String nombreDominio, List<Dominio> listaDominio) {
        super(dominio, nombreDominio, listaDominio)
    }

    DbDominio() {
    }

    List<Dominio> listaDominio() {
        Mock mock = new Mock()
        dominio.listaDominio = mock.listaDominio()
        return new DbDominio(listaDominio: dominio.listaDominio)
    }

    List<Dominio> listaDominioPorGeo(Dominio dominio) {
        Mock mock = new Mock()
        dominio.listaDominio = mock.listaDominioGeoCL()
        dominio.listaDominio = mock.listaDominioGeoAR()
        return new DbDominio(listaDominio: dominio.listaDominio)
    }

    List<Dominio> listDominio(Dominio dominio) {
        Mock mock = new Mock()
        dominio.listaDominio = mock.listaDominioGeoCL()
        dominio.listaDominio = mock.listaDominioGeoAR()
        return new DbDominio(listaDominio: dominio.listaDominio)
    }

    List<Dominio> listLookupsPorDominio(Dominio dominio) {
        Mock mock = new Mock()
        dominio.listaDominio = mock.listaLookupPorDominioCL()
        dominio.listaDominio = mock.listaLookupPorDominioAR()
        return new DbDominio(listaDominio: dominio.listaDominio)
    }

}
