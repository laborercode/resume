package org.laborercode.resume;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResumeTest {
    @Test
    public void testResume_check() {
        Resume resume = new Resume("윤성배");

        Assert.assertEquals(resume.check(), "PASS");
    }
}
