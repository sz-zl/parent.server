package com.p2p.yk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.sz.p2p.entity.User;

@FeignClient(value = "spring-cloud-eureka-server")
public interface DjxClientService {

	@PostMapping("/user/accountInfo")
	public User accountInfo();
}
