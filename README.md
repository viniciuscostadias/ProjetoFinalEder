# Projeto de Sistema em Java ☕ com Interface Gráfica e Banco de Dados Local 🐬💾

## Descrição do Projeto 💻
Este projeto é um sistema em Java que fornece uma interface gráfica para gerenciamento de usuários e clientes. O sistema inclui funcionalidades como tela de login, cadastro de usuários, cadastro de clientes e uma agenda para registro de compromissos.

## Sumário
- [Descrição do Projeto](#descrição-do-projeto)
- [Arquitetura do Sistema](#arquitetura-do-sistema-%EF%B8%8F)
- [Diagrama de Arquitetura](#diagrama-de-arquitetura)
- [Instruções de Execução](#instruções-de-execução-%EF%B8%8F)
- [Considerações Finais](#considerações-finais-)

## Arquitetura do Sistema 🏗️
A arquitetura do sistema é composta por três camadas principais:

1. **Apresentação**: Utiliza Java Swing ou JavaFX para criar a interface gráfica do usuário.
2. **Lógica de Negócios**: Contém as regras de negócios do sistema e manipula os dados.
3. **Persistência de Dados**: Interage com o banco de dados MySQL para armazenar e recuperar informações.

### Diagrama de Arquitetura
                                                   
                           
        Interface 🌐        ------>          Lógica de Negócios ⚙️        ------>          Banco de Dados  📊                            
🔲☕ (Java Swing/FX) 🔲☕                    ☕ (Java) ☕                              🐬💾 (MySQL) 🐬💾

           
### Instruções de Execução ▶️         

1 - Obtenha:

 - Java JDK 8+
 - Netbeans IDE 8.2
- MySQL Connector/J
- MySQL Server 8+
- MySQL Workbench

2 - Abra o powershell:
           
No seu computador, abra o PowerShell.

3 - Verifique as pastas:

Digite o comando para listar as pastas:
 ```bash
ls
```
4 - Navegue até a pasta desejada:

Escolha a pasta onde deseja clonar o repositório:
 ```bash
cd pasta-exemplo
```
5 - Clone o repositório:

Execute o comando para clonar o repositório:
 ```bash
git clone https://github.com/viniciuscostadias/ProjetoFinalEder.git
```
6 - Abra o NetBeans:

Inicie o NetBeans IDE.

7 - Abra o projeto:

No canto superior esquerdo, clique em "Arquivo".

8 - Selecione "Abrir Projeto":

Navegue até o diretório onde você clonou o repositório e selecione o projeto para abri-lo.

### Considerações Finais 📝

Certifique-se de que todos os requisitos estão instalados e configurados corretamente.

Se você encontrar algum erro durante a execução, verifique se o MySQL Server está rodando e se o MySQL Connector/J está devidamente configurado no seu projeto.
