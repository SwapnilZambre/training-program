package springexample;


@Configuration 
@ComponentScan("springexamples")
public class BeanConfig {
@Bean
public Address getAddress() {
return new Address(456,"Mahe","Mumbai");
}

@Bean
public Student getStudent() {
return new Student(9999,"John",getAddress());
}

}