package com.p2p.yk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="spring-cloud-eureka-server")
public interface DjxClientService {

	@GetMapping("/user/getPhone")
	public String getPhone();
}
