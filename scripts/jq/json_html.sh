#!/bin/bash -xe

output=$(python to_html.py)
echo "${output}" > output.html