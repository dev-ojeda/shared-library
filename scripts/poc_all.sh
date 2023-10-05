#!/usr/bin/bash -xe

argumentos=$*
fields=${argumentos[2]}

function getParametros() {
    IFS=',' read -ra ip_array <<<"$fields"
    echo "${ip_array[0]}"
    echo "${ip_array[1]}"
}

function getCmd() {
    echo "SALUDO"
}

function reporte () {
    html='function reporte () {'
    html+='let html="<table id='"'principal'"'>";'
    html+='html+="<tr>";'
    html+='html+="<th>Company</th>";'
    html+='html+="<th>Contact</th>";'
    html+='html+="<th>Country</th>";'
    html+='html+="</tr>";'
    html+='html+="<tr>";'
    html+='html+="<td>Alfreds Futterkiste</td>";'
    html+='html+="<td>Maria Anders</td>";'
    html+='html+="<td>Germany</td>";'
    html+='html+="</tr>";'
    html+='html+="<tr>";'
    html+='html+="<td>Centro comercial Moctezuma</td>";'
    html+='html+="<td>Francisco Chang</td>";'
    html+='html+="<td>Mexico</td>";'
    html+='html+="</tr>";'
    html+='html+="</table>";'
    html+='return html;'
    html+='}'
    html+='document.body.innerHTML = reporte();'
    echo "${html}" > ./typescript/reporte.ts
}
# this subshell is a scope of try
# try
(
    # this flag will make to exit from current subshell on any error
    # inside it (all functions run inside will also break on any error)
    set -e
    # getParametros
    reporte
    # do more stuff here
)
# and here we catch errors
# catch
salida=$?
if [ $salida -eq 1 ]; then
    echo "General error"
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
