package com.fdx.api.model51.model;

import java.util.List;

import com.fdx.common.exception.FDXException;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxDataList51<T> {

	T getTaxForms(List<Integer> taxYears, List<String> taxForms, List<String> contentTypes, String uriPath, String resultType, String query) throws FDXException;

	Object getTaxFormsById(String taxFormId, Object accept) throws FDXException;

	String getStringValueOfTaxForms(List<String> taxForms) throws FDXException;

	String getStringValueOfContentTypes(List<String> contentTypes) throws FDXException;
}
