from model.phone_contact import PhoneContact
from model.enums.tag import Tag
from model.phone_contact import PhoneContact as Contact

# Класс содержит методы разбора значений для контактов
class Parser:
    @staticmethod
    def map_to_contact(values: dict) -> 'PhoneContact':
        """
        Метод создает контакт из значений словаря
        :param значения словаря
        """

        phone_numbers = []
        if 'numbers' in values:
            for phone_number_values in values['numbers']:
                phone_numbers.append({
                    'number': str(phone_number_values['number']),
                    'tag': str(phone_number_values['tag'])
                })
        return PhoneContact(
            str(values['firstname']),
            str(values['lastname']),
            phone_numbers
        )

    @staticmethod
    def get_dict_from_contact(contact: 'Contact') -> dict:
        """
        Метод создает словарь из контактов
        :param значения словаря
        """

        return {
            'id': str(contact.get_id()),
            'firstname': contact.get_firstname(),
            'lastname': contact.get_lastname(),
        }

    @staticmethod
    def get_tag_by_object(o) -> 'Tag':
        for tag in Tag:
            if str(o) == tag.name:
                return tag
        return Tag.PRIVATE
