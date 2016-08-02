#!/usr/bin/env bash
cf cs -c '{"git": { "uri": "https://github.com/dwong-pivotal/config"},"count": 1 }' p-config-server standard config
cf cs p-service-registry standard registry
cf cs p-mysql 512mb mysql
cf cs p-rabbitmq standard refreshbus
#cf cs p-circuit-breaker-dashboard standard circuit-breaker
