
#!/usr/bin/env python

import json
from json2html import *

def main():
    f=open('all.json')
    data=json.load(f)
    output=json2html.convert(json = data)
    print(output)
    return output

if __name__ == '__main__':
    main()