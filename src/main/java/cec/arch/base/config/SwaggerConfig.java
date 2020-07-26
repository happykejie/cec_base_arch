package cec.arch.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

@EnableSwagger2

public class SwaggerConfig {

    @Bean

    public Docket buildDocket() {

        return new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(buildApiInf())

                .select()

                .apis(RequestHandlerSelectors

                        .basePackage("com.example.mybatisplus.mybatispludemo.controller"))

                .paths(PathSelectors.any())

                .build();

    }

    private ApiInfo buildApiInf() {

        return new ApiInfoBuilder()
                .title("CEC综合服务系统RESTful API文档")
                .description("这个是公司内部文档")
                .termsOfServiceUrl("http://www.zhangjie.cn")
                .contact(new Contact("zj", "http://www.zhangjie.cn",
                        "350982900@qq.com"))
                .version("1.0")
                .build();

    }

}
