#!/bin/bash
make
java adapter/Client "$1"
make clean
