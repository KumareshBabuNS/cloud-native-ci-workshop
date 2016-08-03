#!/usr/bin/env bash
cf push -f service/manifest.yml
cf push -f client/manifest.yml
cf push -f proxy/manifest.yml

