package br.com.matkabal.pokenotifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class PokeNotifier {

    public static void main(String[] args){
        SpringApplication.run(PokeNotifier.class, args);
    }
}
