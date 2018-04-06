package com.mail;

import com.mail.SendMail.SendMail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailApplicationTests {



	@Test
	public void contextLoads() {
		SendMail.sendMailGeneric(
				"money.scan@meltsan.com",
				"__________",
				"money.scan@meltsan.com",
				"leonardo.marcos@meltsan.com",
				"1",
				"true",
				"true",
				"smtp.bizmail.yahoo.com",
				"587");
	}

}
