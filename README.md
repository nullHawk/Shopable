![image](https://github.com/nullHawk/Shopable/assets/83297944/f21483b8-181b-4647-bece-b0be58642b28)# Shopable

Shopable is a backend system for shopping website made in SpringBoot and uses [Fake Store API](https://fakestoreapi.com/docs)

## Endpoints:

- **Get all carts** : `http://127.0.0.1:8080/carts`
- **Get single cart :** `http://127.0.0.1:8080/carts/{id}`
- **Get in date range** : `http://127.0.0.1:8080/carts?startdate=2019-12-10&enddate=2020-10-10`
- Get user cart: `http://127.0.0.1:8080/carts/user/{id}`
- Add new cart: `http://127.0.0.1:8080/carts` with POST Request

    ```json
    {
      "userId":3,
      "date":"2020-02-03",
      "products":[{"productId":1,"quantity":3}]
    }
    ```

- Update cart:  `http://127.0.0.1:8080/carts/{id}` with PUT Request

    ```json
    {
      "userId":3,
      "date":"2020-02-03",
      "products":[{"productId":2,"quantity":5}]
    }
    ```

- Delete cart:  `http://127.0.0.1:8080/carts/{id}` with DELETE Request

    ```json
    {
        "userId":3,
        "date":"2020-02-03",
        "products":[{"productId":2,"quantity":5}]
    }
    ```
##Screen Shots
- **Get all carts** :
 ![image](https://github.com/nullHawk/Shopable/assets/83297944/9610707e-4058-43d4-bf8e-52923965c772)

- **Get Single Cart** :
 ![image](https://github.com/nullHawk/Shopable/assets/83297944/9eca9755-8811-4490-96af-c11d0e80219c)

- **Get til Date** :
 ![image](https://github.com/nullHawk/Shopable/assets/83297944/97c3c186-8caf-48ed-8ade-a2800bf5a84b)

- **Add new Cart** :
 ![image](https://github.com/nullHawk/Shopable/assets/83297944/0eb43339-a5e5-4f23-adda-7eaae091c0ec)

- **Update Cart** :
![image](https://github.com/nullHawk/Shopable/assets/83297944/c4d02c0c-dfdd-4b38-875c-13ce724599c9)

- **Delete Cart**:
![image](https://github.com/nullHawk/Shopable/assets/83297944/0abb9749-9d01-44a1-8df6-cea596a5bf57)
  


> **Made with ❤️ By Suryansh Shakya during Exam**
