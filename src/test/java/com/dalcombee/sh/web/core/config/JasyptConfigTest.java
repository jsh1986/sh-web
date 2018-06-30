package com.dalcombee.sh.web.core.config;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dalcombee.sh.web.ShWebApplicationTest;

public class JasyptConfigTest extends ShWebApplicationTest {
	@Autowired
	@Qualifier("encryptorBean")
	StringEncryptor stringEncryptor;

	/**
	 * 이렇게 enc 생성해서, ENC(xxxxxxx) 를 properties 파일에 넣어서 사용할수 있습니다.
	 */
	@Test
	public void testEndAndDec() {
		String enc = stringEncryptor.encrypt("1234");
		System.out.println("### enc = " + enc);
		
		String dec = stringEncryptor.decrypt(enc);
		System.out.println("### dec = " + dec);
	}
}
