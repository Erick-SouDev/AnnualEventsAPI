# AnnualEventsAPI
api para consultar quantos feriado tem no ano e as data 


### Teste Feito No Postaman
![imagem-teste-api](https://github.com/Erick-SouDev/AnnualEventsAPI/assets/139890795/92edeb33-c405-428a-ad8b-2a285dee0c39)


## Technologies Used

- Java
- Spring Boot
- Jackson (for JSON handling)
- ModelMapper (for object mapping)
- Maven (for project management)

## How to Build and Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/seu-usuario/HolidaysAPI.git
   cd HolidaysAPI
mvn clean install

java -jar target/HolidaysAPI.jar


### A API será acessível em por padrão.http://localhost:8080

### Pontos de extremidade da API
GET /holidays/{year}: Obtenha uma lista de feriados para o ano especificado.
Uso
Faça uma solicitação GET para recuperar feriados de um ano específico:


curl http://localhost:8080/holidays/2023

### Formato da resposta
A API retorna uma matriz JSON contendo informações de feriado, com cada objeto tendo propriedades como , , etc.namedate


[
  {
    "name": "New Year's Day",
    "date": "2023-01-01",
    // Other properties
  },
  // Other holidays
]

