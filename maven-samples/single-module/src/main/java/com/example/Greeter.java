package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone)
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World, Thanks you making me happy";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone)
  }
}
