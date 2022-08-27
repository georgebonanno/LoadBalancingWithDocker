#docker run -p 9080:9080  -v $(pwd)/target/echo.war:/config/dropins/echo.war websphere-liberty:22.0.0.6-full-java8-ibmjava
FROM  websphere-liberty:22.0.0.6-full-java8-ibmjava
COPY target/echo.war /config/dropins/echo.war
EXPOSE 9080
EXPOSE 9443
