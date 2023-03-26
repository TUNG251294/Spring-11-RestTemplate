package com.example.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
@EnableWebMvc
@ComponentScan("com.example")
@EnableTransactionManagement
@EnableJpaRepositories("com.example.repository")
@EnableSpringDataWebSupport
public class AppConfig implements ApplicationContextAware, WebMvcConfigurer {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    //Cấu hình Thymeleaf
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }
    //Cấu hình JPA
//    @Bean
//    @Qualifier(value = "entityManager")
//    public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
//        return entityManagerFactory.createEntityManager();
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(dataSource());
//        em.setPackagesToScan("com.example.model");
//        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        em.setJpaVendorAdapter(vendorAdapter);
//        em.setJpaProperties(additionalProperties());
//        return em;
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/blog-app?useSSL=true");
//        dataSource.setUsername("root");
//        dataSource.setPassword("votinh9$");
//        return dataSource;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(emf);
//        return transactionManager;
//    }
//
//    public Properties additionalProperties() {
//        Properties properties = new Properties();
//        //k tu update table trong database
//        properties.setProperty("hibernate.hbm2ddl.auto", "none");
//        //hien thi cau SQL trong log
//        properties.put("hibernate.show_sql", "true");
//        properties.put("hibernate.format_sql", "true");
//        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
//        return properties;
//    }
//    @Bean
//    public MessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasenames("validation-message");
//        return messageSource;
//    }
    //    @Bean
//    public ModelMapper modelMapper() {
//        ModelMapper modelMapper = new ModelMapper();
//        modelMapper.getConfiguration()
//                .setMatchingStrategy(MatchingStrategies.STRICT);
//        return modelMapper;
//    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

}

