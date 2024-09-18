/*
 * package core.java.examples.io;
 * 
 * 
 * 
 * import java.io.File;
 * 
 * import javax.xml.parsers.DocumentBuilder; import
 * javax.xml.parsers.DocumentBuilderFactory; import
 * javax.xml.parsers.DocumentBuilder;
 * 
 * import org.w3c.dom.Document; import org.w3c.dom.Node; import
 * org.w3c.dom.NodeList;
 * 
 * public class XMLReading {
 * 
 * public static void main(String[] args) throws Exception {
 * 
 * 
 * 
 * File xmlFile = new File(System.getProperty("user.dir")+"//pom.xml");
 * 
 * DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 * DocumentBuilder builder = factory.newDocumentBuilder();
 * 
 * // Parse the XML file Document document = builder.parse(xmlFile);
 * System.out.println( "Root element: " +
 * document.getDocumentElement().getNodeName());
 * 
 * // Access elements by tag name NodeList nodeList =
 * document.getElementsByTagName("project"); for (int i = 0; i <
 * nodeList.getLength(); i++) { Node node = nodeList.item(i);
 * System.out.println("Element Content: " + node.getTextContent()); }
 * 
 * } }
 */