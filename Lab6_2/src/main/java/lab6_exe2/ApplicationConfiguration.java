package lab6_exe2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {
    @Bean
    @Scope("prototype")
    public Product Product1(){
        Product product = new Product(1L,"Iphone",1000.0,"vip pro!");
        return product;
    }

    @Bean
    @Scope("prototype")
    public Product Product2(){
        return new Product(Product1());
    }

    @Bean
    @Scope("singleton")
    public Product Product3(){
        Product product = new Product(1L, "Xbox", 3000.0, "Nice!");
        return product;
    }
}
