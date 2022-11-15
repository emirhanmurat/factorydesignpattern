package com.company;
/*
student number: b201202043
Name: m. emirhan
Surname: murat
 */

import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {
	StudentInfo studentInfo=new StudentInfo("1","emirhan","murat");
    SerializerFactory serializerFactory=new SerializerFactory();

    GenericSerialize genericSerialize1=serializerFactory.getType("json");
    genericSerialize1.serializeData(studentInfo);
    GenericSerialize genericSerialize2=serializerFactory.getType("xml");
    genericSerialize2.serializeData(studentInfo);



    }
}
