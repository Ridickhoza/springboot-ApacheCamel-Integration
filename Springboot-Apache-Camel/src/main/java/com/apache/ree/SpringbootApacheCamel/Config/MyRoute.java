package com.apache.ree.SpringbootApacheCamel.Config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C:\\Users\\User\\Documents\\Apache-Camel\\Springboot-Apache-Camel\\Springboot-Apache-Camel\\input").to("file:C:\\Users\\User\\Documents\\Apache-Camel\\Springboot-Apache-Camel\\Springboot-Apache-Camel\\output");
    }
    
}

