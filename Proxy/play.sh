#!/bin/bash
make
java client/Client "$1"
make clean
