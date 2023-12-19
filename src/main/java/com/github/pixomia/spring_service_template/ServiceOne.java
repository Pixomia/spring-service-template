package com.github.pixomia.spring_service_template;

import org.springframework.stereotype.Service;

import com.github.pixomia.util.PixomiaIdUtils;

@Service
public class ServiceOne {

    public String callOne() {
	return "callOne" + PixomiaIdUtils.genHumandReadableId();
    }

}
