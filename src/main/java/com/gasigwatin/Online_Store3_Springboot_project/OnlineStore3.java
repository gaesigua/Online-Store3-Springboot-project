package com.gasigwatin.Online_Store3_Springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


//Method 1: Using @Bean annotation on a method

@SpringBootApplication
public class OnlineStore3 {

	public static void main(String[] args) {
	var context = SpringApplication.run(OnlineStore3.class, args);

	MeineErsteSchule1 meineErsteSchule = context.getBean(MeineErsteSchule1.class);

	System.out.println(meineErsteSchule.sichVorstellen());

	}

	@Bean
	public MeineErsteSchule1 meineErsteSchule() {
		return new MeineErsteSchule1("kanamugire");
	}

}

//Method 2: Using @Component on the class

//@SpringBootApplication
//public class OnlineStore3 {
//	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(OnlineStore3.class, args);
//
//		MeineErsteSchule2 meineErsteSchule2 = context.getBean(MeineErsteSchule2.class);
//
//		System.out.println(meineErsteSchule2.sichVorstellen2());
//	}
//}


//Method 3: Using @Configuration on the ApplicationConfig class

//@SpringBootApplication
//public class OnlineStore3 {
//	public static void main(String[] args) {
//		var context = SpringApplication.run(OnlineStore3.class, args);
//		MeineErsteSchule3 meineErsteSchule3 = context.getBean("meineErsteSchule3", MeineErsteSchule3.class);
//
//		System.out.println(meineErsteSchule3.sichVorstellen3());
//	}

//Method 4: Using the bean nickname from the ApplicationConfig

//@SpringBootApplication
//public class OnlineStore3 {
//
//	public static void main(String[] args) {
//		var context = SpringApplication.run(OnlineStore3.class, args);
//		MeineErsteSchule4 meineErsteSchule4 = context.getBean("my4thGreeting", MeineErsteSchule4.class);
//
//		System.out.println(meineErsteSchule4.sichVorstellen4());
//
//	}
//}
