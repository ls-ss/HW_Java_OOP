import json
from typing import List
from model.phone_contact import PhoneContact as Contact

# Класс содержит методы для работы с json файлом
class JsonOperation:
    def __init__(self):
        self.contacts = []

    def read_from_json_file(self, filename: str):
        """
        Метод читает контакты из json-файла
        :param filename имя файла
        """

        self.contacts = []
        try:
            with open(filename, 'r') as f:
                data = json.load(f)
                for item in data:
                    contact = Contact(
                        item['firstname'], item['lastname'], item.get('numbers', []))
                    self.add_contact(contact)
                return self.contacts
        except IOError:
            print("Ошибка при открытии или чтении json-файла")
            return []

    def save_to_json_file(self, contacts: List[Contact], filename: str):
        """
        Метод сохраняет список контактов в файл json
        :param contacts Список контактов
        :param filename Строковое имя файла
        """
        try:
            with open(filename, 'w') as f:
                data = []
                for contact in contacts:
                    data.append({
                        'firstname': contact.firstname,
                        'lastname': contact.lastname,
                        'numbers': contact.numbers,
                    })
                json.dump(data, f)
        except IOError:
            print("Ошибка открытия или записи в файл json")

    def add_contact(self, contact):
        self.contacts.append(contact)
