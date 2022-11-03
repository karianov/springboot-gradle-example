package co.edu.karianov.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.karianov.controller.response.ServiceStatusResponse;

@RestController
public class HealthController {

	@GetMapping("health")
	public ResponseEntity<ServiceStatusResponse> checkHealthStatus() {
		ServiceStatusResponse serviceStatusResponse = new ServiceStatusResponse();
		serviceStatusResponse.setCode(HttpStatus.OK.value());
		serviceStatusResponse.setStatus("Service is up");
		return ResponseEntity.ok(serviceStatusResponse);
	}

}
