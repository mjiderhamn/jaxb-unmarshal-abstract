package jaxb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import base.ListOfSomethingType;
import foo.ObjectFactory;
import foo.SubType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SubstitutionGroupTest {
  
  private void marshalUnmarshal(JAXBContext jaxbContext) throws JAXBException {
    // Marshal
    final ObjectFactory factory = new ObjectFactory();
    ListOfSomethingType input = new ListOfSomethingType();
    input.getMybase().add(factory.createSub(factory.createSubType()));

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    jaxbContext.createMarshaller().marshal(input, baos);

    // Unmarshal 
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ListOfSomethingType output = (ListOfSomethingType) jaxbContext.createUnmarshaller().unmarshal(bais);
    assertNotNull("Root unmarshalled", output);
    assertEquals("One child", 1, output.getMybase().size());
    assertNotNull("Child non-null", output.getMybase().get(0).getValue());
  }

  @Test
  public void contextPaths() throws JAXBException {
    marshalUnmarshal(JAXBContext.newInstance("base:foo"));
  }

  @Test
  public void objectFactories() throws JAXBException {
    marshalUnmarshal(JAXBContext.newInstance(base.ObjectFactory.class, foo.ObjectFactory.class));
  }

  // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  // This one will fail!
  @Test
  public void classes() throws JAXBException {
    marshalUnmarshal(JAXBContext.newInstance(ListOfSomethingType.class, SubType.class));
  }

}