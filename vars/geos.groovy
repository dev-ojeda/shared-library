#!/usr/bin/env groovy
import com.builder.GeosClass

def call(String geo) {
    def objGeo = new GeosClass()
    objGeo.geo = geo
    echo "Hello, ${objGeo.geo}."
}
