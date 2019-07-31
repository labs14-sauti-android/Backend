package com.lambdaschool.starthere;

import com.lambdaschool.starthere.services.MarketPriceService;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaParser;
import graphql.servlet.SimpleGraphQLHttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletRegistration;

@EnableWebMvc
@EnableJpaAuditing
@SpringBootApplication
@EnableSwagger2
public class StartHereApplication
{

    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(StartHereApplication.class, args);

        DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);


    }

}
