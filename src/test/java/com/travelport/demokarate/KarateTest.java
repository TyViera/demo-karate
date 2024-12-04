package com.travelport.demokarate;

import com.intuit.karate.junit5.Karate;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class KarateTest {

  @Karate.Test
  public Karate tests() {
   return Karate.run("./target/test-classes/features");
  }

}
