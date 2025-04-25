# Projeto - Avaliação 1 de Arquitetura Web

Repositório criado para a **Avaliação 1 da disciplina de Arquitetura Web**.

Este projeto é baseado na API desenvolvida durante as aulas, com adaptações para atender às exigências da avaliação proposta.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.5**
- **Maven**
- **MariaDB** (via XAMPP)
- **VSCode**
- **XAMPP**

---

## 🛠️ Dependências

- Spring Web  
- Spring Boot DevTools  
- Spring Data JPA  
- Spring Data MongoDB  
- Lombok  
- MariaDB Driver  

---

## 🔧 Configurações Especiais

⚠️ **Porta do banco de dados alterada para `3307`**  
Motivo: Porta padrão (`3306`) estava indisponível.  
Ajuste realizado no:
- XAMPP
- MariaDB
- `application.yml`

**Usuário padrão do banco de dados:**  
`root` (sem senha)

---

## 📡 Endpoints (Postman)

- Produtos: [http://localhost:8080/produto](http://localhost:8080/produto)  
- Categorias: [http://localhost:8080/categoria](http://localhost:8080/categoria)

---

## ✅ Como rodar o projeto

1. Certifique-se de que o banco MariaDB está ativo na porta **3307**.
2. Use a pasta **`Av1ArquiteturaWeb/democrud`**.
3. Compile e rode o projeto com Maven pelo VSCode.
4. Utilize os endpoints com o Postman para testar as funcionalidades da API.

---

## 📜 English

# Project - Evaluation 1 of Web Architecture

Repository created for **Evaluation 1 of the Web Architecture course**.

This project is based on the API developed during classes, with adaptations to meet the evaluation requirements.

---

## 🚀 Technologies Used

- **Java 21**
- **Spring Boot 3.4.5**
- **Maven**
- **MariaDB** (via XAMPP)
- **VSCode**
- **XAMPP**

---

## 🛠️ Dependencies

- Spring Web  
- Spring Boot DevTools  
- Spring Data JPA  
- Spring Data MongoDB  
- Lombok  
- MariaDB Driver  

---

## 🔧 Special Configurations

⚠️ **Database port changed to `3307`**  
Reason: The default port (`3306`) was unavailable.  
The change was made in:
- XAMPP
- MariaDB
- `application.yml`

**Default database user:**  
`root` (no password)

---

## 📡 Endpoints (Postman)

- Product: [http://localhost:8080/produto](http://localhost:8080/produto)  
- Category: [http://localhost:8080/categoria](http://localhost:8080/categoria)

---

## ✅ How to Run the Project

1. Make sure MariaDB is running on **port 3307**.
2. Use the **`Av1ArquiteturaWeb/democrud`** folder.
3. Compile and run the project using Maven in VSCode.
4. Use Postman to test the API endpoints.

---


