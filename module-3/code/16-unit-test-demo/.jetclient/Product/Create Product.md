```toml
name = 'Create Product'
method = 'POST'
url = 'http://localhost:8080/products'
sortWeight = 2000000
id = '60004f75-699c-4806-85be-4820fb7d6fba'

[body]
type = 'JSON'
raw = '''
{
  "id": 5,
  "title": "Macbook Mini M4",
  "category": "Laptop",
  "price": 250
}'''
```
