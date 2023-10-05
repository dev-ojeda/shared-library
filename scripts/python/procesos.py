#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys
import os
import re
import subprocess as p

def main():
    opcion = ""
    parameter = sys.argv
    paten = re.sub(r"[\([{})\]\'\,\t\\]", "", str(parameter))
    os.chmod("../poc_all.sh", 0o777)
    output_cmd = p.call(["bash", "../poc_all.sh", paten], shell=True)
    if output_cmd == 0:
        opcion = "exit 0"
    else:
        opcion = "exit 1"
    return opcion


if __name__ == "__main__":
    main()
