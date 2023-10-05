#!/usr/bin/env python
# -*- coding: utf-8 -*-

from asyncio.log import logger
import logging
import logging.config


logging.basicConfig(filename="logs/app.log",level=logging.DEBUG, format="%(asctime)s: %(name)s %(levelname)s\r%(message)s")
try:
    my_list = [0,1,2]
    i = int(input("INGRESA EL INDEX: "))
    logger.info("LA INDEX ES: {0}".format(i))
except AssertionError as err:
    logger.error("Falla:{0}".format(err))

finally:
    logger.info("Continueded...")
