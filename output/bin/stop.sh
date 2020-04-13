#!/bin/sh
ps ux | grep "course-demo" | grep -v grep | grep -v stop.sh | cut -c 9-15 | xargs kill -s 9

echo "kill $@ done"