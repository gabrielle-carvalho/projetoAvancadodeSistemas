from login import Login

class LoginEspecial(Login):
    def __init__(self, nome, senha, dica):
        super().__init__(nome, senha)
        self.__dica = dica

    def get_dica(self):
        return self.__dica

    def set_dica(self, dica):
        self.__dica = dica


if __name__ == "__main__":
    meu_login: Login = LoginEspecial("eduardo", "123", "dica")
    print(meu_login.get_dica())
