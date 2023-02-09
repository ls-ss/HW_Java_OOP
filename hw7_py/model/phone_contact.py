from model.contact import Contact

# Класс представляет контакт в телефонной книге.
class PhoneContact(Contact):
    def __init__(self, firstname, lastname, numbers=None):
        super().__init__(firstname, lastname)
        self.numbers = numbers if numbers else []

    def add_number(self, number, tag):
        self.numbers.append({'number': number, 'tag': tag})

    def get_phones(self):
        return self.numbers

    def __str__(self):
        return "{} {} {}".format(self.get_firstname(), self.get_lastname(), self.numbers)
