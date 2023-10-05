#!/usr/bin/env groovy
/* groovylint-disable FactoryMethodName, MethodParameterTypeRequired, UnusedMethodParameter */
package com.builder.util

public class Mock {

    def listaTipo = ["\"Seleccione:selected\"", "\"dprep\"", "\"purp\""]
    def listaGeo = ["\"Seleccione:selected\"", "\"AR\"", "\"CL\""]
    // def geoAR = "\"${listaGeo[0]}\""
    // def geoCL = "\"${listaGeo[1]}\""
    def listaDominioCLDprep = ["\"DMCLDPREP1\"", "\"DMCLDPREP2\""]
    def listaDominioARDprep = ["\"DMARDPREP1\"", "\"DMARDPREP2\""]
    def listaDominioCLPurp = ["\"DMCLPURP1\"", "\"DMCLPURP2\""]
    def listaDominioARPurp = ["\"DMARPURP1\"", "\"DMARPURP2\""]
    def listaDominioTotalDprep = ["\"DMCLDPREP1\"", "\"DMCLDPREP2\"", "\"DMARDPREP1\"", "\"DMARDPREP2\""]
    def listaDominioTotalPurp = ["\"DMCLPURP1\"", "\"DMCLPURP2\"", "\"DMARPURP1\"", "\"DMARPURP2\""]
    def listaDominio = ["\"DMCLDPREP1\"", "\"DMCLDPREP2\"", "\"DMARDPREP1\"", "\"DMARDPREP2\"", "\"DMCLPURP1\"", "\"DMCLPURP2\"", "\"DMARPURP1\"", "\"DMARPURP2\""]
// String strDominiosCL1 = "\"${listaDominioCL[0]}\""
// String strDominiosCL2 = "\"${listaDominioCL[1]}\""
// String strDominiosAR1 = listaDominioAR[0]
// String strDominiosAR2 = listaDominioAR[1]
// def listaDominioGeoCL1 = ["$strDominiosCL1", "$strDominiosCL2"]
// def listaDominioGeoCL = ["$geoCL": ["$strDominiosCL1", "$strDominiosCL2"]]
// def listaDominioGeoAR = ["$geoAR": ["$strDominiosAR1", "$strDominiosAR2"]]
// String domCl1 = listaDominioGeoCL[0]
// String domCl2 = listaDominioGeoCL[1]
// String domAR1 = listaDominioGeoAR[0]
// String domAR2 = listaDominioGeoAR[1]
// def listaLookupPorDominioCL1 = ["$strDominiosCL1": ["LOOKUPSCL1", "LOOKUPSCL2"]]
// def listaLookupPorDominioCL2 = ["$strDominiosCL2": ["LOOKUPSCL3", "LOOKUPSCL4"]]
// def listaLookupPorDominioAR1 = ["$strDominiosAR1": ["LOOKUPSAR1", "LOOKUPSAR2"]]
// def listaLookupPorDominioAR2 = ["$strDominiosAR2": ["LOOKUPSAR3", "LOOKUPSAR4"]]
// def listaLookupPorDominioCL = ["$listaLookupPorDominioCL1", "$listaLookupPorDominioCL2"]
// def listaLookupPorDominioAR = ["$listaLookupPorDominioAR1", "$listaLookupPorDominioAR2"]
// def listaGeneral = [
//     "$geoCL":
//     [
//         "$listaLookupPorDominioCL1",
//         "$listaLookupPorDominioCL2"
//     ],
//     "$geoAR":
//     [
//         "$listaLookupPorDominioAR1",
//         "$listaLookupPorDominioAR2"
//     ]
// ]

    def listTipo() {
        return buildScript(listaTipo)
    }

    def listGeo() {
        return buildScript(listaGeo)
    }

    def listDominio() {
        return listaDominio
    }

    def buildScript(values) {
        return " return ${values} "
    }

    def populateItemsDprep(tipo, cl, ar) {
        return '''if(Geos.equals('CL') && Tipo.equals("${tipo}")){
            return $cl
        }
        else if(Geos.equals('AR') && Tipo.equals("$tipo")){
            return $ar
        }
        else if(Geos.equals('Seleccione') && Tipo.equals('Seleccione')){
            return $listaDominio
        }
        '''
    }

    def populateItemsPurp(tipo, cl, ar) {
        return '''if(Geos.equals('CL') && Tipo.equals("$tipo")){
            return $cl
        }
        else if(Geos.equals('AR') && Tipo.equals("$tipo")){
            return $ar
        }
        else if(Geos.equals('Seleccione') && Tipo.equals('Seleccione')){
            return $listaDominio
        }
        '''
    }

    def listaDominioPorGeo(geo, tipo) {
        def resultado = []
        if (tipo == 'dprep' || geo == 'CL' || geo == 'AR') {
            resultado = populateItemsDprep(tipo, listaDominioCLDprep, listaDominioARDprep)
        }
        else if (tipo == 'purp' || geo == 'CL' || geo == 'AR') {
            resultado = populateItemsPurp(tipo, listaDominioCLPurp, listaDominioARPurp)
        }
        else if (tipo == 'Selecione' && geo == 'Seleccione'){
            resultado += populateItemsDprep(tipo, listaDominioCLDprep, listaDominioARDprep)
            resultado += populateItemsPurp(tipo, listaDominioCLPurp, listaDominioARPurp)
        }
        return resultado
    }

    // def listaDominioTotalDprep() {
    //     return listaDominioTotalDprep
    // }

    // def listaDominioTotalPurp() {
    //     return listaDominioTotalPurp
    // }

    // def listaDominioGeoCL1() {
    //     return listaDominioGeoCL1
    // }

    // def listaDominioGeoAR() {
    //     return listaDominioGeoAR
    // }

    // def listaDominioCL() {
    //     return  listaDominioCL
    // }

    // def listaDominioAR() {
    //     return  listaDominioAR
    // }

    // def listaLookupPorDominioCL() {
    //     return  listaLookupPorDominioCL
    // }

    // def listaLookupPorDominioAR() {
    //     return  listaLookupPorDominioAR
    // }

    // def listaGeneral() {
    //     return  listaGeneral
    // }

}
