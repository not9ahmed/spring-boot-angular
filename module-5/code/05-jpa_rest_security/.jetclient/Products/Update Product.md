```toml
name = 'Update Product'
method = 'PUT'
url = 'http://localhost:8080/products/5'
sortWeight = 4000000
id = 'a940bfcf-ffcc-4413-a053-068d1bb7f2ad'

[auth.basic]
username = 'user'
password = 'user123'

[body]
type = 'JSON'
raw = '''
{
  "title": "RTX 4080 Updated",
  "category": "PC",
  "price": 250.0
}'''
```
