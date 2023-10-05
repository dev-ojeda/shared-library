import re
import sys
import os
import subprocess as p

# os.chmod("./procesos.py",0o777)

def main(argv):
    paten = re.sub(r"[\([{})\]\'\,\t\\]", "", str(argv))
    print(paten)
    os.chmod("../poc_all.sh",0o777)
    output_cmd = p.call(["bash", "../poc_all.sh", paten, "2>", "/dev/null"], shell=False)
    if output_cmd == 0:
        return "exit 0"
    else:
        return "exit 1"

if __name__ == "__main__":
    parameter = sys.argv
    main(parameter)