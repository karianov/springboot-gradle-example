package co.edu.karianov.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/v1")
public class HealthController {

	@GetMapping("health")
	public ResponseEntity<String> checkHealthStatus() {
		return ResponseEntity.ok("Service is up");
	}

}
