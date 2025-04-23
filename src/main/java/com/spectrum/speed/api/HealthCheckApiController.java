package com.spectrum.speed.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckApiController {

	@GetMapping(value="/readiness.htm", produces = { MediaType.TEXT_PLAIN_VALUE })
	@ResponseBody
	public ResponseEntity<String> readinesCheck() {
		return ResponseEntity.ok("ready");
	}

	@GetMapping(value="/liveness.htm", produces = { MediaType.TEXT_PLAIN_VALUE })
	@ResponseBody
	public ResponseEntity<String> livenessCheck() {
		return ResponseEntity.ok("live");
	}
}
