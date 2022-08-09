#!/bin/bash

pushd my.target
mvn clean install
popd

pushd my.listener
mvn clean install
popd

pushd tests
mvn clean install -Dtycho.printBundles
popd
