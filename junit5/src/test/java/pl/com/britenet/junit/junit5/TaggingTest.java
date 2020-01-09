package pl.com.britenet.junit.junit5;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * JUnit Jupiter provides @Tag annotation. Marked test can be run or skipped by the tag value. Open
 * Intellij run configuration, switch test king to Tags and type the expression. For example by
 * typing "slow | integration" it will run only tests with one of those tags.
 */
@Log
public class TaggingTest {

  @Test
  @Tag("integration")
  void testWithIntegrationTag() {
    log.info("Running test with integration tag");
  }

  @Test
  @Tag("integration")
  void testWithIntegrationTag2() {
    log.info("Running test 2 with integration tag");
  }

  @Test
  void testWithNoTag() {
    log.info("Running test with no tag");
  }

  @Test
  @Tag("slow")
  void testWithSlowTag() {
    log.info("Running test with slow tag");
  }
}
