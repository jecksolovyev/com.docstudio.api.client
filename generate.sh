#!/bin/bash
#npm install @openapitools/openapi-generator-cli -g
echo '{"invokerPackage":"com.docstudio.client",
        "apiPackage":"com.docstudio.client.api",
        "modelPackage":"com.docstudio.client.model",
        "groupId":"com.docstudio",
        "artifactId":"docstudio-api-client",
        "disallowAdditionalPropertiesIfNotPresent": false,
        "artifactVersion": "1.0.0"}' > config.json
npx openapi-generator-cli generate -i https://api.docstudio.com/v3/api-docs --skip-validate-spec -g java -o ./generated-client -c config.json
cp -rf ./generated-client/src/main/ ./src
cp -rf ./generated-client/docs/ .
rm openapitools.json
rm config.json
rm -r generated-client
