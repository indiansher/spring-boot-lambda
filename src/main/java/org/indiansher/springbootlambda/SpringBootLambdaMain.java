package org.indiansher.springbootlambda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class SpringBootLambdaMain implements CommandLineRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Before Starting Spring boot APP");
		SpringApplication.run(SpringBootLambdaMain.class, args).close();
		System.out.println("Spring boot APP finished");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}

	@Bean
	public DummyBean dummyBean0() {
		return new DummyBean("0");
	}

	@Bean
	public DummyBean dummyBean1() {
		return new DummyBean("1");
	}

	@Bean
	public DummyBean dummyBean2() {
		return new DummyBean("2");
	}

	@Bean
	public DummyBean dummyBean3() {
		return new DummyBean("3");
	}

	@Bean
	public DummyBean dummyBean4() {
		return new DummyBean("4");
	}

	@Bean
	public DummyBean dummyBean5() {
		return new DummyBean("5");
	}

	@Bean
	public DummyBean dummyBean6() {
		return new DummyBean("6");
	}

	@Bean
	public DummyBean dummyBean7() {
		return new DummyBean("7");
	}

	@Bean
	public DummyBean dummyBean8() {
		return new DummyBean("8");
	}

	@Bean
	public DummyBean dummyBean9() {
		return new DummyBean("9");
	}

	@Bean
	public DummyBean dummyBean10() {
		return new DummyBean("10");
	}

	@Bean
	public DummyBean dummyBean11() {
		return new DummyBean("11");
	}

	@Bean
	public DummyBean dummyBean12() {
		return new DummyBean("12");
	}

	@Bean
	public DummyBean dummyBean13() {
		return new DummyBean("13");
	}

	@Bean
	public DummyBean dummyBean14() {
		return new DummyBean("14");
	}

	@Bean
	public DummyBean dummyBean15() {
		return new DummyBean("15");
	}

	@Bean
	public DummyBean dummyBean16() {
		return new DummyBean("16");
	}

	@Bean
	public DummyBean dummyBean17() {
		return new DummyBean("17");
	}

	@Bean
	public DummyBean dummyBean18() {
		return new DummyBean("18");
	}

	@Bean
	public DummyBean dummyBean19() {
		return new DummyBean("19");
	}

	@Bean
	public DummyBean dummyBean20() {
		return new DummyBean("20");
	}

	@Bean
	public DummyBean dummyBean21() {
		return new DummyBean("21");
	}

	@Bean
	public DummyBean dummyBean22() {
		return new DummyBean("22");
	}

	@Bean
	public DummyBean dummyBean23() {
		return new DummyBean("23");
	}

	@Bean
	public DummyBean dummyBean24() {
		return new DummyBean("24");
	}

	@Bean
	public DummyBean dummyBean25() {
		return new DummyBean("25");
	}

	@Bean
	public DummyBean dummyBean26() {
		return new DummyBean("26");
	}

	@Bean
	public DummyBean dummyBean27() {
		return new DummyBean("27");
	}

	@Bean
	public DummyBean dummyBean28() {
		return new DummyBean("28");
	}

	@Bean
	public DummyBean dummyBean29() {
		return new DummyBean("29");
	}

	@Bean
	public DummyBean dummyBean30() {
		return new DummyBean("30");
	}

	@Bean
	public DummyBean dummyBean31() {
		return new DummyBean("31");
	}

	@Bean
	public DummyBean dummyBean32() {
		return new DummyBean("32");
	}

	@Bean
	public DummyBean dummyBean33() {
		return new DummyBean("33");
	}

	@Bean
	public DummyBean dummyBean34() {
		return new DummyBean("34");
	}

	@Bean
	public DummyBean dummyBean35() {
		return new DummyBean("35");
	}

	@Bean
	public DummyBean dummyBean36() {
		return new DummyBean("36");
	}

	@Bean
	public DummyBean dummyBean37() {
		return new DummyBean("37");
	}

	@Bean
	public DummyBean dummyBean38() {
		return new DummyBean("38");
	}

	@Bean
	public DummyBean dummyBean39() {
		return new DummyBean("39");
	}

	@Bean
	public DummyBean dummyBean40() {
		return new DummyBean("40");
	}

	@Bean
	public DummyBean dummyBean41() {
		return new DummyBean("41");
	}

	@Bean
	public DummyBean dummyBean42() {
		return new DummyBean("42");
	}

	@Bean
	public DummyBean dummyBean43() {
		return new DummyBean("43");
	}

	@Bean
	public DummyBean dummyBean44() {
		return new DummyBean("44");
	}

	@Bean
	public DummyBean dummyBean45() {
		return new DummyBean("45");
	}

	@Bean
	public DummyBean dummyBean46() {
		return new DummyBean("46");
	}

	@Bean
	public DummyBean dummyBean47() {
		return new DummyBean("47");
	}

	@Bean
	public DummyBean dummyBean48() {
		return new DummyBean("48");
	}

	@Bean
	public DummyBean dummyBean49() {
		return new DummyBean("49");
	}

}
