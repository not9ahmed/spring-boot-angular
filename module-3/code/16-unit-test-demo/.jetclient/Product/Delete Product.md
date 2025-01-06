```toml
name = 'Delete Product'
method = 'DELETE'
url = 'http://localhost:8080/products/2'
sortWeight = 5000000
id = '733f88bd-5209-4f2a-a2be-2d38ceef9548'

[body]
type = 'JSON'
raw = '''
{
  "id": 3,
  "title": "Macbook Mini M4",
  "category": "Smartphone",
  "price": 250
}'''
```
