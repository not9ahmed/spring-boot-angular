```toml
name = 'Update Product'
method = 'PUT'
url = 'http://localhost:8080/products/2'
sortWeight = 4000000
id = 'd66ac773-ca33-4f3e-bd76-948c4e58f26b'

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
