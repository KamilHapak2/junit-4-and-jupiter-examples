package pl.com.britenet.junit.junit5;

import lombok.extern.java.Log;
import org.junit.jupiter.api.*;

/** JUnit Jupiter examples of before/after test/class annotations and its behaviours. */
@Log
class BeforeAndAfterTest {

  @BeforeAll
  static void beforeAll() {
    log.info("Before all");
  }

  @AfterAll
  static void afterAll() {
    log.info("After all");
  }

  @AfterEach
  void afterEach() {
    log.info("After each");
  }

  @BeforeEach
  void beforeEach() {
    log.info("Before each");
  }

  @Test
  void test1() {
    log.info("test1 is being executed");
  }

  @Test
  void test2() {
    log.info("test2 is being executed");
  }

  @Test
  void test3() {
    log.info("test3 is being executed");
  }
}
