#!/usr/bin/bash

valida=0
temporal=""
function leerArchivo()
{

    while IFS="," read -r -a line 
    do
    cantidad="${#line[@]}"
    if [ "${cantidad}" -gt "${valida}" ]; then
        echo "line0: ${line[0]}"
        echo "line1: ${line[1]}"
        echo "line2: ${line[2]}"
        echo "line3: ${line[3]}"
        echo "line4: ${line[4]}"
        echo "line5: ${line[5]}"
        echo "line6: ${line[6]}"
        echo "line7: ${line[7]}"
        echo "line8: ${line[8]}"
    elif [ "${cantidad}" -eq "${valida}" ]; then
        salida=$?
    else
        echo "NADA"
    fi
    # sleep 5s
    done <<< "$(cat people.csv)"
    
}


function init() {

    if [ -f people.csv ];
    then
        echo "Sí, sí existe."
        temporal="true"
        leerArchivo
    else
        echo "No, no existe"
        temporal="false"
    fi

    echo "${temporal}"
}

# this subshell is a scope of try
# try
(
    # this flag will make to exit from current subshell on any error
    # inside it (all functions run inside will also break on any error)
    # set -xe
    # getParametros
    init
    # do more stuff here
)
# and here we catch errors
# catch
salida=$?
echo "SALIDA: ${salida}"
if [ $salida -eq 1 ]; then
    echo "General error"
    exit $salida
elif [ $salida -eq 4 ]; then
    echo "NO EXISTE EL ARCHIVO"
    exit $salida
elif [ $salida -eq 2 ]; then
    echo "Misuse of shell builtins"
    exit $salida
elif [ $salida -eq 126 ]; then
    echo "Command invoked cannot execute"
    exit $salida
elif [ $salida -eq 127 ]; then
    echo "command not found"
    exit $salida
elif [ $salida -eq 128 ]; then
    echo "Invalid argument"
    exit $salida
fi