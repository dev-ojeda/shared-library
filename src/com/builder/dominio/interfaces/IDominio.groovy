package com.builder.dominio.interfaces

import com.builder.dominio.model.Dominio

interface IDominio {

    List<Dominio> listaDominio();
    List<Dominio> listaDominioPorGeo(Dominio dominio);
    List<Dominio> listDominio(Dominio dominio);
    List<Dominio> listLookupsPorDominio(Dominio dominio);

}
