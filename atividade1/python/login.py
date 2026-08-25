class Login:
    def __init__(self, nome, senha):
        self.nome = nome
        self.senha = senha

    def get_nome(self):
        return self.nome

    def get_senha(self):
        return self.senha

    def verifica_login(self, nome, senha):
        return self.nome == nome and self.senha == senha


if __name__ == "__main__":
    meu_login = Login("eduardo", "123")

    print(meu_login.verifica_login("carlos", "123"))