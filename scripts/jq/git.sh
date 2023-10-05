#!/usr/bin/env bash

branches=$(git describe --contains --all HEAD)
echo "${branches}"
if [[ "${branches}" == "remotes/origin/develop" ]] 
then
    sed -i 's/enableFortify=false/enableFortify=true/g' ../../jdp/test.txt
    cat ../../jdp/test.txt
elif [[ "${branches}" == "feature/poc" ]] 
then
    sed -i 's/enableFortify=false/enableFortify=true/g' ../../jdp/test.txt
    cat ../../jdp/test.txt
elif [[ "${branches}" == "remotes/origin/master" ]] 
then
    sed -i 's/enableFortify=false/enableFortify=true/g' ../../jdp/test.txt
    cat ../../jdp/test.txt
fi

