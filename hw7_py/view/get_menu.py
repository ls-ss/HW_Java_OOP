# Класс содержит метод для получения значений
class GetMenu:

    def get_value(self, message):
        print(f"{message}: ", end="")
        return input()
