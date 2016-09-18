package ManageEmployee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import ManageContact.Contact;

public class MainEmployee {

	private static Scanner sc = new Scanner(System.in);
	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"dd/MM/yyyy");

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException, NumberFormatException, ParseException {
		// TODO Auto-generated method stub

		List<Department> listDepartment = new ArrayList<>();
		List<Employee> listEmployee = new ArrayList<>();
		String pathDepartment = "src/ManageEmployee/department.xml";
		String pathEmployee = "src/ManageEmployee/employee.xml";
		readNodeListDepartment(pathDepartment, listDepartment);
		readNodeListEmployee(pathEmployee, listEmployee);

		int choose = 0;
		String chooseDepartment = "";

		try {
			do {
				System.out
						.println("1/Show list employee\n2/Add new employee\n3/Exit");
				choose = sc.nextInt();
				sc.nextLine();

				switch (choose) {
				case 1:
					System.out.println("LIST DEPARTMENT:");
					if (listDepartment.isEmpty() == true)
						System.out.println("List is empty!");
					else {
						for (int i = 0; i < listDepartment.size(); i++) {
							System.out.println((i + 1) + "/ "
									+ listDepartment.get(i).getName());
						}
						chooseDepartment = sc.nextLine();

						System.out.println("LIST EMPLOYEE");
						boolean flag = false;
						for (Employee employee : listEmployee) {
							if (employee.getIdDepartment().compareToIgnoreCase(
									chooseDepartment) == 0) {
								employee.showInformation();
								System.out
										.println("Department: "
												+ listDepartment
														.get(Integer
																.parseInt(chooseDepartment))
														.getName());
								System.out.println();
								flag = true;
							}
						}
						if (flag == false)
							System.out.println("List is empty!");
					}
					break;
				case 2:
					System.out.println("LIST DEPARTMENT:");
					if (listDepartment.isEmpty() == true)
						System.out.println("List is empty!");
					else {
						for (int i = 0; i < listDepartment.size(); i++) {
							System.out.println((i + 1) + "/ "
									+ listDepartment.get(i).getName());
						}
						chooseDepartment = sc.nextLine();

						System.out.println("INPUT EMPLOYEE'S INFORMATION:");
						System.out.println("Input name:");
						String name = sc.nextLine();
						System.out.println("Input sex:");
						String sex = sc.nextLine();
						System.out.println("Input birth date:");
						String birthDate = sc.nextLine();
						System.out.println("Input salary:");
						double salary = sc.nextDouble();
						sc.nextLine();
						System.out.println("Input address:");
						String address = sc.nextLine();

						Employee employee = new Employee(name, sex,
								dateFormat.parse(birthDate), salary, address,
								chooseDepartment);
						
						if(listEmployee.add(employee))
							System.out.println("Employee is saved!");
					}
					break;
				default:
					break;
				}
				
				saveListEmployeeToNodeList(pathEmployee, listEmployee);
			} while (choose != 3);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

	public static void readNodeListDepartment(String pathDepartment,
			List<Department> listDepartment)
			throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		File xmlFile = new File(pathDepartment);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("department");
		if (nodeList != null) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					String idDepartment = element
							.getElementsByTagName("idDepartment").item(0)
							.getTextContent();
					String name = element.getElementsByTagName("name").item(0)
							.getTextContent();
					Department department = new Department(idDepartment, name);
					listDepartment.add(department);

				}
			}
		}
	}

	public static void readNodeListEmployee(String pathEmployee,
			List<Employee> listEmployee) throws ParserConfigurationException,
			SAXException, IOException, NumberFormatException, ParseException {
		// TODO Auto-generated method stub
		File xmlFile = new File(pathEmployee);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("employee");
		if (nodeList != null) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					String name = element.getElementsByTagName("name").item(0)
							.getTextContent();
					String sex = element.getElementsByTagName("sex").item(0)
							.getTextContent();
					String birthDate = element
							.getElementsByTagName("birthDate").item(0)
							.getTextContent();
					String salary = element.getElementsByTagName("salary")
							.item(0).getTextContent();
					String address = element.getElementsByTagName("address")
							.item(0).getTextContent();
					String idDepartment = element
							.getElementsByTagName("idDepartment").item(0)
							.getTextContent();
					Employee employee = new Employee(name, sex,
							dateFormat.parse(birthDate),
							Double.parseDouble(salary), address, idDepartment);
					listEmployee.add(employee);

				}
			}
		}
	}
	
public static void saveListEmployeeToNodeList(String path, List<Employee> listEmployee) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException, TransformerException {
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument();
		
		Element rootElement = doc.createElement("department");
    	doc.appendChild(rootElement);
    	
    	for (Employee employee : listEmployee) {
    		Element elementEmployee = doc.createElement("employee");
    		rootElement.appendChild(elementEmployee);
    		
    		Element elementName = doc.createElement("name");
    		elementName.appendChild(doc.createTextNode(employee.getName()));
    		elementEmployee.appendChild(elementName);
    		
    		Element elementSex = doc.createElement("sex");
    		elementSex.appendChild(doc.createTextNode(employee.getSex()));
    		elementEmployee.appendChild(elementSex);
    		
    		Element elementBirthDate = doc.createElement("birthDate");
    		elementBirthDate.appendChild(doc.createTextNode(dateFormat.format(employee.getBirthDate())));
    		elementEmployee.appendChild(elementBirthDate);
    		
    		Element elementSalary = doc.createElement("salary");
    		elementSalary.appendChild(doc.createTextNode(employee.getSalary() + ""));
    		elementEmployee.appendChild(elementSalary);
    		
    		Element elementAddress = doc.createElement("address");
    		elementAddress.appendChild(doc.createTextNode(employee.getAddress()));
    		elementEmployee.appendChild(elementAddress);
    		
    		Element elementIDDepartment = doc.createElement("idDepartment");
    		elementIDDepartment.appendChild(doc.createTextNode(employee.getIdDepartment()));
    		elementEmployee.appendChild(elementIDDepartment);
		}
       
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(path));
		
		transformer.transform(source, result);
	}
}
