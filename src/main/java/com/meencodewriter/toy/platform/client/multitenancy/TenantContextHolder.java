package com.meencodewriter.toy.platform.client.multitenancy;

import com.meencodewriter.toy.platform.util.PlatformUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TenantContextHolder {

    public static String DEFAULT_TENANT_ID;

    private static final ThreadLocal<String> CONTEXT = new InheritableThreadLocal <>();

    public static void setSiteId(String site) {

        //TODO 개발확인을 위함... 도메인이 필요함.
        if(PlatformUtils.isNumeric(site)) site = DEFAULT_TENANT_ID;

        CONTEXT.set(site);
    }

    public static String getSite() {
        return CONTEXT.get();
    }

    public static void clear() {
        CONTEXT.remove();
    }
//
//    @Value("${platform.default.site.id}")
//    public void setDEFAULT_TENANT_ID(String DEFAULT_TENANT_ID) {
//        this.DEFAULT_TENANT_ID = DEFAULT_TENANT_ID;
//    }
}