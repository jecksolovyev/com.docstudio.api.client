1. Copy swagger json from https://api.centredo.com/swagger-ui/index.html
2. Generate code at https://editor.swagger.io/
3. Change version to 1.8
4. Add next dependency to pom.xml
    ```xml
    <dependency>
      <groupId>javax.annotation</groupId>
      <artifactId>javax.annotation-api</artifactId>
      <version>1.3.2</version>
    </dependency>
   ```
5. Remove `empty` property from src/main/java/io/swagger/client/model/DataMap.java
6. Change ApiClient.buildRequestBodyMultipart:
   ```java
       public RequestBody buildRequestBodyMultipart(Map<String, Object> formParams) {
           MultipartBuilder mpBuilder = new MultipartBuilder().type(MultipartBuilder.FORM);
           for (Entry<String, Object> param : formParams.entrySet()) {
               if (param.getValue() instanceof Collection) {
                   ((Collection) param.getValue()).forEach(value -> {
                       processMultipartFormParam(mpBuilder, param.getKey(), value);
                   });
               } else {
                   processMultipartFormParam(mpBuilder, param.getKey(), param.getValue());
               }
           }
           return mpBuilder.build();
       }
      
       private void processMultipartFormParam(MultipartBuilder mpBuilder, String key, Object value) {
           if (value instanceof File) {
               File file = (File) value;
               Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"; filename=\"" + file.getName() + "\"");
               MediaType mediaType = MediaType.parse(guessContentTypeFromFile(file));
               mpBuilder.addPart(partHeaders, RequestBody.create(mediaType, file));
           } else {
               Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"");
               if (value.getClass().isPrimitive()) {
                   mpBuilder.addPart(partHeaders, RequestBody.create(null, parameterToString(value)));
               } else {
                   mpBuilder.addPart(partHeaders, RequestBody.create(MediaType.parse("application/json"), json.serialize(value)));
               }
      
           }
       }
   ```
7. Build with `mvn clean package`
