#!/bin/sh

sdk use java 17.0.6-tem > /dev/null 2>&1
git reset --hard > /dev/null 2>&1
[ -e .gradle/workspace-id.txt ] && rm .gradle/workspace-id.txt
[ -e .gradle/workspace-id.txt.lock ] && rm .gradle/workspace-id.txt.lock
