#!/bin/bash
npm install @openapitools/openapi-generator-cli -g
echo '{"invokerPackage":"com.docstudio.client",
        "apiPackage":"com.docstudio.client.api",
        "modelPackage":"com.docstudio.client.model",
        "groupId":"com.docstudio",
        "artifactId":"docstudio-api-client",
        "disallowAdditionalPropertiesIfNotPresent": false,
        "artifactVersion": "1.0.0"}' > config.json
npx openapi-generator-cli generate -i https://api.docstudio.com/v3/api-docs/USER --skip-validate-spec -g java -o ./generated-client -c config.json
rm -rf ./src/main/java
cp -rf ./generated-client/src/main/java ./src/main
rm -rf ./docs
cp -rf ./generated-client/docs ./
rm openapitools.json
rm config.json
rm -rf ./generated-client
