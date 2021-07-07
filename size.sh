#!/bin/bash
read -p "Enter Location : " location
ls -lsh $location | awk -F" " '{print $1 " --> " $10}'
