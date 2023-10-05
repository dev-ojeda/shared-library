#!/usr/bin/bash -xe

# cat people.json|jq '.[].Bindings[]'
# members=$(jq ".[].Bindings[].members[]" all.json)
# service_Accounts=$(jq ".[].Bindings[].members[].service_Accounts" all.json)
# groups=$(jq ".[].Bindings[].members[].groups" all.json)
projects=($(jq -r '.projects[]' projects.json))
for VAR in ${projects[@]}
do
    echo $VAR
done


# ReporteBinding