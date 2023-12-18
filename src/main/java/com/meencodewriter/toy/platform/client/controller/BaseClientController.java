package com.meencodewriter.toy.platform.client.controller;

import com.meencodewriter.toy.platform.base.controller.BaseController;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class BaseClientController extends BaseController {

    /**
     * obtainSiteFromSubdomain
     *  - Sub Domain 을 통해 SiteId 추출.
     *
     * @param request
     * @return
     */
    public String obtainSiteFromSubdomain(HttpServletRequest request) {
        return request.getServerName().split("\\.")[0];
    }
}
