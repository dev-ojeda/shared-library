/* groovylint-disable DuplicateNumberLiteral, GStringAsMapKey */
package com.builder.util

def objListaGeos = ["AR", "CL", "CR", "PE", "PY", "UY"]
String geoAR = objListaGeos[0]
String geoCL = objListaGeos[1]
def listaDominiosCL = ["DMCL1", "DMCL2"]
def listaDominiosAR = ["DMAR1", "DMAR2"]
def listaDominios = ["$listaDominiosCL", "$listaDominiosAR"]
String strDominiosCL1 = listaDominiosCL[0]
String strDominiosCL2 = listaDominiosCL[1]
String strDominiosAR1 = listaDominiosAR[0]
String strDominiosAR2 = listaDominiosAR[1]
def listaDominiosGeoCL = ["$geoCL": ["$strDominiosCL1", "$strDominiosCL2"]]
def listaDominiosGeoAR = ["$geoAR": ["$strDominiosAR1", "$strDominiosAR2"]]
def listaGeos = { salida = ["AR", "CL", "CR", "PE", "PY", "UY"] as LinkedList -> println salida }
String domCl1 = listaDominiosGeoCL[0]
String domCl2 = listaDominiosGeoCL[1]
String domAR1 = listaDominiosGeoAR[0]
String domAR2 = listaDominiosGeoAR[1]
def listaLoohupsPorDominioCL1 = ["$strDominiosCL1": ["LOOKUPSCL1", "LOOKUPSCL2"]]
def listaLoohupsPorDominioCL2 = ["$strDominiosCL2": ["LOOKUPSCL3", "LOOKUPSCL4"]]
def listaLoohupsPorDominioAR1 = ["$strDominiosAR1": ["LOOKUPSAR1", "LOOKUPSAR2"]]
def listaLoohupsPorDominioAR2 = ["$strDominiosAR2": ["LOOKUPSAR3", "LOOKUPSAR4"]]
def listaLookupsPorDominioCL = ["$listaLoohupsPorDominioCL1", "$listaLoohupsPorDominioCL2"]
def listaLookupsPorDominioAR = ["$listaLoohupsPorDominioAR1", "$listaLoohupsPorDominioAR2"]
def listaGeneral = [
    "$geoCL":
    [
        "$listaLoohupsPorDominioCL1",
        "$listaLoohupsPorDominioCL2"
    ],
    "$geoAR":
    [
        "$listaLoohupsPorDominioAR1",
        "$listaLoohupsPorDominioAR2"
    ]
]

def output = [
"sa1",
"group1"
]

listaDominios.each { item ->
    println "$item"
}

// listaDominiosCL.each { item ->
//     println "\"$item\""
// }

listaGeneral.each { key, value ->
    println "\"$key\""+":"+ value
}