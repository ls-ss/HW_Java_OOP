import os
from model.enums.tag import Tag

# Класс содержит основные методы работы с меню
class Menu:
    # Метод очистки консоли (кроссплатформенный)
    def clear(self):
        os.system('cls' if os.name == 'nt' else 'clear')

    # Метод показывает главное меню на консоли
    def show_menu(self):
        while True:
            print("Пункты меню:")
            print("1 - Смотреть телефонную книгу")
            print("2 - Добавить контакт")
            print("3 - Найти по номеру")
            print("4 - Найти по имени")
            print("5 - Удалить контакт")
            print("6 - Сохранить книгу в XML")
            print("0 - Выход")
            action = input("Выберите пункт: ")
            if action in ["0", "1", "2", "3", "4", "5", "6"] and len(action) == 1:
                return action

    """ Метод показывает контакты в консоле
        :param contact List of contacts """
    def show_contacts(self, contacts):
        if contacts == []:
            print("Список контактов пуст")
        for i, contact in enumerate(contacts):
            print("#: {} {}".format(i + 1, contact))

    # Метод показывает теги телефонных номеров
    def show_tags(self):
        tags = {i: tag for i, tag in enumerate(Tag.__members__.values())}
        return tags

    # Метод получает значения в Контакты
    def get_contacts_values(self):
        values = {}
        values["firstname"] = input("Введите имя: ")
        values["lastname"] = input("Введите фамилию: ")
        values["numbers"] = []
        while True:
            print("(Enter: ввод или завершить)")
            number = input("Введите номер телефона: ")
            if number == "":
                break
            print(self.show_tags())
            tag = int(input("Введите номер тэга: "))
            values["numbers"].append({
                "number": number,
                "tag": self.show_tags()[tag]
            })
        return values
