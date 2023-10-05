package com.builder.subdominio.interfaces

import com.builder.subdominio.model.SubDominio


interface ISubDominio {
    List<SubDominio> ListaSubDominios()
    List<SubDominio> ListaSubDominios(SubDominio subDominio)
    List<SubDominio> ListaSubDominioPorDominio(SubDominio subDominio)
}