#!/usr/bin/env groovy

def call(String name = 'human') {
   echo "Hello, ${name}."
}

def info(){
    echo "BIENVENIDO!!!"
}

def listaGeos()
{
    return ["CL","CR","CL"]
}
// def call(branch) {

//     echo "${branch}"
//     def opciones = 'scm/build_options.txt'

//     valor = readFile(file: opciones)
//     salida = valor.replace("branch=","")

//     echo "${salida}"
//     return salida
// }