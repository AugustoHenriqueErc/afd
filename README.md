# 🚀 Simulador de Autômato Finito Determinístico (AFD) em Java

## 📌 Descrição
Este repositório contém uma aplicação desenvolvida em **Java** para simular o funcionamento de um **Autômato Finito Determinístico (AFD)**. O projeto permite definir estados, transições e testar se uma determinada cadeia de entrada é aceita pelo autômato.

## 📂 Estrutura do Projeto
```
📦 SimuladorAFD
├── 📁 src                 # Código-fonte do projeto
│   ├── Afd.java           # Classe principal do autômato
│   ├── State.java         # Representação de um estado
│   ├── main.java          # Classe principal para rodar a aplicação
├── README.md              # Este arquivo de documentação
└── .gitignore             # Arquivos e pastas ignoradas pelo Git
```

## ⚙️ Funcionalidades
✅ Definir estados e transições do autômato.  
✅ Configurar estado inicial e estados de aceitação.  
✅ Processar cadeias de entrada e verificar aceitação.  
✅ Simulação de um AFD que reconhece a linguagem `0(1)*0`.  

## 🛠️ Tecnologias Utilizadas
- Java (JDK 11+)
- Estruturas de dados como `ArrayList` e `HashMap`

## 🚀 Como Executar
### Pré-requisitos
- Ter o **Java** instalado (versão 11 ou superior).
- Um ambiente de desenvolvimento como **Eclipse, IntelliJ IDEA** ou utilizar o **terminal**.

### Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/simulador-afd.git
   cd simulador-afd
   ```
2. Compile o código:
   ```bash
   javac src/*.java -d bin
   ```
3. Execute a aplicação:
   ```bash
   java -cp bin main
   ```
4. Insira uma palavra para teste e veja se é aceita pelo autômato.

## 📜 Licença
Este projeto está sob a licença **MIT**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 🤝 Contribuições
Contribuições são bem-vindas! Para contribuir:
1. Faça um fork do projeto.
2. Crie uma nova branch: `git checkout -b minha-feature`
3. Commit suas mudanças: `git commit -m 'Minha nova feature'`
4. Envie para o repositório remoto: `git push origin minha-feature`
5. Abra um Pull Request.

