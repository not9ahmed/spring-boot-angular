```toml
name = 'Create Product'
method = 'POST'
url = 'http://localhost:8080/products'
sortWeight = 1000000
id = '7c95ea0d-831f-4a3a-b57b-b9bb23f97d18'

[body]
type = 'JSON'
raw = '''
{
  "title": "MacBook Air M4",
  "category": "Laptop",
  "price": 300
}'''
```
