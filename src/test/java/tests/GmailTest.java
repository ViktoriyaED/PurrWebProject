package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GmailReceiver;

public class GmailTest {

    @Test
    public void testExtractGmailPassword() throws Exception {

//        Assert.assertEquals(GmailReceiver.getPassword(ProjectProperties.USERNAME_GMAIL, ProjectProperties.PASSWORD_GMAIL, "pw.new.test.23@gmail.com"), "PaSsWoRd#");
        Assert.assertEquals(GmailReceiver.getPassword(), "PaSsWoRd#");
    }
}