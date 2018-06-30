package com.dalcombee.sh.web.core.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Test;

public class JasyptTest {

	@Test
	public void test_config와_관련없이_별도_utils_테스트() {
		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
		pbeEnc.setPassword("test"); //2번 설정의 암호화 키를 입력
		pbeEnc.setAlgorithm("PBEWithMD5AndDES");
		
		String enc = pbeEnc.encrypt("1234"); // 암호화 할 내용
		System.out.println("### enc = " + enc); // 암호화한 내용 출력
		
		// 복호화 테스트
		String dec = pbeEnc.decrypt(enc);
		System.out.println("### dec = " + dec);
	}

}