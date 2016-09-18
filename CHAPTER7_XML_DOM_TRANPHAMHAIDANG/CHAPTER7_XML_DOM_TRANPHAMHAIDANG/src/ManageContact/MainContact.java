package ManageContact;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MainContact {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub

		List<Contact> listContact = new ArrayList<>();
		String path = "src/ManageContact/contact.xml";
		readNodeList(path, listContact);
		int choose = 0;

		try {
			do {
				System.out
						.println("1/Show list contact\n2/Add new contact\n3/Search contact\n4/Delete contact\n5/Update contact\n6/Exit");
				choose = sc.nextInt();
				System.out.println();

				boolean flag = false;
				switch (choose) {
				case 1:
					Collections.sort(listContact);
					System.out.println("LIST CONTACT\n");
					if (listContact.isEmpty() == true)
						System.out.println("List is empty!");
					else {
						for (Contact contact : listContact) {
							contact.showInformation();
							System.out.println();
						}
					}
					break;
				case 2:
					sc.nextLine();
					System.out.println("INPUT CONTACT'S INFORMATION\n");
					System.out.println("Input name:");
					String name = sc.nextLine();
					System.out.println("Input phone number:");
					String phoneNumber = sc.nextLine();

					listContact.add(new Contact(name, phoneNumber));
					addContactToNodeList(path, new Contact(name, phoneNumber));
					break;
				case 3:
					sc.nextLine();
					System.out.println("Input name:");
					String nameSearch = sc.nextLine();

					flag = false;
					for (Contact contact : listContact) {
						if (contact.getName().compareToIgnoreCase(nameSearch) == 0) {
							contact.showInformation();
							System.out.println();
							flag = true;
						}
					}

					if (flag == false)
						System.out.println("Contact is not found!");
					break;
				case 4:
					sc.nextLine();
					System.out.println("1/Name\n2/Phone number");
					int chooseDeleteMethod = sc.nextInt();

					sc.nextLine();
					Contact contactTemp = null;
					switch (chooseDeleteMethod) {
					case 1:
						System.out.println("Input name:");
						String nameDelete = sc.nextLine();

						flag = false;
						for (int i = 0; i < listContact.size(); i++) {
							if (listContact.get(i).getName().compareToIgnoreCase(nameDelete) == 0) {
								listContact.get(i).showInformation();
								System.out.println();

								System.out
										.println("Do you want to delete this contact? (y / n)");
								String chooseDelete = sc.nextLine();

								if (chooseDelete.compareToIgnoreCase("y") == 0) {
									if(listContact.remove(i) != null)
									{
										System.out.println("Contact is deleted!");
										i--;
									}
								}
								System.out.println();
								flag = true;
							}
						}
						break;
					case 2:
						System.out.println("Input phone number:");
						String phoneNumberDelete = sc.nextLine();

						flag = false;
						for (int i = 0; i < listContact.size(); i++) {
							if (listContact.get(i).getPhoneNumber().compareToIgnoreCase(
									phoneNumberDelete) == 0) {
								listContact.get(i).showInformation();
								System.out.println();

								System.out
										.println("Do you want to delete this contact? (y / n)");
								String chooseDelete = sc.nextLine();

								if (chooseDelete.compareToIgnoreCase("y") == 0) {
									if(listContact.remove(i) != null)
									{
										System.out.println("Contact is deleted!");
										i--;
									}
								}
								System.out.println();
								flag = true;
							}
						}
						break;
					default:
						break;
					}
					if (flag == false)
						System.out.println("Contact is not found!");
					break;
				case 5:
					sc.nextLine();
					System.out.println("Input name:");
					String nameUpdate = sc.nextLine();

					flag = false;
					for (Contact contact : listContact) {
						if (contact.getName().compareToIgnoreCase(nameUpdate) == 0) {
							contact.showInformation();
							System.out.println();

							System.out
									.println("Do you want to update this contact? (y / n)");
							String chooseUpdate = sc.nextLine();

							if (chooseUpdate.compareToIgnoreCase("y") == 0) {
								System.out
										.println("1/Update name\n2/Update phone number");
								int chooseUpdateMethod = sc.nextInt();

								sc.nextLine();
								switch (chooseUpdateMethod) {
								case 1:
									System.out.println("Input new name:");
									String nameNew = sc.nextLine();

									contact.setName(nameNew);
									System.out.println("Name is saved!");
									break;
								case 2:
									System.out
											.println("Input new phone number:");
									String phoneNumberNew = sc.nextLine();

									contact.setPhoneNumber(phoneNumberNew);
									System.out
											.println("Phone number is saved!");
									break;
								default:
									break;
								}
							}
							System.out.println();
							flag = true;
						}
					}

					if (flag == false)
						System.out.println("Contact is not found!");
					break;
				default:
					break;
				}
				
				saveListContactToNodeList(path, listContact);
				System.out.println();
			} while (choose != 6);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

	public static void readNodeList(String path, List<Contact> listContact)
			throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		File xmlFile = new File(path);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("contact");
		if(nodeList != null)
		{
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if(node.getNodeType() == Node.ELEMENT_NODE)
				{
					Element element = (Element) node;
					String name = element.getElementsByTagName("name").item(0).getTextContent();
					String phoneNumber = element.getElementsByTagName("phoneNumber").item(0).getTextContent();
					Contact contact = new Contact(name, phoneNumber);
					listContact.add(contact);
					
				}
			}
		}
	}
	
	public static void addContactToNodeList(String path, Contact contact) throws ParserConfigurationException, TransformerException, FileNotFoundException, SAXException, IOException {
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument();
		Element rootElement;
		
        File xmlFile = new File(path);
        if (xmlFile.isFile()) {
            doc = docBuilder.parse(new FileInputStream(xmlFile));
            doc.getDocumentElement().normalize();
            rootElement = doc.getDocumentElement();           
        }
        else {
        	rootElement = doc.createElement("contacts");
    		doc.appendChild(rootElement);
        }
		
		Element elementContact = doc.createElement("contact");
		rootElement.appendChild(elementContact);
		
		Element elementName = doc.createElement("name");
		elementName.appendChild(doc.createTextNode(contact.getName()));
		elementContact.appendChild(elementName);
		
		Element elementPhoneNumber = doc.createElement("phoneNumber");
		elementPhoneNumber.appendChild(doc.createTextNode(contact.getPhoneNumber()));
		elementContact.appendChild(elementPhoneNumber);
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(path));
		
		transformer.transform(source, result);
	}

	public static void saveListContactToNodeList(String path, List<Contact> listContact) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException, TransformerException {
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument();
		
		Element rootElement = doc.createElement("contacts");
    	doc.appendChild(rootElement);
    	
    	for (Contact contact : listContact) {
    		Element elementContact = doc.createElement("contact");
    		rootElement.appendChild(elementContact);
    		
    		Element elementName = doc.createElement("name");
    		elementName.appendChild(doc.createTextNode(contact.getName()));
    		elementContact.appendChild(elementName);
    		
    		Element elementPhoneNumber = doc.createElement("phoneNumber");
    		elementPhoneNumber.appendChild(doc.createTextNode(contact.getPhoneNumber()));
    		elementContact.appendChild(elementPhoneNumber);
		}
       
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(path));
		
		transformer.transform(source, result);
	}
}
