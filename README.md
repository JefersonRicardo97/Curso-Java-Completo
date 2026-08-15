# ☕ Meu Repositório de Estudos em Java

Bem-vindo ao meu repositório de estudos! Este espaço foi criado para documentar a minha evolução prática na linguagem Java, aplicando conceitos que vão desde a lógica fundamental até padrões avançados de Orientação a Objetos e boas práticas de desenvolvimento back-end.

*Cada linha de código escrita aqui representa o foco, a disciplina diária e a consistência na transição de carreira.*

---

## 🛠️ Tecnologias e Ferramentas Utilizadas
* **Linguagem Principal:** Java
* **IDE:** IntelliJ IDEA
* **Controle de Versão:** Git e GitHub

---

## 📚 O que já foi consolidado até aqui:
Acompanhando o curso de Java do **Professor Nélio Alves**, a base prática foi expandida para cobrir:

* **Lógica e Controle de Fluxo:** Entrada, processamento e saída com estruturas condicionais e laços de repetição (`for`, `while`).
* **Orientação a Objetos (POO Fundamental):** Classes, encapsulamento (`getters` e `setters`), sobrecarga de construtores e customização de `toString()`.
* **Gerenciamento de Memória e Coleções:**
    * Diferença entre Stack (variáveis primitivas/referências) e Heap (objetos).
    * Arrays/Vetores estruturados e Coleções dinâmicas com `List` e `ArrayList`.
* **Composição de Objetos:** Modelagem de relacionamentos do tipo "tem-um" (associação entre entidades independentes).
* **Herança e Reutilização:** Extensão de classes (`extends`), reaproveitamento de construtores e métodos com a palavra-chave `super`.
* **Polimorfismo e Sobrescrita:** Uso de `@Override` para executar comportamentos customizados em tempo de execução através de tipos genéricos.
* **Tipagem e Casting:** Aplicação de Upcasting (automático) e Downcasting na manipulação de coleções polimórficas.
* **Manipulação de Datas e Moedas:** Parsing e formatação de datas com `SimpleDateFormat` / `Date` e padronização monetária com `Locale.US`.
* **Blindagem de Entrada de Dados:** Controle do buffer do `Scanner` e conversões seguras com `Double.parseDouble` e `Integer.parseInt`.

---

## 📂 Projetos e Desafios em Destaque

### 1. Sistema de Gestão e Etiquetas de Produtos (`LojaProgram.java`)
Aplicação prática dos pilares de Herança e Polimorfismo:
* **Entidade Base (`Produtos`):** Regra padrão de precificação e exibição de etiqueta.
* **Subclasse Importados (`ProdutosImportados`):** Adição de taxas alfandegárias e recálculo do valor total sobrescrevendo `etiquetaDePreco()`.
* **Subclasse Usados (`ProdutosUsados`):** Integração com `Date` e `SimpleDateFormat` para inclusão da data de fabricação formatada.
* **Polimorfismo em Coleção:** Varredura em uma única lista genérica `List<Produtos>` gerando etiquetas personalizadas dinamicamente.

### 2. Folha de Pagamentos e Terceirizados (`Funcionario.java` / `FuncionarioTercerizado.java`)
* Cálculo polimórfico de pagamento com reaproveitamento de lógica da superclasse (`super.pagamento()`) e acréscimo de bônus sobre custos adicionais.

### 3. O Desafio do Pensionato (`DesafioPensionato.java`)
* Mapeamento de quartos com vetores de objetos, checagem de referências `null` e geração de relatórios de ocupação.

---

## 🎯 Trilha de Aprendizado e Próximos Passos
* [x] Estruturas Condicionais e de Repetição
* [x] Introdução à POO e Arrays de Objetos
* [x] Memória, Listas (`ArrayList`) e Comportamento de Objetos
* [x] Manipulação de Datas (`Date`, `SimpleDateFormat`, `Calendar`)
* [x] Herança, Polimorfismo e Casting
* [ ] Classes e Métodos Abstratos
* [ ] Tratamento de Exceções (`try-catch`, exceções personalizadas)
* [ ] Leitura e Escrita de Arquivos (`File`, `Scanner`, `BufferedWriter`)
* [ ] Interfaces

---
*Disposto a aprender, evoluir e focado na consistência diária. A persistência sempre vence o cansaço.*