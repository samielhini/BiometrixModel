package com.creatrixinc.biometrix;

import java.util.UUID;

import com.creatrixinc.biometrix.xsd.biometrix.BiometrixRequestType;
import com.creatrixinc.biometrix.xsd.biometrix.CommandTypes;
import com.creatrixinc.biometrix.xsd.biometrix.IdentificationType;
import com.creatrixinc.biometrix.xsd.biometrix.Person;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

public class Test {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		BiometrixRequestType brt = new BiometrixRequestType();
		
		Person p = new Person();
		gov.niem.release.niem.proxy.xsd._3.String pIdUIDStr = new gov.niem.release.niem.proxy.xsd._3.String();
		IdentificationType pId = new IdentificationType();
		
		pIdUIDStr.setValue("473efc90-f254-453c-94ab-592aac3d363b");
		
		p.setPersonId(pId);
		p.getPersonId().getIdentificationID().add(pIdUIDStr);
		//p.getPersonId().getIdentificationID().add(pIdUIDStr);
		brt.setPerson(p);
		IdentificationType reqId = new IdentificationType();
		//reqId.setId(null);
		gov.niem.release.niem.proxy.xsd._3.String reqIdUIDStr = new gov.niem.release.niem.proxy.xsd._3.String();
		reqIdUIDStr.setValue(UUID.randomUUID().toString());
		reqId.getIdentificationID().add(reqIdUIDStr);
		
		brt.setRequestId(reqId);
		brt.setCommandType(CommandTypes.GET_PERSON);
		
		ObjectMapper om = new ObjectMapper();
		
		//JaxbAnnotationModule module = new JaxbAnnotationModule();
		// configure as necessary
		
		//om.registerModule(module);
		
		JaxbAnnotationIntrospector introspector = new JaxbAnnotationIntrospector(TypeFactory.defaultInstance(), true);
		// if ONLY using JAXB annotations:
		//mapper.setAnnotationIntrospector(introspector);
		// if using BOTH JAXB annotations AND Jackson annotations:

		introspector.setNameUsedForXmlValue("$");
		
		
		//AnnotationIntrospector secondary = new JacksonAnnotationIntrospector();
		//om.setAnnotationIntrospector(new AnnotationIntrospectorPair(introspector, secondary));
		om.setSerializationInclusion(Include.NON_NULL);
		
		//om = om.disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
		om.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
		//om = om.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		om.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, false);
		om.configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, true);
		om.enable(SerializationFeature.INDENT_OUTPUT);
		//int a = om.getSerializationConfig().getSerializationFeatures() & SerializationFeature.WRITE_NULL_MAP_VALUES.getMask(); 
		//System.out.println(om.getSerializationConfig().getSerializationFeatures() & a);
		//om.disable(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
		//om.enable(SerializationFeature.WRAP_ROOT_VALUE);
		om.setAnnotationIntrospector(introspector);
		
		
		// CANNOT USE THIS METHOD.  MUST FIND OUT HOW TO DEFINE $ IN PLACE VALUE
		System.out.println(om.writeValueAsString(brt));
		
		System.out.println(introspector.getNameUsedForXmlValue());
		
	}

}
