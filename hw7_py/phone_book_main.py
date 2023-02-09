# Реализовать свой проект на каком-то другом языке программирования

from controller.manage_phone_book import ManagePhoneBook

class PhoneBookMain:
    @staticmethod
    def main():
        manage_phone_book = ManagePhoneBook()
        manage_phone_book.start()


if __name__ == "__main__":
    PhoneBookMain.main()
