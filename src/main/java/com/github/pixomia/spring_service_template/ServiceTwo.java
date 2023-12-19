package com.github.pixomia.spring_service_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTwo {
    @Autowired
    private ServiceOne serviceOne;

    public String callOneOtherTwo() {
	return "callOneOtherTwo" + serviceOne.callOne();
    }
}
