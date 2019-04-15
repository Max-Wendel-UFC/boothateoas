package com.jdev.microservices.boothateoas

import com.jdev.microservices.boothateoas.model.Greet
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.security.crypto.codec.Base64
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate

@RunWith(SpringRunner::class)
@SpringBootTest
class BoothateoasApplicationTests {

	@Test
	fun contextLoads() {
	}

//    @Test
//    fun testOAuthService(){
//        val resource = ResourceOwnerPasswordResourceDetails()
//
//        resource.username = "guest"
//        resource.password = "guest123"
//        resource.accessTokenUri = "http://localhost:8080/oauth/token"
//        resource.clientId = "trustedclient"
//        resource.clientSecret = "trustedclient123"
//        resource.grantType = "password"
//
//        val clientContext = DefaultOAuth2ClientContext()
//
//        val  restTemplate = OAuth2RestTemplate(resource,clientContext)
//
//        val greet = restTemplate.getForObject("http://localhost:8080", Greet::class.java)
//
//        Assert.assertEquals("Hello World!", greet.toString())
//    }

//	@Test
//	fun testSecureService(){
//		val plainCreds = "guest:guest123".toByteArray()
//		val encoded = Base64.encode(plainCreds)
//		val headers = HttpHeaders()
//
//		headers.add("Authorization", "Basic $encoded")
//
//		val request = HttpEntity<String>(headers)
//		val restTemplate = RestTemplate()
//		val responseEntity =
//				restTemplate.exchange(
//						"http://localhost:9080",
//						HttpMethod.GET,
//						request,
//						Greet::class.java)
//
//		Assert.assertEquals("Hello World!",responseEntity.body.toString())
//
//	}

}
