package pl.com.britenet.junit.junit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import pl.com.britenet.junit.testbase.ConfigurationService;
import pl.com.britenet.junit.testbase.JpaConfig;
import pl.com.britenet.junit.testbase.Student;
import pl.com.britenet.junit.testbase.StudentRepository;


import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {JpaConfig.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class InMemoryDBTest {

    @Autowired
    private StudentRepository studentRepository;

    @Before
    public void checkH2TestsSwitch() {
        assumeTrue(ConfigurationService.isH2TestsEnabled());
    }

    @Test
    public void givenStudent_whenSave_thenGetOk() {
        Student student = new Student(1, "john");
        studentRepository.save(student);

        Student student2 = studentRepository.findOne( Example.of(new Student("john"))).get();
        assertEquals("john", student2.getName());
    }
}