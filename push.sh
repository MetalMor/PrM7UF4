#!/bin/bash

# Script para hacer un push automaticamente al repositorio

git add --all
git commit -m "$1"
git push origin --all
