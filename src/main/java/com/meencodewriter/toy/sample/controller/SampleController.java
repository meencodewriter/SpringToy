package com.meencodewriter.toy.sample.controller;

import com.meencodewriter.toy.platform.client.controller.BaseClientController;
import com.meencodewriter.toy.platform.client.multitenancy.TenantContextHolder;
import com.meencodewriter.toy.sample.entity.Sample;
import com.meencodewriter.toy.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
public class SampleController extends BaseClientController {
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@PostMapping("/getSample")
	public List<Sample> getSample(HttpServletRequest request){
		TenantContextHolder.setSiteId(obtainSiteFromSubdomain(request));
		return sampleRepository.findAll();
	}
}
