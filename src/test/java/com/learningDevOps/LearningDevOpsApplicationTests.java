package com.learningDevOps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.learningDevOps.web.i18n.I18NService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearningDevOpsApplicationTests {

	@Autowired
	private I18NService i18nService;
	
	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18nService.getMessage(messageId);
		Assert.assertEquals("The Actual and Expected don't match", expectedResult, actual);
	}

}
