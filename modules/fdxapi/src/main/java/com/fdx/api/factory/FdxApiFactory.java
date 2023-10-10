package com.fdx.api.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fdx.api.adapter.service.ServiceAdapterApi;


@Component
public class FdxApiFactory {

	ServiceAdapterApi<?> schemaService;

	@Autowired
	BeanFactory beans;

	public ServiceAdapterApi<?> getBean(String version) {
		schemaService = beans.getBean(version, ServiceAdapterApi.class);
		return schemaService;
	}
}
