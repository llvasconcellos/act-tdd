# act-tdd
Academia Chaordic TDD

# Dependencias

Este projeto depende de Java7 e Gradle.  
A versão utilizada do **gradle** é a **2.4**. Você pode instalá-la através do *gradle wrapper* executando o comando
```bash
./gradlew
```
Usuários do windows podem utilizar o ``gradlew.bat``.

# Gradle

Para utilizar o gradle basta executar, no diretório raiz da aplicação, o comando

```bash
./gradlew <task>
```

O gradle possui as seguintes tasks:

* eclipse - gera arquivos de configuração para importar o projeto no Eclipse IDE
* idea - gera arquivos de configuração para importar o projeto no IntelliJ IDE
* clean - limpa os arquivos compilados
* build - compila o código, executando os testes de unidade
* test - executa os testes de unidade
* watch - vigia o diretório `src/` e executa os testes quando alguma altereção for detectada
