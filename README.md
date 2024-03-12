# Shopable

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

> **Made with ❤️ By Suryansh Shakya during Exam**
