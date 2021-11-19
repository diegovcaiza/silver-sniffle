/**
 * 
 */
package com.chapter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Mono;

/**
 * @author dvcaiza
 *
 */
public class TestController {
	
	@GetMapping("/test")
	public Mono<ResponseEntity<String>> test() {
		return Mono.just("test")
				.map(ResponseEntity::ok);
	}
}
