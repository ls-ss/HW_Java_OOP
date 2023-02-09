from model.contact import Contact
from model.phone_contact import PhoneContact
from typing import List
from service.json_operation import JsonOperation

# Класс содержит методы для работы с телефонной книгой
class PhoneBookOperation():
    file_operation = JsonOperation()


    def add_contact(self, contact: Contact, filename: str):
        """
        Добавляет новый контакт в телефонную книгу.
        :param contact: добавить новый контакт
        :param filename: имя файла телефонной книги
        """
        contacts = self.file_operation.read_from_json_file(filename)
        contacts.append(contact)
        self.file_operation.save_to_json_file(contacts, filename)


    def find_by_number(self, number: str, filename: str) -> List[Contact]:
        """
        Поиск контактов по номеру.
        :param number: номер для поиска
        :param filename: имя файла телефонной книги
        :return: список контактов с указанным именем
        """

        contacts = self.file_operation.read_from_json_file(filename)
        result_list = []
        for contact in contacts:
            if isinstance(contact, PhoneContact):
                for phone in contact.get_phones():
                    if number in phone['number']:
                        result_list.append(contact)
        return result_list


    def find_by_name(self, name: str, filename: str) -> List[Contact]:
        """
        Поиск контактов по имени.
        :param name: имя для поиска
        :param filename: имя файла телефонной книги
        :return: список контактов с указанным именем
        """
        contacts = self.file_operation.read_from_json_file(filename)
        result_list = []
        for contact in contacts:
            if name in contact.get_firstname() or name in contact.get_lastname():
                result_list.append(contact)
        return result_list


    def remove_contact(self, contact: Contact, filename: str):
        """
        Удаляет контакт из телефонной книги.
        :param contact: контакт для удаления
        :param filename: имя файла телефонной книги
        """
        contacts: List[Contact] = self.file_operation.read_from_json_file(
            filename)
        for i in range(len(contacts)):
            if contacts[i].get_firstname() == contact.get_firstname() and contacts[i].get_lastname() == contact.get_lastname():
                contacts.pop(i)
                break
        self.file_operation.save_to_json_file(contacts, filename)
