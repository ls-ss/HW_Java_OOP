import csv
from model.contact import Contact
from model.phone_contact import PhoneContact
from model.enums.tag import Tag
import xml.etree.ElementTree as ET
from typing import List

# Класс содержит метод для работы с файлом .xml
class XmlOperation:
    # Метод сохраняет список контактов в файл .xml
    def save_to_xml_file(self, contacts: List[Contact], filename: str):
        root = ET.Element("contacts")
        for contact in contacts:
            contact_element = ET.SubElement(root, "contact")
            ET.SubElement(contact_element,
                          "firstname").text = contact.get_firstname()
            ET.SubElement(contact_element,
                          "lastname").text = contact.get_lastname()
            if isinstance(contact, PhoneContact):
                numbers_element = ET.SubElement(contact_element, "numbers")
                for number in contact.get_phones():
                    number_element = ET.SubElement(numbers_element, "number")
                    ET.SubElement(number_element,
                                  "value").text = number["number"]
                    ET.SubElement(number_element, "tag").text = number["tag"]
        tree = ET.ElementTree(root)
        tree.write(filename, xml_declaration=True,
                   encoding='utf-8', method="xml")
