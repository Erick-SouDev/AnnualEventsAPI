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
   git clone https://github.com/seu-usuario/AnnualEventsAPI.git
   cd AnnualEventsAPI
mvn clean install

java -jar target/AnnualEventsAPI.jar


### A API será acessível em por padrão.http://localhost:8080

### Pontos de extremidade da API
GET http://localhost:8080/api/feriado/nacional/{year}: Obtenha uma lista de feriados para o ano especificado.


### Formato da resposta
A API retorna uma matriz JSON contendo informações de feriado, com cada objeto tendo propriedades como  , etc.name date


[
  {
    "name": "New Year's Day",
    "date": "2023-01-01",
    // Other properties
  },
  // Other holidays
]

